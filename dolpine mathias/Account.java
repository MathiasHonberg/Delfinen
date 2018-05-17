public class Account{

   //Password
   private String password;
   
   
   public Account(String password){
   
      this.password = password;
   }
   
   public Account(){
   
   
   }
   
   public String getPassword(){
   
      return this.password;
   }
   
   public void setPassword(String password){
   
      this.password = password;
   }
   
   public String toString(){
   
      String text = "";
      text = text + "" + password;
      
      return text;
   }

}