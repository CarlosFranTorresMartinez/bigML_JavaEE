package controller;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import model.Model;
import services.Services;

@Named(value = "controller")
@ViewScoped
public class Controller implements Serializable{
    
    private final Services services = new Services();
    private Model model = new Model();
    
    public Controller() {
    }
    
    public void mostarDatos(String json) throws IOException, InterruptedException {
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject) jsonParser.parse(services.datosAPI(json));
        
        model.setConfidence(jsonObject.get("confidence").getAsDouble());
        System.out.println(jsonObject.get("confidence").getAsDouble());
        model.setCategory(jsonObject.get("category").getAsInt());
        model.setCredits(jsonObject.get("credits").getAsDouble());
        model.setProbability(jsonObject.get("probability").getAsDouble());
    }
    
    public void obtenerDatos() throws IOException, InterruptedException {
        String json = "{\n"
                + "    \"model\": \"logisticregression/5f24ad002fb31c2967005efa\",\n"
                + "    \"input_data\" : {\n"
                + "        \"age\": " + model.getAge() + " ,\n"
                + "        \"anaemia\": " + model.getAnaemia() + ",\n"
                + "        \"creatinine_phosphokinase\": " + model.getCreatinine_phosphokinase() + ",\n"
                + "        \"diabetes\": " + model.getDiabetes() + ",\n"
                + "        \"ejection_fraction\": " + model.getEjection_fraction() + ",\n"
                + "        \"high_blood_pressure\": " + model.getHigh_blood_pressure() + ",\n"
                + "        \"platelets\": " + model.getPlatelets() + ",\n"
                + "        \"serum_creatinine\": " + model.getSerum_creatinine() + ",\n"
                + "        \"serum_sodium\": " + model.getSerum_sodium() + " ,\n"
                + "        \"sex\": " + model.getSex() + ",\n"
                + "        \"smoking\": " + model.getSmoking() + "\n"
                + "    }\n"
                + "}";
        
        String a = services.datosAPI(json);
        mostarDatos(a);
    }
    
    public Model getModel() {
        return model;
    }
    
    public void setModel(Model model) {
        this.model = model;
    }
    
}
