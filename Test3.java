/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labfinal;

/**
 *
 * @author arifh
 */

class Person{
    public String name;
    public int age;
    public String gender;
    public String address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    
    
    
    public void display(){
        
       System.out.println("name :"+name);
      System.out.println("age :"+age);
        System.out.println("gender :"+gender);
       System.out.println("address :"+address);
    
    }
    
    public void display(int hand){
        System.out.println(hand); 
          System.out.println("name :"+name);
      System.out.println("age :"+age);
        
        
    }
    
    
    
}

public class Test3 {
    public static void main(String[]args){
        
        Person p1 =new Person("saimun",15);
        
        
        Person p2 =new Person("a",9,"f","ghg");
        
        
        p1.display(2);
        p2.display();
        
        
    }
    
}
