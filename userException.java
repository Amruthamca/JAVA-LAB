import java.util.Scanner;
import static javax.management.Query.not;



public class Myexception extends Exception {
    public Myexception(String str)
    {
        System.out.print(str);
    }
}
public class userException
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter user name");
    String u=sc.next();
    System.out.println("enter password");
    String p=sc.next(); 
        try {
            if(u == null ? p == null : u.equals(p))
            {
                System.out.println("user name and password are same");
            }
            else if (u == null ? p != null : !u.equals(p)) {
                System.out.println(""not same"");
            }
              else
            {
                System.out.print(Final excecution coompleted");"
            }
            }
        } catch (Exception e) {
  
        }
    
}
    
    