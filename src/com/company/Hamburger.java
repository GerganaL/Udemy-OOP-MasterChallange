package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1NAme;
    private double addition1Price;

    private String addition2NAme;
    private double addition2Price;

    private String addition3NAme;
    private double addition3Price;

    private String addition4NAme;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1NAme=name;
        this.addition1Price=price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2NAme=name;
        this.addition2Price=price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3NAme=name;
        this.addition3Price=price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4NAme=name;
        this.addition4Price=price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice= this.price;
        System.out.println(this.name + " Hamburger "+ "on a " + this.breadRollType + " roll "+
                "with "+this.meat+ " price is " + this.price);
        if(this.addition1NAme !=null){
            hamburgerPrice+= this.addition1Price;
            System.out.println("Added " + this.addition1NAme + " for an extra " + this.addition1Price);
        }
        if(this.addition2NAme !=null){
            hamburgerPrice+= this.addition2Price;
            System.out.println("Added " + this.addition2NAme + " for an extra " + this.addition2Price);
        }
        if(this.addition3NAme !=null){
            hamburgerPrice+= this.addition3Price;
            System.out.println("Added " + this.addition3NAme + " for an extra " + this.addition3Price);
        }
        if(this.addition4NAme !=null){
            hamburgerPrice+= this.addition4Price;
            System.out.println("Added " + this.addition4NAme + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }

}
