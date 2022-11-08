package be.intecbrussel.leaguedle;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

        try {

            URL url = new URL("http://ddragon.leagueoflegends.com/cdn/12.21.1/data/en_US/champion.json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Check if connect is made
            int responseCode = conn.getResponseCode();

            // 200 OK
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                //Close the scanner
                scanner.close();



                //JSON simple library Setup with Maven is used to convert strings to JSON
                JSONParser parse = new JSONParser();
                JSONObject dataObject = (JSONObject) parse.parse(String.valueOf(informationString));


                // get all data
                JSONObject api = (JSONObject) dataObject.get("data");

                // get data from ekko
                //System.out.println(api.get("Ekko"));

                // get data from ekko and print stats
                JSONObject ekko = (JSONObject) api.get("Ekko");
               // System.out.println(ekko.get("stats"));

                JSONObject syndra = (JSONObject) api.get("Syndra");
                System.out.println(syndra.get("partype"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}