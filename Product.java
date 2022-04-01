/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.*;

public class Product {
    Scanner sc=new Scanner(System.in);
    int pcode;
    String pname;
    float price;
    void getdata()
    {
        System.out.println("enter product code");
        pcode=sc.nextInt();
        System.out.println("enter product name");
        pname=sc.next();
        System.out.println("enter price");
        price=sc.nextFloat();
    }
    static void lowest_price(float price1,float price2,float price3)
    {
        if(price1<=price2 && price1<=price3)
        {
            System.out.println("price 1 is the lowest price");
        }
        else if(price2<=price1 && price2<=price3)
        {
            System.out.println("price 2 is the lowest price");
        }
        else
        {
            System.out.println("price 3 is the lowest price");
        }
    }
    void display()
    {
        System.out.println(pcode+"\t\t" +pname+"\t\t" +price);
    }
    public static void main(String[] args) {
        Product p1=new Product();
        p1.getdata();
        Product p2=new Product();
        p2.getdata();
        Product p3=new Product();
        p3.getdata();
        System.out.println("pcode \t\t pname \t\t price");
        p1.display();
        p2.display();
        p3.display();
        lowest_price(p1.price,p2.price,p3.price);
    }
    
}
