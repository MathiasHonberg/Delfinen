import java.util.*;
import java.io.*;

public class Member{

   //Attributes
   private String name;
   private String lastName;
   private int age;
   private int phoneNumber;
   private boolean state;
   private boolean role;
   private int subscription;
   private Swimclub swimclub;
   
   
   
   //Constructor
   public Member (String name, String lastName, int age, int phoneNumber, boolean state, boolean role, int subscription){
   
      this.name = name;
      this.lastName = lastName;
      this.age = age;
      this.phoneNumber = phoneNumber;
      this.state = state;
      this.role = role;
      this.subscription = subscription;
      //this.discipline = discipline;
      
   }
   
   public Member (String name, Swimclub swimclub){
   
      this.name = name;
      this.swimclub = swimclub;   
   }
   
   //Getters
   public String getName(){
   
      return this.name;
   }
   
   public String getLastName(){
   
      return this.lastName;
   }
   
   public int getAge(){
   
      return this.age;
   }
   
   public int getPhoneNumber(){
   
      return this.phoneNumber;
   }
   

   public boolean getState(){
   
      return this.state;   
   }
   
   public boolean getRole(){
   
      return this.role;
   }
   
   public int getSubscription(){
   
      return this.subscription;
   }
   
   public void getDisc(){
   
      System.out.print("\nName:\n\t" + swimclub.getName());
      System.out.print("\nTime:\n\t" + swimclub.getTime());

   }
   
   public double getTime(){
   
      return swimclub.getTime();
   }
   
  /* public Swimclub getDiscipline(){
   
      return this.discipline;
   }
   */
   
   //Setters
   public void setName(String name){
   
      this.name = name;
   }
   
   public void setLastName(String lastName){
   
      this.lastName = lastName;
   }
   
   public void setAge (int age){
   
      this.age = age; 
   }
   
   public void setPhoneNumber(int phoneNumber){
   
      this.phoneNumber = phoneNumber;
   }
   
   public void setState(boolean state){
   
      this.state = state;
   }
   
   public void setRole(boolean role){
   
      this.role = role;
   }
   
   public void setSubscription(int subscription){
   
      this.subscription = subscription;
   }
   
  /* public void setDiscipline(Swimclub discipline){
   
      this.discipline = discipline;
   }*/
   
   
   
   
   
   
   public String toString(){
   
      return name;
   }

}
