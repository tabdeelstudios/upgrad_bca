// Hotel Management System

// Step 1 : Choose the type
// 1. Delivery
// 2. Dine In
// 3. Takeaway
// 4. Exit

// Step 2 : Show the menu
// 1. Delivery Menu
// 2. Dine In Menu
// 3. Takeaway Menu

// Step 3 : Pick an item

// Step 4 : Print the bill

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int diningChoice;
        int menuItem;
        int deliveryItemPrice[] = {100,200};
        int takeawayItemPrice[] = {300,400};
        int dineinItemPrice[] = {30,50};
        do{
            System.out.println("Welcome to Zaiqa!");
            System.out.println("Pick one : \n1. Delivery\n2. Takeaway\n3. Dine In\n4. Exit");
            diningChoice = input.nextInt();
            
            switch(diningChoice)
            {
                case 1:System.out.println("Delivery Menu\n1. Pizza\n2. Pasta");
                 menuItem = input.nextInt();
                 System.out.println("Order under process! Your total bill is : "+deliveryItemPrice[menuItem-1]);
                 break;
                    
                case 2:System.out.println("Takeaway Menu\n1. Fried Rice\n2. Noodles");
                 menuItem = input.nextInt();
                 System.out.println("Order under process! You ordered : "+takeawayItemPrice[menuItem-1]);
                 break;
                    
                case 3:System.out.println("Dine In Menu\n1. Tea\n2. Coffee");
                 menuItem = input.nextInt();
                 System.out.println("Order under process! You ordered : "+dineinItemPrice[menuItem-1]);
                 break;
                 
                case 4:System.out.println("Thanks for visiting!");
                break;
            }
            
        }while(diningChoice<=3);
    }
}