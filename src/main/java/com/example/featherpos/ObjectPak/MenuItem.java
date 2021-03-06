package com.example.featherpos.ObjectPak;


import com.example.featherpos.ObjectPak.Item;

public class MenuItem extends Item {

    String name;
    String[] IngredientsUsed;
    double saleCost;
    double salePriceOff;
    double salePercentage;

    //Constructor
  public MenuItem(String name){
        this.name = name;
        IngredientsUsed = new String[]{"None"};
        saleCost = 0;
        salePriceOff = 0;
        salePercentage = 0;
   }
//getter functions

    String getName() {return this.name;}
   String[] getIngredientsUsed(){
       return this.IngredientsUsed;
   }
   double getSaleCost(){return this.saleCost;}
    double getSalePriceOff(){return this.salePriceOff;}
    double getSalePercentage(){return salePercentage;}


   //setter functions

    void setName(String newName){this.name = newName;}
    void setIngredientsUsed(String[] newArray){
       this.IngredientsUsed = newArray;
    }
    void setSaleCost(double newSaleCost){ this.saleCost = newSaleCost;}
    void setSalePriceOff(double newSalePrice){this.salePriceOff = newSalePrice;}
    void setSalePercentage(double newPercentage){this.salePercentage = newPercentage;}

    //modifying functions
    void calculateSaleCost(){this.saleCost = this.cost - this.salePriceOff;}
    void calculatePriceOff(){this.salePriceOff= this.cost * this.salePercentage;}
    //database functions
}
