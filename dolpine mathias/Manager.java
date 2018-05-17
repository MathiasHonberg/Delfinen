public class Manager{

   private String name;
   private Account account;
   
   
   public Manager(String name, Account account){
   
      this.name = name;
      this.account = account;
   
   }
   
   public Manager(){
   
   }
   
   public void setName(String name){
   
      this.name = name;
   }
   
   public String getName(){
   
      return this.name;
   }
   
   public Account getAccount(){
   
      return this.account;
   }
   
   public String toString(){
   
   String text = "";
   
      text = text + "\nName:\n\t" + name;
      text = text + "\nPassword:\n\t" + getAccount();
      
      return text;

   }


}