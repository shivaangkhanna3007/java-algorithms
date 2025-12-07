import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string to check whether it is a palindrome.....");
String s=sc.nextLine();
int l=s.length();
char c;
String new="";
for(int i=0;i<l;i++)
{
c=s.charAt(i);
new=c+new;
}
if(new.equals(s))
System.out.println("The String is palindromic");
else
System.out.prinltn("The String is not palindromic");
}
}