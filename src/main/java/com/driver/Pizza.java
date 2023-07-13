package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int count;
    int count2;
    int count3;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            price+=300;

        }
        else {
            price+=400;

        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        count++;

    }



    public void addExtraToppings(){
        // your code goes here
        count2++;



    }

    public void addTakeaway(){
        // your code goes here
        count3++;




    }

    public String getBill(){
        // your code goes here
        this.bill="";
        if(isVeg)
            bill=bill+"\nBase Price Of The Pizza: "+300+"\n";
        else
            bill=bill+"\nBase Price Of The Pizza: "+400+"\n";
        if(count!=0) {
            price+=80*count;
            bill = bill + "Extra Cheese Added: " + 80 + "\n";
        }
        if(isVeg){
            if(count2!=0) {
                bill = bill + "Extra Toppings Added: " + 70 + "\n";
                price += 70;
            }
        }
        else{
            if(count2!=0)
            {
                price+=120;
                bill=bill+"Extra Toppings Added: "+120+"\n";
            }
        }
        if(count3!=0) {
            bill = bill + "Paperbag Added: " + 20 + "\n";
            price += 20;
        }
        bill=bill+"Total Price: "+price+"\n";

        return this.bill;
    }
}
