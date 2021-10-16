package com.example.featherpos;


public class MenuItem {
    String name;
    String[] IngredientsUsed;
    double cost;
    double baseCost;
    int inStock;
    int sold;
    double saleCost;
    double salePriceOff;
    double salePercentage;

    //Constructor
  public MenuItem(){
       name = "N/A";
        IngredientsUsed = new String[]{"None"};
        cost = 0;
        baseCost = 0;
        inStock = 0;
        sold = 0;
        saleCost = 0;
        salePriceOff = 0;
        salePercentage = 0;
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
   int getInStock(){
      return this.inStock;
   }
   int getSold(){
      return this.sold;
   }
   double getBaseCost(){
      return this.baseCost;
   }



   //setter functions
    void setName (String newName){
       this.name = newName;
    }
    void setCost (double newCost){
       this.cost = newCost;
    }
    void setBaseCost(double currentBase){
      this.baseCost = currentBase;
    }
    void setIngredientsUsed(String[] newArray){
       this.IngredientsUsed = newArray;
    }
    void setInStock(int newInStock){
      this.inStock = newInStock;
    }
    void setSold (int newSold){
      this.sold = newSold;
    }

    

    //modifying functions

    //database functions
}
