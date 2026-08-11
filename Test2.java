
package com.mycompany.labfinal;

/**
 *
 * @author arifh
 */

class Book{
    String title;
    String author;
    int year;
    String gerne;

    public Book(String title, String author, int year, String gerne) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.gerne = gerne;
    }
    
    
    public void display(){
        
        System.out.println("title:"+title);
                System.out.println("author:"+author);
                        System.out.println("year:"+year);
                                System.out.println("gerne:"+gerne);



    }
}



public class Test2 {
    public static void main(String[]args){
        Book[]b=new Book[3];
        
        b[0]=new Book("java","saimun",2021,"fahkhh");
                b[1]=new Book("java","saimun",2021,"fahkhh");
        b[2]=new Book("java","saimun",2021,"fahkhh");

        for(int i=0;i<b.length;i++){
            b[i].display();
        }
     
         b[1]= null; 
         
         
         
         
          for(int i=0;i<b.length;i++){
            if(b[i]!=null){
                b[i].display();
                
            }
        }
         
            
    }
}
