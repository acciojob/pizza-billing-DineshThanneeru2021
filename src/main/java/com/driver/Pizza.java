package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isPaperBagAdded;
    private boolean isCheeseAdded;
    private boolean isExtraToppingAdded;
    private int totalPrice;
    private int basePrice;
    private boolean isBillGenerated;
    private int cheesePrice;
    private int ExtraToppingPrice;
    private int paperBagprice;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            basePrice=300;
            ExtraToppingPrice=70;


        }
        else {
            basePrice=400;
            ExtraToppingPrice=120;

        }
        totalPrice+=basePrice;
        bill=bill+"Base Price Of The Pizza: "+basePrice+"\n";
        cheesePrice=80;
        paperBagprice=20;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if(!isCheeseAdded)
        {
            totalPrice+=80;
            isCheeseAdded=true;
            bill=bill+"Extra Cheese Added: "+cheesePrice+"\n";
        }

    }



    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded)
        {
            isExtraToppingAdded=true;
            totalPrice+=ExtraToppingPrice;
            bill=bill+"Extra Toppings Added: "+ExtraToppingPrice+"\n";
        }



    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded)
        {
            isPaperBagAdded=true;
            totalPrice+=20;
            bill=bill+"Paperbag Added: "+paperBagprice+"\n";
        }




    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated) {
            isBillGenerated = true;

            bill = bill + "Total Price: " + totalPrice +"\n";
        }

        return this.bill;
    }
}
