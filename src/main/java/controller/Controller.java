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
    
    private final Services services;
    private Model model;
    
    public Controller() {
        model = new Model();
        services = new Services();
    }
    
    public void obtenerDatos() throws IOException, InterruptedException {
        String a = services.datosAPI(model);
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject) jsonParser.parse(a);        
        model.setConfidence(jsonObject.get("confidence").getAsDouble());
        System.out.println(jsonObject.get("confidence").getAsDouble());
        model.setCategory(jsonObject.get("category").getAsInt());
        model.setCredits(jsonObject.get("credits").getAsDouble());
        model.setProbability(jsonObject.get("probability").getAsDouble());
    }
    
    public Model getModel() {
        return model;
    }
    
    public void setModel(Model model) {
        this.model = model;
    }
    
}
