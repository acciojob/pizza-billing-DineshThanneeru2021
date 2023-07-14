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
            this.price+=300;

        }
        else {
            this.price+=400;

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
            this.bill=this.bill+"\nBase Price Of The Pizza: "+300+"\n";
        else
            this.bill=this.bill+"\nBase Price Of The Pizza: "+400+"\n";
        if(count!=0) {
            this.price+=80*count;
            this.bill = this.bill + "Extra Cheese Added: " + 80 + "\n";
        }
        if(isVeg){
            if(count2!=0) {
                this.bill = this.bill + "Extra Toppings Added: " + 70 + "\n";
                this.price += 70;
            }
        }
        else{
            if(count2!=0)
            {
                this.price+=120;
                this.bill=this.bill+"Extra Toppings Added: "+120+"\n";
            }
        }
        if(count3!=0) {
            this.bill = this.bill + "Paperbag Added: " + 20 + "\n";
            this.price += 20;
        }
        this.bill=this.bill+"Total Price: "+this.price+"\n";

        return this.bill;
    }
}
