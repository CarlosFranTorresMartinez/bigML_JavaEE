package services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import model.Model;

public class Services {

    public String datosAPI(Model json) throws IOException, InterruptedException {
        StringBuilder entity = new StringBuilder();
        entity.append("{");
        entity.append("\"age\":").append(json.getAge()).append(",");
        entity.append("\"anaemia\":").append(json.getAnaemia()).append(",");
        entity.append("\"creatinine_phosphokinase\":").append(json.getCreatinine_phosphokinase()).append(",");
        entity.append("\"diabetes\":").append(json.getDiabetes()).append(",");
        entity.append("\"ejection_fraction\":").append(json.getEjection_fraction()).append(",");
        entity.append("\"high_blood_pressure\":").append(json.getHigh_blood_pressure()).append(",");
        entity.append("\"platelets\":").append(json.getPlatelets()).append(",");
        entity.append("\"serum_creatinine\":").append(json.getSerum_creatinine()).append(",");
        entity.append("\"serum_sodium\":").append(json.getSerum_sodium()).append(",");
        entity.append("\"sex\":").append(json.getSex()).append(",");
        entity.append("\"smoking\":").append(json.getSmoking());
        entity.append("}");
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(entity.toString()))
                .uri(URI.create("https://bigml.io/andromeda/prediction?username=bryanbenavente;api_key=6bdd6d1dbf8ac8a270e56896062c3083555bfcc8"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

}
