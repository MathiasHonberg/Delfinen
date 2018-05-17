public class Senior extends Member{

   
   public Senior(String name, String sex, int age, String number, boolean comp, boolean active){
   
      super(name, sex, age, number, comp, active);   
   }
   
   public Senior(){
   
   
   }
   
   public void contingent(){
      super.contingent();
      if(activity() == true){
         System.out.println("\t1600 kr. ");
      }else{
      
         System.out.println("\t500 kr.");
      }

   }

   public void contin(){
      super.contin();
      if(activity() == true){
         System.out.println("\t1600 kr. ");
      }else{
      
         System.out.println("\t500 kr.");
      }

   }
}