import java.util.*;
import java.io.*;

public class Delfinen{
      
   //Members
   Member k = new Member();
   Member[] members = new Member[30];
   int numberOfm = 0;
   Member[] m = getMember();
   ArrayList<String> am = new ArrayList<String>();
   //Scanner
   Scanner scan = new Scanner(System.in);
   //Managers
   Manager manager = new Manager();
   Manager[] managers = new Manager[3];
   Manager[] man = getManager();
   //Swimmers
   
   public Member[] getMember(){
   
      return members;
   }
   
   public Manager[] getManager(){
   
      return managers;
   }

      
//THE SYSTEM
   public void run() throws FileNotFoundException{
   
      addManagers(managers);
      createMembers(m);
      outerloop:
      //System loop
      while(true){
         String n = "";
         int hej = 0;
         boolean menu1 = true;
         boolean menu2 = true;
      
      //menu 1
         while(menu1){
           
            System.out.println();
            loginMenu(); 
            while(!scan.hasNextInt()){
               scan.nextLine();
               System.out.println("AntiJarl!");
            }
            int valg = scan.nextInt();
            if(valg != 1 && valg != 0){
            
               System.out.println("\nError, wrong number");
            //Log in 
            }else if(valg == 1){
            
               System.out.println("Enter Admin code: ");
               String pass = scan.next();
               if(pass.equals("888")){
            //Main menu
               innerloop:
               while(true){
                  mainMenu();
                  int x = scan.nextInt();
               
                  if (x == 1){
                     System.out.println("Enter Chairman code: ");
                     String pas = scan.next();
                     if(pas.equals("248")){
               //CHAIRMAN MENU
                        while(true){
                        System.out.println("Chairman:");
                        chairmanMenu();
                        int z = scan.nextInt();
                        if(z == 1){
                     
                           System.out.println("Creating new member\n");
                           System.out.print("Name: ");
                           String name = scan.next();
                           am.add(name);
                           System.out.println();
                           
                           System.out.print("Sex: ");
                           String sex = scan.next();
                           am.add(sex);
                           System.out.println();
                           
                           System.out.print("Age: ");
                           int age = scan.nextInt();
                           am.add(String.valueOf(age));
                           System.out.println();
                                          
                           System.out.print("Number: ");
                           String number = scan.next();
                           am.add(number);
                           System.out.println();
                           
                           System.out.print("Competitive:  ");
                           boolean comp = scan.nextBoolean();
                           if(comp == true){
                              am.add("true");
                           }else if(comp == false){
                              am.add("false");
                           }
                           System.out.println();
                           
                           System.out.print("Active: ");
                           boolean active = scan.nextBoolean();
                           if(active == true){
                              am.add("true");
                           }else if(active == false){
                              am.add("false");
                           }
                           System.out.println();
                           
                           if(age < 18){
                           //Junior
                              Member junior = new Junior(name, sex, age, number, comp, active);
                              m[numberOfm] = junior;
                           
                              System.out.println("The member was succesfully made as a Junior swimmer!");
                              System.out.print("Personal informations is:\n");
                              m[numberOfm].displayMember();
                              System.out.println();
                              
                              numberOfm++;
                              System.out.println();
                           }else if(age > 17 && age < 60){
                           //Senior
                              Member senior = new Senior(name, sex, age, number, comp, active);
                              m[numberOfm] = senior;
                           
                              System.out.println("The member was succesfully made as a Senior Swimmer!");
                              System.out.print("\nPersonal informations is:\n");
                              m[numberOfm].displayMember();
                              System.out.println();
                              System.out.println(am);
                              
                              numberOfm++;
                              System.out.println();
                           
                           }else{
                           //Oldie
                              Member oldie = new Oldie(name, sex, age, number, comp, active);
                              m[numberOfm] = oldie;
                           
                              System.out.println("The member was succesfully made as an Oldie Swimmer!");
                              System.out.print("\nPersonal informations is:\n");
                              m[numberOfm].displayMember();
                              System.out.println();
                              
                              numberOfm++;
                              System.out.println();
                     
                           } 
                        //Edit member
                           }else if(z == 2){
                              System.out.println("Which member would you like to Edit? ");
                              for(int i = 0; i < members.length; i++){
                                 if(members[i] != null){  
                                 System.out.println(i + ". " + members[i]);
                                 
                                 }
                             }
                             System.out.println();
                             int v = scan.nextInt();
                             editMember(v);
   
                           }else if(z == 3){
                     
                              break; 
                           }    
                        }
                     }else{
                     
                        System.out.println("You have entered a wrong number!");
                     }
               //CASHIER MENU
                  }else if(x == 2){
                     System.out.println("Enter Cashier code: ");
                     String passs = scan.next();
                     if(passs.equals("228")){
                        while(true){
                           cashierMenu();
                           int b = scan.nextInt();
                           if(b == 1){
                           
                              getArrears();
                           }else if(b == 2){
                              
                              for(int i = 0; i < 3; i++){  
                                 
                                    System.out.print("Member: " + members[i].getName());
                                    members[i].contin();
                                    System.out.println();
                               
                              }
   
                           }else if(b == 3){
                           
                              break;
                           }
                        }
                     }else{
                     
                        System.out.println("You have entered a wrong code");
                     }
                       
                        
              //TRAINER MENU          
                  }else if(x == 3){
                     
                     System.out.println("Enter Trainer code: ");
                     String pa = scan.next();
                     if(pa.equals("1337")){
                        while(true){
                           
                           trainerMenu();
                           int vlad = scan.nextInt();
                              if(vlad == 1){
                              
                                 showCompetitors();
                                                   
                              }else if(vlad == 2){
                              
                                 //TODO!!
                              }else if(vlad == 3){
                              
                                 //TODO!!
                              }else if(vlad == 4){
                              
                                 break;
                              }else{
                              
                                 System.out.println("You have entered a wrong code!"); 
                              }
                          
                        }
                     }else{
                     
                        System.out.println("You have entered a wrong code!");
                     } 
               //LOG OUT 
                  }else if ( x == 4){
                  
                     System.out.println("Are you sure? yes=1   no=2");
                     int sure = scan.nextInt();
                     if(sure == 1){
                        System.out.println();
                        break innerloop;  
                     }
                  }
               }
         }else{
         
            System.out.println("You have entered a wrong number!");
         }
      }else if(valg == 0){
      
         saveMembers(am);
         break outerloop;
      }
   } 
      //Menu 2
         /*innerloop:
         while(menu2){
         
            System.out.println();
            System.out.println("Hej " + n + "!");
            menu2();
            int valg = scan.nextInt();
            switch(valg){
            
               case 0:
                  break outerloop;
               case 1:
                  m[hej].displayMember();
                  m[hej].contingent();
                  break;
               
               case 2:
                  
                  break;
                  
               case 3:
                  System.out.println("1. Passive");
                  System.out.println("2. Active");
                  int x = scan.nextInt();
                  m[hej].activity(x);

                  break;   
               case 4:
                  System.out.println("Are you sure? yes=1   no=2");
                  int sure = scan.nextInt();
                  if(sure == 1){
                     System.out.println();
                     menu2 = false;
                  }else if(sure == 2){
                  
                  }

                  break;
            }
         }  
      }*/
   }
   }
   
   public void loginMenu(){
   
      System.out.println("\nWelcome to PogChamp Swimmingclub!");
      System.out.println("1. Log in");
   }
   
   public void mainMenu(){
   
      System.out.println();
      System.out.println("Main menu: ");
      System.out.println("1. Chairman");
      System.out.println("2. Cashier");
      System.out.println("3. Trainer");
      System.out.println();
      System.out.println("4. Log out");
  
   
   }
   
   public void chairmanMenu(){
     
      System.out.println("1. Create new member");
      System.out.println("2. Edit member");
      System.out.println("3. Back to main menu");
   }
   
   public void cashierMenu(){
   
      System.out.println("Cashier:");
      System.out.println("1. Member status");
      System.out.println("2. Members in arrears");
      System.out.println("3. Back to main menu");
   }
   
   public void trainerMenu(){
   
      System.out.println("Trainer:");
      System.out.println("1. Show competitors");
      System.out.println("2. Assign competition results");
      System.out.println("3. Show top 5");
      System.out.println("4. Back to main menu");
   
   }
   
   public void saveMembers(ArrayList<String> am) throws FileNotFoundException{
   
      PrintStream output = new PrintStream(new File("Members.txt"));
      int i = 0;
      while(i < am.size()){
         output.print(am.get(i));
         output.println();
         i++;
      }    
   } 
   
   public void createMembers(Member[] m) throws FileNotFoundException{
         
         Scanner t = new Scanner(new File("Members.txt"));
         numberOfm = 0;
         if(t.hasNextLine()){
            while(t.hasNextLine()){
         //Læs Filen
               String name = t.nextLine();
               am.add(name);
               String sex = t.nextLine();
               am.add(sex);
               String age = t.nextLine();
               am.add(age);
               String number = t.nextLine();
               am.add(number);
               String comp = t.nextLine();
               am.add(comp);
               String active = t.nextLine();
               am.add(active);
               int alder = Integer.parseInt(age);
               boolean competitive = Boolean.valueOf(comp);
               boolean act = Boolean.valueOf(active); 
            //Lav users ud af det
               if(alder < 18){
               //Junior
                  Member junior = new Junior(name, sex, alder, number, competitive, act);
                  m[numberOfm] = junior;
                  
                  numberOfm++;
                  
               }else if(alder > 17 && alder < 60){
               //Senior
                  Member senior = new Senior(name, sex, alder, number, competitive, act);
                  m[numberOfm] = senior;
                  
                  numberOfm++;
                 
               
               }else{
               //Oldie
                  Member oldie = new Oldie(name, sex, alder, number, competitive, act);
                  m[numberOfm] = oldie;
                  
                  numberOfm++;
               } 
            
         }
      }
      
   }
   
   public void addManagers(Manager[] managers){
   
      managers[0] = new Manager("Chairman", new Account("248"));
      managers[1] = new Manager("Cashier", new Account("228"));
      managers[2] = new Manager("Trainer", new Account("1337"));
   }
   
   public void editMember(int x){
   
      
      System.out.println("What would you like to edit");
      System.out.println("1. Name");
      System.out.println("2. Age");
      System.out.println("3. Number");
      System.out.println("4. Statement");

      int z = scan.nextInt();
      if(z == 1){
      
         System.out.print("New name: ");
         String c = scan.next();
         members[x].setName(c);
         System.out.println("New name is now: " + c);
      }else if(z == 2){
      
         System.out.print("New age: ");
         int v = scan.nextInt();
         members[x].setAge(v);
         System.out.println("New age is now: " + v);
      }if(z == 3){
      
         System.out.print("New Number: ");
         String b = scan.next();
         members[x].setNumber(b);
         System.out.println("New number is now: " + b);
      }if(z == 4){
      
         System.out.print("Role: ");
         boolean n = scan.nextBoolean();
         members[x].setComp(n);
         System.out.println("New role is now: " + members[x].getComp());
         
         System.out.println("1. Passive");
         System.out.println("2. Active");
         int c = scan.nextInt();
         m[x].activity(c);
      }
      
      System.out.println("New information: ");
      members[x].displayMember();
      members[x].activity();
      System.out.println();
   }
   
   public void getArrears(){
         
      for(int i = 0; i < members.length; i++){
         if(members[i] != null){  
         
            System.out.print("Member: " + members[i].getName());
            members[i].contingent();
            System.out.println();
         }
      }
   }
 
//Show competitors   
   public void showCompetitors(){
   
      int j = 0;
      for(int i = 0; i < members.length; i++){
      
         if(members[i] != null){
         
            if(members[i].getCompetitive() == true){
            
               if(members[i].getAge() < 18){
               
                  System.out.println(j + ". " + members[i].getName() + " - Junior Team");
                  j++;
               }else if(members[i].getAge() > 17){
               
                  System.out.println(j + ". " + members[i].getName() + " - Senior Team");
                  j++; 
               }
            }
         }
      }
      System.out.println();
   }
   
//Assign competition results for members 
   /*public void assignComp(){
   
      System.out.println("Which competitor? ");
      int j = 0;
      for(int i = 0; i < members.length; i++){
      
         if(members[i] != null){
         
            if(members[i].getCompetitive() == true){
               
                  System.out.println(j + ". " + members[i].getName());
                  j++; 
               }
            }
         }
         
      int q = scan.nextInt();
      
   }*/
   
}