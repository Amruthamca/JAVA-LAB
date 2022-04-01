/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
public class Employee {
    int eid;
    String ename;
    float salary;

Employee(int a,String e,int s) {
        eid=a;
        ename=e;
        salary=s;
    }
    public void total_salary()
    {
        float tsalary=salary+salary*2/100;
        System.out.println("Total salary=" +tsalary);
    }

    public static void main(String[] args) {
        Employee e1=new Employee(101,"ammu",30000);
        e1.total_salary();
       Employee e2=new Employee(102,"anu",35000);
       e2.total_salary();
        
    }
    
}
