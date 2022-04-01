/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import static java.lang.Double.sum;

public class Student {
    float m1,m2,m3,s,p;

    Student(int a,int b,int c) {
        m1=a;
        m2=b;
        m3=c;
    }
    public void sum()
    {
        float s=m1+m2+m3;
        System.out.println("sum=" +s);
    }
    public void percentage()
    {
        s=m1+m2+m3;
        float p=(s*100 )/ 300;
        System.out.println("percentage=" +p);
    }
    
    public static void main(String[] args) {
        Student s1=new Student(30,50,55);
        s1.sum();
        s1.percentage();
        Student s2=new Student(78,99,78);
        s2.sum();
        s2.percentage();
        
    }
    
}
