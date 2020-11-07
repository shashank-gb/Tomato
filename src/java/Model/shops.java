/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author SHASHANKgb
 */
public class shops {
    int res_id;
    String res_name;
    String res_type;
    Double min_cost;
    String rating;
    String location;

    public int getRes_id(){
        return res_id;
    }
    
    public void setRes_id(int res_id){
        this.res_id = res_id;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public void setMin_cost(Double min_cost) {
        this.min_cost = min_cost;
    }

    public Double getMin_cost() {
        return min_cost;
    }

    public String getRes_name() {
        return res_name;
    }

    public String getRes_type() {
        return res_type;
    }

    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }

    public void setRes_type(String res_type) {
        this.res_type = res_type;
    }
    
}
