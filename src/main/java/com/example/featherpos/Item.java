package com.example.featherpos;

public class Item {
    String name;
    double cost;
    boolean inStock;
    int sold;
    Item(){
        name = "N/A";
        cost = 0;
        inStock = true;
        sold = 0;
    }

    //getter
    String getName (){
        return this.name;
    }
    boolean getInStock(){
        return this.inStock;
    }
    double getCost(){
        return this.cost;
    }
    int getSold(){
        return this.sold;
    }


    //setter
    void setName (String newName){
        this.name = newName;
    }
    void setCost (double newCost){
        this.cost = newCost;
    }
    void setInStock(boolean newInStock){
        this.inStock = newInStock;
    }
    void setSold (int newSold){
        this.sold = newSold;}


}
