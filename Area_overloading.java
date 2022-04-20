/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_overloading;
import java.util.Scanner;
public class Area_overloading {
 double a;
	int s;
		double area()
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter value of s: ");
			int s=sc1.nextInt();
			a=s*s;
			System.out.println("Area of square: "+a);
			return a;
		}
		double area(int r)
		{
			a=3.14*r*r;
			System.out.println("Area of circle: "+a);
			return a;
		}
               
                
		double area(int b,int h)
		{
			a=0.5*b*h;
			System.out.println("Area of triangle: "+a);
			return a;
		}
		double area(int h1,int b1, int b2)
		{
			a=h1*(b1+b2)/2;
			System.out.println("Area of trapezoid: "+a);
			return a;
		}
    public static void main(String[] args) {
        	
	
		Area_overloading obj=new Area_overloading();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of r: ");
		int r=sc.nextInt();
		System.out.println("Enter value of b and h: ");
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("Enter value of h1,b1 and b2: ");
		int h1=sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		obj.area();
		obj.area(r);
		obj.area(b, h);
		obj.area(h1, b1, b2);

	}
    
}
        
    
    

