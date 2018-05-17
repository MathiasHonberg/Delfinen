import java.util.*;
import java.io.*;

public class Main{

   public static void main(String[] args)throws FileNotFoundException{
   
      Menu menu = new Menu();
      Chairman chairman = new Chairman("", 00, 00);
      Cashier cashier = new Cashier("", 00, 00);
      Trainer trainer = new Trainer("",00,00);
      Swimclub swimclub = new Swimclub(0.0);
      Member member = new Member("","",00,00,true,true,00);
      ArrayList<Member> members = new ArrayList<Member>();
      menu.addMember(members);
      
     
      //login Menuen
      menu.loginMenu();
      
      
      
      //Main Menu
       boolean keepRunning = true;
      while (keepRunning){
      menu.mainMenu();
      
      int option;
      option = getInt("");
     
      
      
      switch (option) {
      
      //Chairman Menu
         case 1:
           chairman.chairmanMenu(members);
            
            break;
            
         case 2:
            cashier.cashierMenu(members);
            
            break;
            
         case 3:
            trainer.trainerMenu(members);
         
            break;   
            
         case 4: 
            PrintStream output = new PrintStream (new File ("Members.txt"));
            
            for (int i = 0; i < members.size(); i++){
               output.println(members.get(i).getName() + " " + members.get(i).getLastName() + " " + members.get(i).getAge() + " " + members.get(i).getPhoneNumber() + " " + members.get(i).getState() + " " + members.get(i).getRole() + " " + members.get(i).getSubscription());
            }
            System.out.println("Have a nice day!");
            keepRunning = false;
            break;   
         default:
            System.out.println("Must be a number from 1-3");
               
            
 
      }
      }
      }
      
    public static int getInt(String prompt){
              Scanner scanInt = new Scanner(System.in);
              System.out.println(prompt);
            //antijarl ( scanInt.hasNextInt() )
            while (!scanInt.hasNextInt()){
               //smid det næste væk, når det ikk er en int
               scanInt.next();
               System.out.println(prompt);
               
            
            }
            
            return scanInt.nextInt();
         

         }
   
           
   
   

}