/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexadd;
import java.util.*;
public class Complexadd {
   double real, img;
Complexadd(double r, double i){
	real = r;
	img = i;
}
	
public static Complexadd sum(Complexadd c1, Complexadd c2)
{
     Complexadd temp = new Complexadd(0, 0);

     temp.real = c1.real + c2.real;
     temp.img = c1.img + c2.img;
     return temp;
 }
 public static void main(String args[]) {
	Complexadd c1 = new Complexadd(5.5, 4);
	Complexadd c2 = new Complexadd(1.2, 3.5);
        Complexadd temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
}
}