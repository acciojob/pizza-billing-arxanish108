package com.driver;

public class Pizza {


    private int price ;
    private boolean isVeg;
    private String bill;
    private int topping;

    boolean isExtraCheese;
    boolean isExtraTopping;
    boolean isBillCreated;
    boolean isTakeAway;


    public Pizza(Boolean isVeg){

        if(isVeg){
            price = 300;
            topping = 70;
        }else{
            price = 400;
            topping = 120;
        }
        bill = "Base Price Of The Pizza: "+price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese) {
            this.price += 80;
            this.isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraTopping){
            this.price += this.topping;
            isExtraCheese = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        // if(!isBillCreated) {
        if (!isExtraCheese) {
            this.bill += "Extra Cheese Added: 80" + "\n";
        }
        if (!isExtraTopping) {
            this.bill += "Extra Toppings Added: 70" + "\n";
        }
        if (!isTakeAway) {
            this.bill += "Paperbag Added: 20" + "\n";
        }

        this.bill += "Total Price: " + this.price;
        this.isBillCreated = true;
        return this.bill;
        //}
        // return "";
    }
}