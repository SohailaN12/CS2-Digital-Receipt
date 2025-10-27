public class Main {

   public static void main(String []args) {

     // CODE for part B
      String highSchoolName = "Birch Wathen Lenox";
       double priceDrink = 1.50;
       double priceCandy = 1.25;
       double priceHotDog = 2.75;
       double priceHumburger = 3.50;
      System.out.println("highSchoolName");

      int orderNumber = (Math.random(12) *100);
      int numOfDrinkOrder = (Math.random(10) *100);
      int numOfCandiesOrder = (Math.random(32) *100);
      int numOfHotDogOrder = (Math.random() *100);
      int numOfHamburgersOrder = (Math.random() *100);
      double taxRate = 0.08;
      double subtotal = "$1.50" * 12 ;
      double totalTax = subtotal * taxRate;
      double total = subtotal + totalTax;
     
      // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar            *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$ " + priceDrink +"         *");                      
     System.out.println("*     Candy ..........$ " + priceCandy +"         *");     
     System.out.println("*     Hot Dog ........$ " + priceHotDog +"        *");     
     System.out.println("*     Hamburger ......$ " + priceHumburger +"     *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
  }
  }

   

