import java.util.Scanner;

public class Member{

   private String name;
   private String sex;
   private int age;
   private String number;
   private boolean comp;
   private boolean active;
 
   Account a = new Account();
   
   public Member(String name, String sex, int age, String number, boolean comp, boolean active){
   
      this.name = name;
      this.sex = sex;
      this.age = age;
      this.number = number;
      this.comp = comp;
      this.active = active;
   
   }
   
   public Member(){
   
   
   }
   
//SETTERS
   public void setName(String name){
   
      this.name = name;
   } 
   
   public void setSex(String Sex){
   
      this.sex = sex;
   } 
   
   public void setAge(int age){
   
      this.age = age;
   } 
   
   public void setNumber(String number){
   
      this.number = number;
   } 
   
   public void setActive(boolean active){
   
      this.active = active;
   }
   
   public void setComp(boolean comp){
   
      this.comp = comp;
   }

   
//GETTERS
   public String getName(){
   
     return this.name;
   } 
   
   public String getSex(){
   
     return this.sex;
   } 
   
   public int getAge(){
   
      return this.age;
   }
   
   public String getNumber(){
   
      return this.number;
   }
   
   public String getActive(){
   
      if(active == false){
      
         return "Passive";
      }else if(active == true){
      
         return "Active";
      }
      return "";
   } 
   
   public String getComp(){
   
      if(comp == false){
      
         return "Exerciser";
      }else if(comp == true){
      
         return "Competitive";
      }
      return "";
   } 
   
   public boolean getCompetitive(){
   
      return this.comp;
   }
   
   public boolean activity(){
   
      return this.active;
   }
   
   
//tostring metode
   public String toString(){
   
   String text = "";
   
      text = text + "" + name;
      
      return text;

   }
//Display member  
   public void displayMember(){
   
      System.out.print("\nName:\n\t" + name);
      System.out.print("\nSex:\n\t" + sex);
      System.out.print("\nAge:\n\t" + age);
      System.out.print("\nNumber:\n\t" + number);
      System.out.print("\nRole:\n\t" + getComp());
      System.out.print("\nActivity:\n\t" + getActive());
      contingent();
   }
//Shows contingent to be paid  
   public void contingent(){
   
      System.out.println("\nContingent to be paid annually: ");
   }
//Change activty   
   public void activity(int a){
   
      if(a == 1){
      
         setActive(false);
         System.out.println("You are now passive!");
         System.out.println("The changes of payment can be seen under \"My informations \"");

      }else if(a == 2){
      
         setActive(true);
         System.out.println("You are now Active!");
         System.out.println("The changes of payment can be seen under \"My informations \"");
      }else{
      
         System.out.println("You have entered a wrong number");
      }
   }
   
   public void contin(){
   
      System.out.println("\nPayment in arrears: ");
   }
      
}