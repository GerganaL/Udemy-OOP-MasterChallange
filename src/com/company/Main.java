package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Hamburger hamburger = new Hamburger("basic", "sausoge",3.56,"white");
//    double price = hamburger.itemizeHamburger();
    hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.12);
        System.out.println("Total burger is "+hamburger.itemizeHamburger());
        System.out.println(" ");



        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addHamburgerAddition1("egg",5.43);
        healthyBurger.addHelthAddition1("lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());
        System.out.println("");


        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.addHamburgerAddition1("lettuce",1.23);
        deluxBurger.itemizeHamburger();

    }




}
