# hari
import java.util.Scanner;
class Main
{
private static Scanner sc;

public static void main(String args[])
{
int num;
System.out.println("Enter an integer number:");
sc = new Scanner(System.in);
num=sc.nextInt();
if(num % 2== 0)
System.out.println("Entered number is even");
else
System.out.println("Entered number is odd");
}
}
