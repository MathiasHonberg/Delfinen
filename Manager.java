import java.util.*;
import java.io.*;

public class Manager {
   
   //Attributes
   private String name;
   private int age;
   private int password;
   
   Swimclub swimclub = new Swimclub(0.0);
   //Member member = new Member("", "", 00, 00, true, true, discipline);
      
   
   //Constructor
   public Manager (String name, int age, int password){
   
      this.name = name;
      this.age = age;
      this.password = password;
      
   }
   
   //Getters
   public String getName(){
   
      return this.name;
   }
   
   public int getAge(){
   
      return this.age;
   }
   
   public int getPassword(){
   
      return this.password;
   }
   
   //Setters
   
   public void setName(String name){
   
      this.name = name;
   }
   
   public void setAge(int age){
   
      this.age = age;
   }
   
   public void setPassword(int password){
   
      this.password = password;
   }
   
   
         
      
}