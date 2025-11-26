import java.util.ArrayList;
import java.util.Scanner;



public class Main {

//    public ArrayList<User> all_usesrs = new ArrayList<>();
    public static BankMnager bankMnager = new BankMnager();
    //vaghti dastoor transfer dade mishe bayad in tabe
    //niz ejra shavad dar ebteda
    public static boolean check_transfer(String cardnumber_to){
        for(User usr : bankMnager.getAll_usesrs()){
            if(usr.getCardNumber().equals(cardnumber_to)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean edame = true;
        User currentuser = bankMnager.mainuser();

        while(edame){
            String input = scn.nextLine();

            String[] input_parts = input.split(" ");
            switch (input_parts[0]){
                case "exit" :
                    edame = false;
                    break;
                case "register":
                    bankMnager.register(input_parts[1],input_parts[2]
                            ,input_parts[3]+" "+input_parts[4]
                            ,input_parts[5],input_parts[6]);
                    break;
                case "login":
                    bankMnager.login(input_parts[1],input_parts[2]);
                    currentuser = bankMnager.username_User(input_parts[1]);
                    break;
                case "show":
                    currentuser.show_balance();
                    break;
                case "withdraw" :
                    currentuser.withdraw(input_parts[1]);
                    break;
                case "transfer":
                    boolean chek = check_transfer(input_parts[1]);
                    boolean check2 = currentuser.transfer(input_parts[2],chek);
                    if(check2)
                        bankMnager.Cardnumber_User(input_parts[1]).deposit(input_parts[2]);
                    break;
                case "logout":
                    currentuser.logout();

                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}