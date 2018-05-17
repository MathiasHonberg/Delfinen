import java.util.*;
import java.io.*;

public class Menu{

   Scanner scan = new Scanner(System.in);
   Member member = new Member("","",00,00,true,true,00);
   Member[] crawl = new Member[10];
   Member[] bf = new Member[10];
   int numberOfc = 0;
   int numberOfb = 0;
   ArrayList<Member> bff = new ArrayList<Member>();
   ArrayList<Member> craawl = new ArrayList<Member>();

      
   public void addMember (ArrayList<Member> members) throws FileNotFoundException{
    String text = "";

      File f = new File("Members.txt");
      Scanner input = new Scanner(f);

   
      while (input.hasNextLine()){
      
         text = input.nextLine();
         
         Scanner input1 = new Scanner(text);
         
         String fornavn = input1.next();
         String efternavn = input1.next();
         int alder = input1.nextInt();
         int tele = input1.nextInt();
         boolean status = input1.nextBoolean();
         boolean rolle = input1.nextBoolean();
         int betaling = input1.nextInt();
         

   
       members.add(new Member(fornavn, efternavn, alder, tele, status, rolle, betaling));     
       
   }
   

   }
   
  
      String text = "";
            
            
      String name1 = "";
      String lastName1 = "";
      int age1 = 0;
      int phoneNumber1 = 0;
      String state2 = "";
      String role2 = "";
      int statePayment = 0;
      boolean state1 = true;
      boolean role1 = true;
      int subscription = 0;
      
   public void fileMember () throws FileNotFoundException{
   
               
       //  members.add(new Member(fornavn, efternavn, alder, tele, status, rolle, betaling));
         
         
         
      } 

   
   
   public void chairmanOption1 (ArrayList<Member> members) throws FileNotFoundException{
      
             
         System.out.println("Name");
         String name = scan.next();
         System.out.println();
         name1 = name;
         
         System.out.println("Last Name");
         String lastName = scan.next();
         System.out.println();
         lastName1 = lastName;
         
         System.out.println("Age");
         int age = scan.nextInt();
         System.out.println();
         age1 = age;
         
         System.out.println("Phone Number");
         int phoneNumber = scan.nextInt();
         System.out.println();
         phoneNumber1 = phoneNumber;
         
         System.out.println("State");
         System.out.println("1. Active   2. Passive");
         int state = scan.nextInt();
         if (state == 1){
            state1 = true;
            state2 = "Active";
            }
         else if (state == 2){
            state1 = false;
            state2 = "passive";
         }   
         
         System.out.println();
         
         System.out.println("Role");
         System.out.println("1. Exerciser    2. Competist");
         int role = scan.nextInt();
         if (role == 1){
            role1 = true;
            role2 = "Exerciser";
         }
         else if (role == 2){
            role1 = false;
            role2 = "Competist";
         }
         System.out.println();
         
         
      
      if (age < 18) {
      
        if (state1 == false){
        
        subscription = 500;
        }
        else {
        subscription = 1000;
        }
             
         System.out.println("You have created a new member");
         System.out.println();
         System.out.println("Junior member");
         printMember(); 
         
         members.add(new Member (name, lastName, age, phoneNumber, state1, role1, subscription));

     }else if (age > 17 && age < 60){
     
         if (state1 == false){
         
            subscription = 500;
         }
         else {
            
            subscription = 1600;
         }
         
         System.out.println("You have created a new member");
         System.out.println();
         System.out.println("Senior member");
         printMember();         
         members.add(new Member (name, lastName, age, phoneNumber, state1, role1, subscription));
     
     }else {
         
         if (state1 == false){
         
            subscription = 500;         }
         else{
         
            subscription = 1600 - ((1600*25)/100);
         }
         
         System.out.println("You have created a new member");
         System.out.println();
         System.out.println("Senior member");
         printMember();         
         members.add(new Member (name, lastName, age, phoneNumber, state1, role1, subscription));
 
   
   
   }
   }
   
   public void chairmanOption2 (ArrayList<Member> members) throws FileNotFoundException {
   
         boolean keepRunning = true;
         
         System.out.println("Which member would you like to edit? ");
         
      for (int i = 0; i < members.size(); i++){
         System.out.println();
         System.out.println(i + ". " + members.get(i).getName() + " " + members.get(i).getLastName());
      }
         while (keepRunning) {
      int xMember = scan.nextInt();
      if (xMember > members.size()){
         
         System.out.println("INVALID NUMBER");
         
      }
      else{
         
         editMember();
      
            int whichEdit = scan.nextInt();
         
         if (whichEdit == 1){
         
            System.out.print("New name: ");
            String newName = scan.next();
            members.get(xMember).setName(newName);
            System.out.println("Name has been changed to: " + members.get(xMember)); 
            keepRunning = false;
         
         }else if (whichEdit == 2){
         
            System.out.println("New last name: ");
            String newLastName = scan.next();
            members.get(xMember).setLastName(newLastName);
            System.out.println("Last name has been changed to: " + members.get(xMember).getLastName());
            keepRunning = false;
         
         }else if (whichEdit == 3){
         
            System.out.print("New age: ");
            int newAge = scan.nextInt();
            members.get(xMember).setAge(newAge);
            System.out.println("Age has been changed to: " + members.get(xMember).getAge());
            
            if (newAge < 18){
            
               members.get(xMember).setSubscription(1000);
               System.out.println();
               System.out.println("Age is now under 18 and the subscription has been changed to: " + members.get(xMember).getSubscription() + "kr. / year");
            
            }else if (newAge > 17 && newAge < 60){
            
               members.get(xMember).setSubscription(1600);
               System.out.println();
               System.out.println("Age is now over 18 and the subscription has been changed to: " + members.get(xMember).getSubscription() + "kr. / year");

            
            }else if (newAge > 60) {
            
               members.get(xMember).setSubscription(1600 - ((1600*25)/100));
               System.out.println();
               System.out.println("Age is now over 60 and the subscription has been changed to: " + members.get(xMember).getSubscription() + "kr. / year");

            }
             
            keepRunning = false;

         }else if (whichEdit == 4){
         
            System.out.print("New phone number: ");
            int newPhoneNumber = scan.nextInt();
            members.get(xMember).setPhoneNumber(newPhoneNumber);
            System.out.println("Phone number has been changed to: " + members.get(xMember).getPhoneNumber()); 
            keepRunning = false;

         }else if (whichEdit == 5){
         
            System.out.println("New state: ");
            System.out.println("1. Active    2. Passive");
            int newState = scan.nextInt();
            
            if (newState == 1){
            state1 = true;
            state2 = "Active";
            System.out.println("State has been changed to: " + state2);
               if (members.get(xMember).getAge() < 18){
               
                  members.get(xMember).setSubscription(1000);
                  System.out.println("Junior membership have been activated and subscription is now: " + members.get(xMember).getSubscription() + " kr. / year");   
                  keepRunning = false;
               }
               
               else if (members.get(xMember).getAge() > 17 && members.get(xMember).getAge() < 60){
               
                  members.get(xMember).setSubscription(1600);
                  System.out.println("Senior membership have been activated and subscription is now: " + members.get(xMember).getSubscription() + " kr. / year");   
                  keepRunning = false;
               }
               
               else if (members.get(xMember).getAge() > 60){
               
                  members.get(xMember).setSubscription(1600 - ((1600*25)/100));
                  System.out.println("Oldie membership have been activated and subscription is now: " + members.get(xMember).getSubscription() + " kr. / year");   
                  keepRunning = false;
               }
            
            }
            else if (newState == 2){
            state1 = false;
            state2 = "passive";
            System.out.println("State has been changed to: " + state2);
            members.get(xMember).setSubscription(500);
            System.out.println("Subscription has been changed to " + members.get(xMember).getSubscription() + "kr. / year");
            keepRunning = false;
            }
            
         }else if (whichEdit == 6) {
         
         
            System.out.println("New Role: ");
            System.out.println("1. Exerciser     2. Competist");
            int newRole = scan.nextInt();
            
             if (newRole == 1){
            role1 = true;
            role2 = "Exerciser";
            System.out.println("Role has been changed to: " + role2);
         }
            else if (newRole == 2){
            role1 = false;
            role2 = "Competist";
            System.out.println("Role has been changed to: " + role2);
            keepRunning = false;
         }
            System.out.println();      
      }
      }     
      } 
      }
      
      public void printMember(){
   
     
         System.out.println();
         System.out.println("Name:         " + name1);
         System.out.println("Last name:    " + lastName1);
         System.out.println("Age:          " + age1);
         System.out.println("Phone number: " + phoneNumber1);
         System.out.println("State:        " + state2);
         System.out.println("Role:         " + role2); 
         System.out.println("Payment:      " + subscription + "kr. / year");

   
   }
   
      public void editMember(){
      
      
         System.out.println();
         System.out.println("What would you like to change?");
         System.out.println();
         System.out.println("1. Name ");
         System.out.println("2. Last name ");
         System.out.println("3. Age ");
         System.out.println("4. Phone Number ");
         System.out.println("5. State ");
         System.out.println("6. Role ");
      }
  




   
   //Login menuen 
   public void loginMenu () throws FileNotFoundException{
   
      boolean KeepRunning = true;
      
      
      while (KeepRunning){
         
      System.out.println("Welcome");
      System.out.println();
      System.out.println("Please enter admin. login");
      
      int adminLogin = scan.nextInt();
      
      
      //antiJarl
      if (adminLogin != 1995){
         System.out.println("INVALID CODE");
         System.out.println();
         }
      else {
         System.out.println("Welcome to Dolfine Swimclub"); 
         KeepRunning = false;  
      }
      
   
   }

}

   public void mainMenu () throws FileNotFoundException{
   
      boolean keepRunning = true;
      
      while (keepRunning){
      
         System.out.println();
         System.out.println("1. Chairman");
         System.out.println("2. Cashier");
         System.out.println("3. Trainer");
         System.out.println("4. Log Out");
         keepRunning = false;
      
   }
   }
   
   public void showCompete (ArrayList<Member> members) {
   
      for (int i = 0; i < members.size(); i++){
      
         if(members.get(i).getRole() == true){
         
            if(members.get(i).getAge() < 18){
            
               System.out.println(members.get(i).getName() + " - Junior Team");
             
             
            }else if(members.get(i).getAge() > 17){
            
               System.out.println(members.get(i).getName() + " - Senior Team");
            }
            
         }
      }
      System.out.println();
   }
   
   public void assignComp(ArrayList<Member> members){
   
         System.out.println("Which competitor? ");
      int j = 0;
      for(int i = 0; i < members.size(); i++){
      
         
            if(members.get(i).getRole() == true){
               
               System.out.println(j + ". " + members.get(i).getName());
               j++; 
            
         }
      }
      
      int q = scan.nextInt();
      String name = members.get(q).getName();
      System.out.println("Swimming disciplines: ");
      System.out.println("1. 200 Crawl");
      System.out.println("2. 200 Butterfly");
      int e = scan.nextInt();
      if(e == 1){
      
         System.out.print("Time: ");
         double z = scan.nextDouble();
         Swimclub cra = new Crawl(z);
         Member w = new Member(name, cra);
         crawl[numberOfc] = w;
         boolean notFound = true;
         if(craawl.size() != 0){
            for(int i = 0; i < craawl.size(); i++){

               if(z < craawl.get(i).getTime()){
               
                  craawl.add(i, w);
                  notFound = false;
                  break;
               }
            }
            if(notFound == true){
            
               craawl.add(w);
            }
                  
         }else{
         
            craawl.add(w);
         }
         
         System.out.println();
         System.out.println("Swimming results assigned to " + members.get(q).getName() + ":");
         crawl[numberOfc].getDisc();
         numberOfc++;
         System.out.println();
         
      }else if(e == 2){
      
         System.out.print("Time: ");
         double d = scan.nextDouble();
         Swimclub butterfly = new Butterfly(d);
         Member p = new Member(name, butterfly);
         bf[numberOfb] = p;
         boolean nf = true;
         if(bff.size() != 0){
            for(int i = 0; i < bff.size(); i++){
            
               if(d < bff.get(i).getTime()){
               
                  bff.add(i, p);
                  nf = false;
                  break;
               }
               
            }
            if(nf == true){
            
               bff.add(p);
            }     
         }else{
         
            bff.add(p);
         }   
         System.out.println();
         System.out.println("Swimming results assigned to " + name + ":");
         bf[numberOfb].getDisc();
         numberOfb++;
         System.out.println();
         
      }else{
      
         System.out.println("You have entered a wrong number!");
      }
      
   }
   
    public void top5(){
   
      System.out.println("200 Crawl top 5: ");
      for(int i = 0; i < craawl.size(); i++){
             
         System.out.println((i+1) + ". " + craawl.get(i).getName() + " - " + craawl.get(i).getTime());
          
      }
      
      System.out.println();
      
      System.out.println("200 Butterfly top 5: ");
      for(int i = 0; i < bff.size(); i++){
      
         System.out.println((i+1) + ". " + bff.get(i).getName() + " - " + bff.get(i).getTime());
            
      }
      System.out.println();
      
   }




   }
   
   
   

      

