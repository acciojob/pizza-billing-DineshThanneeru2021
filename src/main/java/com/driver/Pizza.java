package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int totalPrice;
    private int cheesePrice;
    private int toppingPrice;
    private int paperBagPrice;
    private boolean isCheeseAdded=false;
    private boolean isToppingsAdded=false;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            totalPrice+=300;
            bill=bill+"Base Price Of The Pizza:"+300;

            toppingPrice=70;



        }
        else {
            totalPrice+=400;
            bill=bill+"Base Price Of The Pizza:"+400;
            toppingPrice=120;


        }
        cheesePrice=80;
        paperBagPrice=20;

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese() {
        // your code goes her
        if(!isCheeseAdded) {
            totalPrice += 80;
            isCheeseAdded = true;
            bill = bill + "\nExtra Cheese Added:"+cheesePrice;
        }



    }



    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded)
        {
            isToppingsAdded=true;
            totalPrice+=toppingPrice;
            bill=bill+"\nExtra Toppings Added:"+toppingPrice;
        }



    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded)
        {
            isPaperBagAdded=true;
            totalPrice+=20;
            bill=bill+"\nPaperbag Added:"+paperBagPrice;
        }




    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {
            isBillGenerated=true;
            bill=bill+"\nTotal Price:"+totalPrice;
        }
        return this.bill;
    }
}
