import java.util.Scanner;
 public class IT24104068Lab3Q1B{
   public static void main(String[]args){
   Scanner scanner=new Scanner(System.in);

   System.out.print("Enter the price of 1Kg of rice:");
   double pricePerKg=scanner.nextDouble();

   System.out.print("Enter the number of kilograms you want to buy:");
   double kilograms= scanner.nextDouble();
  
   double totalCost=pricePerKg*kilograms;
   double discount=totalCost*0.10;
   double amountToPay=totalCost-discount;

   System.out.println("The total amount with 10% discount is:" + amountToPay);
   
   scanner.close();
  }
}