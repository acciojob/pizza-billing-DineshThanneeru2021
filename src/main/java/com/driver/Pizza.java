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
        price += 80;
    }



    public void addExtraToppings(){
        // your code goes here
        count2++;
        if(isVeg)
            price+=70;
        else
            price+=120;


    }

    public void addTakeaway(){
        // your code goes here
        count3++;
        price+=20;


    }

    public String getBill(){
        // your code goes here
        if(isVeg)
            bill=bill+"\nBase Price Of The Pizza:"+300+"\n";
        else
            bill=bill+"\nBase Price Of The Pizza:"+400+"\n";
        if(count!=0) {
            bill = bill + "Extra Cheese Added:" + count * 80 + "\n";
        }
        if(isVeg && count2!=0) {
            bill = bill + "Extra Toppings Added:" + count2 * 70+"\n";
        }
        else{
            if(count2!=0)
            {
                bill=bill+"Extra Toppings Added:"+count2*120+"\n";
            }
        }
        if(count3!=0)
            bill=bill+"Paperbag Added:"+count3*20+"\n";
        bill=bill+"Total Price:"+price+"\n";

        return this.bill;
    }
}
