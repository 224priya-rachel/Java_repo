import java.util.*;
public class VendingMachine
{
    public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in);
    String item;
    Double money=sc.nextDouble();
    Double rem;
    String choice="y";
    System.out.println("WELCOME TO Vending Machine");
    System.out.println("***************************");
while(choice!="n")
{
    System.out.println("ITEMS AVAILABLE:");
    System.out.println("***************************");
    System.out.println("Chocolate:          1.5");
    System.out.println("Pop:          1.75");
    System.out.println("Chips:          2.0");
    System.out.println("Gum:          0.5");
    System.out.println("Mint:          1.75");

    System.out.println("Select item:");
    item=sc.next();

  System.out.println("Insert your money:");
    money=sc.nextDouble();

    System.out.println("You got:" + item);
     
     if(item=="Chocolate")
     {
         rem=money- 1.5;
     }
     else if(item=="Pop" || item=="Mint")
     {
         rem=money- 1.75;
     }
     else if(item=="Chips")
     {
         rem=money-2.0;
     }
     else if(item=="Gum")
     {
         rem=money- 0.5;
     }
     else {
         System.out.println("Wrong entry");
     }
     System.out.println("Your remaining balance4 is:" + rem);
    System.out.println("Do you want to buy something else?      'y/n'"); 
    choice=sc.next();
}
if(choice=="n")
{
    System.out.println("Thank you for shopping! Have a nice day.");
}
    }
}