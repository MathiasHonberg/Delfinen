public class Junior extends Member{

   
   public Junior(String name, String sex, int age, String number, boolean comp, boolean active){
   
      super(name, sex, age, number, comp, active);   
   }
   
   public Junior(){
   
   
   }
   
   public void contingent(){
      super.contingent();
      if(activity() == true){
         System.out.println("\t1000 kr. ");
      }else{
      
         System.out.println("\t500 kr.");
      }

   }
   
   public void contin(){
      super.contin();
      if(activity() == true){
         System.out.println("\t1000 kr. ");
      }else{
      
         System.out.println("\t500 kr.");
      }

   }

   

}