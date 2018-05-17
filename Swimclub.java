import java.util.*;
import java.io.*;

public class Swimclub {

   private String name;
   private double time;
   
   public Swimclub (double time){
   
      
      this.time = time;
   }
   
   public String getName(){
   
      return this.name;
   }
   
   public double getTime(){
   
      return this.time;
   }
   
   public void setName(String name){
   
      this.name = name;
   }
   
   public void setTime(double time){
   
      this.time = time;
   }
   
   public String toString(){
   
      String text = "";
      
      text = text + "" + name;
      text = text + "" + time;
      
      return text;
   }
   
   
   public void displayDisc (){
   
      System.out.print("\nName:\n\t" + name);
      System.out.print("\nTime:\n\t" + time);
   }
   
      }