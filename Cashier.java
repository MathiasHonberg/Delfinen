import java.util.*;
import java.io.*;

public class Cashier extends Manager{

   public Cashier(String name, int age, int password){
      
         super(name, age, password);
      }
      
      Scanner scan = new Scanner(System.in);
      
    public void cashierMenu (ArrayList<Member> members) throws FileNotFoundException{

          boolean keepRunning = true;
         
         
         //Cashier login
         
         System.out.println();
         System.out.println("Please enter the Cashier password");
         System.out.println();
         
      
         int cashierCode = scan.nextInt();
         while (keepRunning){
          
         
      if (cashierCode != 2960){
      
         System.out.println("Wrong password");
         System.out.println("Please try again");
         }
         
         
      else {
      
         //Cashier main menu
         System.out.println();
         System.out.println("Hello mr. Cashier");
         System.out.println();
         System.out.println("1. Display member list");
         System.out.println("2. Show members in restance");
         System.out.println("3. Back to Main menu");
         
         
            //Display member list
               int cashierOption = scan.nextInt();
            
            if (cashierOption == 1){
               
               for (int i = 0; i < members.size(); i++){
              // System.out.println(members.get(i).getName() + " " + members.get(i).getLastName() + " " + members.get(i).getAge() + " " + members.get(i).getPhoneNumber() + " " + members.get(i).getState() + " " + members.get(i).getRole() + " " + members.get(i).getSubscription());
               
               System.out.println();
               System.out.println();
               System.out.println("Name:          " + members.get(i).getName());
               System.out.println("Last Name:     " + members.get(i).getLastName());
               System.out.println("Age:           " + members.get(i).getAge());
               System.out.println("Phone Number:  " + members.get(i).getPhoneNumber());
               System.out.println("State:         " + members.get(i).getState());
               System.out.println("Role:          " + members.get(i).getRole());
               System.out.println("Subscription:  " + members.get(i).getSubscription() + " kr. / year");     
               }
               
               
               
            }
            
            if (cashierOption == 2) {
            
               
            }
            
            
            if (cashierOption == 3){
               
               keepRunning = false;
            
            }
      }
      }

}
}