
package com.mycompany.labfinal;

/**
 *
 * @author arifh
 */

class Person1{
    
    private String name;
     private int age;
      private String gender;
       private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}

public class Test4 {
    public static void main(String[]args){
        
        Person1 p1 =  new Person1();
        
        p1.setName("saimun");
        p1.setAge(18);
        
        
          System.out.println("name:"+p1.getName());
           System.out.println("age:"+p1.getAge());
          
        
        
        
        
        
        
        
    }
    
}
