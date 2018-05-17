public class Crawl extends Swimclub{

   public Crawl(double time){
   
      super(time);
   }
   
   public String getName(){
   
      return "200 Crawl";
   }
   
   public void displayDisc(){
   
      System.out.print("\nName:\n\t" + getName());
      System.out.print("\nTime:\n\t" + getTime());
   }
   
   public String toString(){
   
      String text = "";
   
      text = text + "\t200 Crawl";
      text = text + "\t" + getTime();
      
      return text;
   }


}