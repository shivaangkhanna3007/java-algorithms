import java.util.*;
public class PrimeCheck
{
public static void main(String args[])
{
System.out.println("Enter a number.....");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a/2==0)
System.out.println(a+" is a prime number);
else
System.out.prinlt(a+"is a non-prime number");
}
}