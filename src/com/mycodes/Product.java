package com.mycodes;

public class Product {
    
    String pname;

    Product(String pname) {
        this.pname = pname;   // initialize instance variable
        System.out.println("Product Constructor Called");
    }
}

class Mobile extends Product {
    
    String brand;

    Mobile(String pname, String brand) {
        super(pname);   // call parent constructor
        this.brand = brand;
        System.out.println("Mobile Constructor Called");
    }

    void display() {
        System.out.println("Product Name: " + pname);
        System.out.println("Brand: " + brand);
    }
}

class Test {
    public static void main(String[] args) {
        
        Mobile m1 = new Mobile("iPhone 15", "Apple");
        m1.display();
        
    }
}