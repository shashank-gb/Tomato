/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author prajwal
 */
public class getfoodsf {
    String f_name;
    String preference;
    Double cost;
    String description;
    int food_id;
    public String getF_name() {
        return f_name;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getPreference() {
        return preference;
    }

    public Double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFood_id() {
        return food_id;
    }
    
}
