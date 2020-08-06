/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ctmar
 */
public class Model {

    private Double confidence;
    private int category;
    private Double credits;
    private Double probability;

    private int Age;
    private int Anaemia;
    private int Creatinine_phosphokinase;
    private int Diabetes;
    private int Ejection_fraction;
    private int High_blood_pressure;
    private int Platelets;
    private int Serum_creatinine;
    private int Serum_sodium;
    private int Sex;
    private int Smoking;

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
        this.credits = credits;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAnaemia() {
        return Anaemia;
    }

    public void setAnaemia(int Anaemia) {
        this.Anaemia = Anaemia;
    }

    public int getCreatinine_phosphokinase() {
        return Creatinine_phosphokinase;
    }

    public void setCreatinine_phosphokinase(int Creatinine_phosphokinase) {
        this.Creatinine_phosphokinase = Creatinine_phosphokinase;
    }

    public int getDiabetes() {
        return Diabetes;
    }

    public void setDiabetes(int Diabetes) {
        this.Diabetes = Diabetes;
    }

    public int getEjection_fraction() {
        return Ejection_fraction;
    }

    public void setEjection_fraction(int Ejection_fraction) {
        this.Ejection_fraction = Ejection_fraction;
    }

    public int getHigh_blood_pressure() {
        return High_blood_pressure;
    }

    public void setHigh_blood_pressure(int High_blood_pressure) {
        this.High_blood_pressure = High_blood_pressure;
    }

    public int getPlatelets() {
        return Platelets;
    }

    public void setPlatelets(int Platelets) {
        this.Platelets = Platelets;
    }

    public int getSerum_creatinine() {
        return Serum_creatinine;
    }

    public void setSerum_creatinine(int Serum_creatinine) {
        this.Serum_creatinine = Serum_creatinine;
    }

    public int getSerum_sodium() {
        return Serum_sodium;
    }

    public void setSerum_sodium(int Serum_sodium) {
        this.Serum_sodium = Serum_sodium;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int Sex) {
        this.Sex = Sex;
    }

    public int getSmoking() {
        return Smoking;
    }

    public void setSmoking(int Smoking) {
        this.Smoking = Smoking;
    }

}
