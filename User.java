import java.util.Scanner;
public class User{
  String userId;
  String password;
  Date registerDate;
  public String setUserId(String id){
    userId = id;
  }
  public String setPassword(String pw){
    password = pw;
  }
  public void Login(){
    Scanner login = new Scanner(System.in);
    System.out.println("Username: ");
    String inpUser = login.nextLine();
    System.out.println("Password: ");
    String inpPass = login.nextLine();
    if(inpUser.equals(userId) && inpPass.equals(password)){
    System.out.println("Login Successful");
    return true;
  }
  else {
    System.out.println("Login Unsuccessful");
  }
  return false;
}
}
