
package com.mycompany.labfinal;

import java.util.ArrayList;

/**
 *
 * @author arifh
 */
abstract class Product {
    
    
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
   public abstract void display();
    
    
}

interface Discount{
    
    double calculatediscount();
}

interface  Warrentyyy{
    
    void warrenty();
    
    
}

class Electronics extends Product implements Discount,Warrentyyy{
    
    public String brand;

    public Electronics(String brand, String name, double price) {
        super(name, price);
        this.brand = brand;
    }
    
    
    @Override
     public double calculatediscount(){
         return getPrice()*0.1;
     }
    public void warrenty(){
        System.out.println("1 year warrenty");
    }
    
    public void display(){
       System.out.println("name :"+getName());
       System.out.println("price :"+getPrice());
       System.out.println("brand :"+brand);
       System.out.println("discount :"+ calculatediscount());
       System.out.println("final price is:"+ (getPrice()-calculatediscount()));
       
        warrenty();
    }
    
}

class Book1 extends Product implements Discount,Warrentyyy{
    
    public String author;

    public Book1(String author, String name, double price) {
        super(name, price);
        this.author = author;
    }
    
    public double calculatediscount(){
         return getPrice()*0.5;
     }
    
    public void warrenty(){
        System.out.println("unlimited year warrenty");
    }
    
    
    public void display(){
       System.out.println("name :"+getName());
       System.out.println("price :"+getPrice());
       System.out.println("author :"+author);
       System.out.println("discount :"+ calculatediscount());
       System.out.println("final price is:"+ (getPrice()-calculatediscount()));
       
        warrenty();
    }
    
}

public class Test6 {
    
    public static void main(String[]args){
        
        
        Electronics e =new Electronics("philips","bati",2000);
        Book1 b=new Book1("saimun","yooo",1000);
        
        
        ArrayList<Product> pr =new ArrayList<>();
        
       pr.add(e);
       pr.add(b);
       
       for(Product p:pr){
           p.display();
           
       }
        
        
    }
    
}
