/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labfinal;

import java.util.ArrayList;

/**
 *
 * @author arifh
 */

class Employee{
    public String name;
    public int id;
    public double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    
    public double calculateSalary(){
        return salary;
    }
    
public void display(){
    
    System.out.println("name :"+name);
        System.out.println("id :"+id);
    System.out.println("salary :"+salary);

}

}

class Manager extends Employee{
    
    public double bonus;

    public Manager(double bonus, String name, int id, double salary) {
        super(name, id, salary);
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary(){
        
        return salary + bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out. println("manager bonus: "+bonus);
         System.out. println("final salary:"+calculateSalary());
        
        
    }
     
}
class Engineer extends Employee{
    public double ebonus;

    public Engineer(double ebonus, String name, int id, double salary) {
        super(name, id, salary);
        this.ebonus = ebonus;
    }
    
    public double calculateSalary(){
        return salary + ebonus;
    }

    @Override
    public void display() {
        super.display(); 
        System.out. println("engineer bonus: "+ebonus);
                 System.out. println("final salary:"+calculateSalary());

        
    }
    
      
}

public class Test5 {
    public static void main(String[]args){
        
        
        Manager m =new Manager(2000,"arpa",34,35000);
               Engineer e =new Engineer(1000,"saimun",35,30000);

        
        ArrayList<Employee> em=new ArrayList<>();
        
        em.add(m);
        em.add(e);
        
        for(Employee y:em){
            y.display();
        }
        
        em.remove(e);
        
        for(Employee y:em){
            y.display();
        }
        
    }
    
    
    
    
    
    
    
}
