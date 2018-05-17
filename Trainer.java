import java.util.*;
import java.io.*;

public class Trainer extends Manager{

   public Trainer(String name, int age, int password){
   
      super(name, age, password);
   }
   
   Scanner scan = new Scanner(System.in);
   Menu menu = new Menu();
   
    public void trainerMenu (ArrayList<Member> members) throws FileNotFoundException{
   
         boolean keepRunning = true;
         
         
         //chairman login
         
         System.out.println();
         System.out.println("Please enter the trainer password");
         System.out.println();
         
      
         int trainerCode = scan.nextInt();
         while (keepRunning){
          
         
      if (trainerCode != 2400){
      
         System.out.println("Wrong password");
         System.out.println("Please try again");
         }
         
         
      else {
      
         //Chairman main menu
         System.out.println();
         System.out.println("Hello mr. Trainer");
         System.out.println();
         System.out.println("1. Show competitors");
         System.out.println("2. assign competitions results");
         System.out.println("3. show top 5");
         System.out.println("4. back to main menu");
         
         
            //Create member
               int trainerOption = scan.nextInt();
            
            if (trainerOption == 1){
               
               menu.showCompete(members);
               
               
            }
            
            if (trainerOption == 2) {
            
               menu.assignComp(members);
            }
            
            if (trainerOption == 3){
            
               menu.top5();
            }
            
            
            if (trainerOption == 4){
               
               keepRunning = false;
            
            }
      }
      }
   
   }


}