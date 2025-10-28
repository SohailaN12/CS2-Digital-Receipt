import java.util.Scanner;
public class Main {
   public static void main(String []args) {
      Scanner input = new Scanner(System.in);
      System.out.println("amount of drinks");
      int xdrink = input.nextInt();
      System.out.println("amount of candy");
      int xcandy = input.nextInt();
      System.out.println("amount of hotdog");
      int xhotdog = input.nextInt();
      System.out.println("amount of hamburgers");
      int xhamburgers = input.nextInt();
      



     // CODE for part B
      String highSchoolName = "Birch Wathen Lenox";
       double priceDrink = 1.50;
       double priceCandy = 1.25;
       double priceHotDog = 2.75;
       double priceHumburger = 3.50;
      System.out.println("highSchoolName");

      // CODE for part C  
      int orderNumber = (int) (Math.random() *100);
      int numDrink = xdrink;
      int numCandy =xcandy;
      int numHotDog = xhotdog;
      int numHamburgers = xhamburgers;

      double taxRate = 0.08;
      double subtotal = priceDrink*numDrink+priceCandy*numCandy+priceHotDog*numHotDog+priceHumburger*numHamburgers;
      double totalTax = subtotal * taxRate;
      double total = subtotal + totalTax;

      

     
      // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar            *");
     System.out.println("*                                    *");
     System.out.println("*     Order # " + orderNumber +"          *"); 
     System.out.println("*     Drink ..........$ " + priceDrink + " #" + xdrink + "         *");                      
     System.out.println("*     Candy ..........$ " + priceCandy +  " #" + xcandy + "  *");     
     System.out.println("*     Hot Dog ........$ " + priceHotDog +" #" + xhotdog + "     *");     
     System.out.println("*     Hamburger ......$ " + priceHumburger +" #" + xhamburgers +"  *"); 
     System.out.println("*     Total ........$ " + subtotal +"        *");     
     System.out.println("*                                      *");    
     System.out.println("**************************************");
  }
  }

   

