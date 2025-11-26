
public class User {
    private String username;
    private String password;
    private String fullName;
    private String cardNumber;
    private String phoneNumber;
    private String email;
    private String balance;

    private boolean logincheck = false;

    public User(String username, String password
            , String fullName, String cardNumber, String phoneNumber
            , String email, String balance) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.balance = balance;
    }

    //tabe haye getter o setter monaseb misazam
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    //baghi tabe haro ba password dastresi midam

    public void login(String password){
        if(password.equals(this.password)){
            logincheck = true;
            System.out.println("login successful !");
        }
        else {
            logincheck = false;
            System.out.println("Error: "+"login failed !-wrong password");
        }
    }

    public void show_balance() {
        if(logincheck){
            System.out.printf("Current balance: "+balance);
        }
        else System.out.println("Error: You should login first.");
    }

    public void deposit(String amount){
        if(logincheck){

            double newbalance = Double.parseDouble(balance) + Double.parseDouble(amount);
            balance = String.valueOf(newbalance);
            System.out.printf("deposit successful !"+" - "+
                    "Current balance: "+balance);
        }
        else System.out.println("Error: You should login first.");
    }

    public void withdraw(String amount){
        if(logincheck){
            double newbalance = Double.parseDouble(balance) - Double.parseDouble(amount);
            if(newbalance < 0){
                System.out.println("Error: not enough deposit "+
                        "andaze jibet kharj kon !");
            }
            else{
                balance = String.valueOf(newbalance);
                System.out.printf("Withdraw successful !"+" - "+
                        "Current balance: "+balance);
            }
        }
        else System.out.println("Error: You should login first.");
    }

    public boolean transfer(String amount,boolean cardChesk){
        if(logincheck){
            if(cardChesk) {
                double newbalance = Double.parseDouble(balance) - Double.parseDouble(amount);
                if (newbalance < 0) {
                    System.out.println("Error: not enough deposit " +
                            "andaze jibet kharj kon !");
                    return false;
                } else {
                    balance = String.valueOf(newbalance);
                    System.out.printf("Transferred successfully !");
                    return true;
                }
            }
            else System.out.println("Error: The Cardnumber doesnt exist.");
            return false;
        }
        else System.out.println("Error: you should login first.");
        return false;
    }

    public void logout(){
        if(logincheck){
            logincheck = false;
            System.out.println("Logout successful.");
        }
        else System.out.println("Error: you should login first.");
    }

    public void transfer_daryafti(String amount){
        double newbalance = Double.parseDouble(balance) + Double.parseDouble(amount);
        balance = String.valueOf(newbalance);
    }


}
