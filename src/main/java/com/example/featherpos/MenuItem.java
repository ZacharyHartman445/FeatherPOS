package com.example.featherpos;


public class MenuItem extends Item{

    String[] IngredientsUsed;
    double baseCost;
    double saleCost;
    double salePriceOff;
    double salePercentage;

    //Constructor
  public MenuItem(){

        IngredientsUsed = new String[]{"None"};
        baseCost = 0;
        saleCost = 0;
        salePriceOff = 0;
        salePercentage = 0;
   }
//getter functions


   String[] getIngredientsUsed(){
       return this.IngredientsUsed;
   }

   double getBaseCost(){
      return this.baseCost;
   }



   //setter functions

    void setBaseCost(double currentBase){
      this.baseCost = currentBase;
    }
    void setIngredientsUsed(String[] newArray){
       this.IngredientsUsed = newArray;
    }


    //modifying functions

    //database functions
}
