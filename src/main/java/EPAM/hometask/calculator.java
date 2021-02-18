package EPAM.hometask;
import java.util.*;
public class calculator 
{

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
        int p,q;
        p=sc.nextInt();
        q=sc.nextInt();
        System.out.println("Addition is "+add(p,q));
        System.out.println("Substraction is "+sub(p,q));
        System.out.println("Multiplication is "+mul(p,q));
        if(q!=0)
        System.out.println("Division is "+div(p,q));
        else
          System.out.println("Invalid input");
  }
  public static int add(int p,int q)
  {
    return p+q;
  }
  
  public static int sub(int p,int q)
  {
    return p-q;
  }
  
  public static int mul(int p,int q)
  {
    return p*q;
  }
  
  public static int div(int p,int q)
  {
    return p/q;
  }
}