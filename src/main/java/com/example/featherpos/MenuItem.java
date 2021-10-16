package com.example.featherpos;


public class MenuItem {
    String name;
    String[] IngredientsUsed;
    double cost;
    //Constructor
  public MenuItem(){
       name = "N/A";
        IngredientsUsed = new String[]{"None"};
        cost = 0;
   }
//getter functions
   String getName (){
       return this.name;
   }
   double getCost(){
       return this.cost;
   }
   String[] getIngredientsUsed(){
       return this.IngredientsUsed;
   }
   //setter functions
    void setName (String newName){
       this.name = newName;
    }
    void setCost (double newCost){
       this.cost = newCost;
    }
    void setIngredientsUsed(String[] newArray){
       this.IngredientsUsed = newArray;
    }
    //modifying functions

    //database functions
}
