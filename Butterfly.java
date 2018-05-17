public class Butterfly extends Swimclub{

   public Butterfly(double time){
   
      super(time);
   }
   
   public String getName(){
   
      return "200 Butterfly";
   }
   
   public void displayDisc(){
   
      System.out.print("\nName:\n\t" + getName());
      System.out.print("\nTime:\n\t" + getTime());
   }
   
   public String toString(){
   
      String text = "";
   
      text = text + "\t200 Butterfly";
      text = text + "\t" + getTime();
      
      return text;
   }

}