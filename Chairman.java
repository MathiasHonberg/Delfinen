import java.util.*;
import java.io.*;

public class Chairman extends Manager{

   public Chairman(String name, int age, int password){
   
      super(name, age, password);
   }
      
      Scanner scan = new Scanner(System.in);
      Menu menu = new Menu();
      

   public void chairmanMenu (ArrayList<Member> members) throws FileNotFoundException{
   
         boolean keepRunning = true;
         
         
         //chairman login
         
         System.out.println();
         System.out.println("Please enter the Chairman password");
         System.out.println();
         
      
         int chairmanCode = scan.nextInt();
         while (keepRunning){
          
         
      if (chairmanCode != 2450){
      
         System.out.println("Wrong password");
         System.out.println("Please try again");
         }
         
         
      else {
      
         //Chairman main menu
         System.out.println();
         System.out.println("Hello mr. Chairman");
         System.out.println();
         System.out.println("1. Create member");
         System.out.println("2. Edit member");
         System.out.println("3. Back to Main menu");
         
         
            //Create member
               int chairmanOption = scan.nextInt();
            
            if (chairmanOption == 1){
               
               menu.chairmanOption1(members);
               
               
            }
            
            if (chairmanOption == 2) {
            
               menu.chairmanOption2(members);
            }
            
            
            if (chairmanOption == 3){
               
               keepRunning = false;
            
            }
      }
      }
   
   }
}