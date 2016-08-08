#Duplicates
import java.util.*;
class RemoveDuplicate
{
    public static void main(String args[])
    {
String s,ans="";
char ch	;
int len,i=0;
Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string: "); // Inputting the word
        s = sc.nextLine();
len=s.length();
s+=" ";ch=s.charAt(0);	
while(i<len)
{	
ans= ans+ ch; 
while(s.charAt(++i)==ch && i<len)
{}
ch=s.charAt(i);	}
 
System.out.println("String after removing repeated characters : \n"+ans); // Printing the string without duplicate characters
}
    }
