/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author ctmar
 */
public class Services {

    public String datosAPI(String json) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create("https://bigml.io/andromeda/prediction?username=bryanbenavente;api_key=6bdd6d1dbf8ac8a270e56896062c3083555bfcc8"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Services services = new Services();
        String json = "{\n"
                + "    \"model\": \"logisticregression/5f24ad002fb31c2967005efa\",\n"
                + "    \"input_data\" : {\n"
                + "        \"age\": 60 ,\n"
                + "        \"anaemia\": 1,\n"
                + "        \"creatinine_phosphokinase\": 610,\n"
                + "        \"diabetes\": 0,\n"
                + "        \"ejection_fraction\": 38,\n"
                + "        \"high_blood_pressure\": 0,\n"
                + "        \"platelets\": 10000,\n"
                + "        \"serum_creatinine\": 20,\n"
                + "        \"serum_sodium\": 136  ,\n"
                + "        \"sex\": 0,\n"
                + "        \"smoking\": 1\n"
                + "    }\n"
                + "}";

        services.datosAPI(json);
    }

}
