/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

public class Rectangle {
    int l,b;

    Rectangle(int length,int breadth) {
        l=length;
        b=breadth;
    }
    public void perimeter()
    {
        int p=2*(l+b);
        System.out.println("perimeter=" +p);
    }
    public void area(){
        int a= l*b;
        System.out.println("area=" +a);
    }
    public static void main(String[] args) {
        System.out.println("first rectangle");
        Rectangle r1=new Rectangle(10,5);
        r1.perimeter();
        r1.area();
         System.out.println("second rectangle");
        Rectangle r2=new Rectangle(8,7);
        r2.perimeter();
        r2.area();
        
    }
    
}
