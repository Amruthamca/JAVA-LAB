/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import graphics.circle;
import graphics.Rect;
import graphics.Square;
import graphics.Triangle;
import java.util.Scanner;
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int choice;
        circle obj1 = new circle();
        Rect obj2 = new Rect();
        Square obj3 = new Square();
        Triangle obj4 = new Triangle();
                System.out.println("Choose any    1)Circle   2)Rectangle   3)Square  4)Triangle: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        obj1.area();
                        break;
                    case 2:
                        obj2.area();
                        break;
                    case 3:
                        obj3.area();
                        break;
                    case 4:
                        obj4.area();
                    default:
                        break;
                }

        }
    }
    
