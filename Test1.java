
package com.mycompany.labfinal;

/**
 *
 * @author arifh
 */
class Student{
    int id;
    String name;
    String department;
    double cgpa;
      
    
    static String university ="ulab";
    static int totalstudent =0;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalstudent++;
    }
    
    public void display(){
        
        System.out.println("id :"+id);
        System.out.println("name :"+name);
        System.out.println("department :"+department);
        System.out.println("cgpa :"+cgpa);
        System.out.println("university :"+university);
        
        
    }
    
    static void display1(){
        System.out.println("total student :"+totalstudent);
        
    }
    
    
    
}


public class Test1 {
    public static void main(String[]args){
        
        
      Student s1 =new Student(78,"sa","cse",2.4);
       Student s2 =new Student(75,"s","cse",2.9);
         Student s3 =new Student(89,"sai","cse",3.4);     
        
        
        s1.display();
        s2.display();
        s3.display();
        
        Student.display1();
        
    }
    
}
