import java.util.ArrayList;

public class BankMnager {
    private static ArrayList<User> all_usesrs = new ArrayList<>();
    private User currentuser = new User("MainUser",
            "Bank@84mrlat","Bank Rozhina",
            "6037000000000000","09330606704"
            ,"Rozhina@aut.com","0.0");

    public BankMnager(){

    }

    public User mainuser(){
        return currentuser;
    }

    public void addUser(User user) {
        all_usesrs.add(user);
    }



    public ArrayList<User> getAll_usesrs() {
        return all_usesrs;
    }

    public static String makecardnumber(){
        String cardNumber = "6037";
        for(int i = 0;i<3;i++){
            //chahar tayi ijad mikonam cardnumber ro
            int qrand = (int)(Math.random()*1001);
            cardNumber += String.valueOf(qrand);
        }
        //check kardan inke tekrari nabashe
        for(User user : all_usesrs){
            if(cardNumber.equals(user.getCardNumber())){
                cardNumber = makecardnumber();
            }
        }
        return cardNumber;
    }

    //tabe register
    public void register(String username, String password
            , String FullName, String PhoneNumber,
                         String Email) {
        //ebteda barresi yekta bodan username
        for(User user : all_usesrs){
            if(user.getUsername().equals(username)){
                System.out.println("Error: "+"invalid username - " +
                        " username already exists.");
                return;
            }

        }
        //barrasi valid boodan shomare telefon
        //aya ba 09 shro misha?
        if(!(PhoneNumber.startsWith("09"))){
            System.out.println("Error: "+"invalid phone number" +
                    " Phone number should start with 09...");
            return;
        }
        //aya 11 raghamie?
        if(PhoneNumber.length() != 11){
            System.out.println("Error: "+"invalid phone number" +
                    " Phone number should contain 11 digits");
            return;
        }
        //aya tamam digit hast Phone number?
        for(char c : PhoneNumber.toCharArray()){
            if(!Character.isDigit(c)){
                System.out.println("Error: "+"invalid phone number" +
                        " Phone number should only contain digits");
                return;
            }
        }
        //hala validation email ro anjam midim
        //hatman bayad fght yeki @ dashte bashe
        if(!Email.contains("@")){
            System.out.println("Error: "+"invalid email" +
                    " Email should contain @.");
            return;
        }
        //aya faghat yeki dare ?

        String[] emailparts = Email.split("@");

        if(emailparts.length != 2){
            System.out.println("Error: "+"invalid email" +
                    " Email should contain only 1 @.");
            return;
        }
        if (emailparts[0].isEmpty()){
            System.out.println("Error: "+"invalid email" +
                    " Email should contain characters before @.");
            return;
        }
        if(!emailparts[1].equals("aut.com")){
            System.out.println("Error: "+"invalid email" +
                    " Email should contain <aut.com> after @.");
            return;
        }
        //barrasi password
        //aya hadaghal 8 char hast ?
        if(password.length() < 8){
            System.out.println("Error: "+"invalid password" +
                    " password shold contain atleast 8 characters.");
            return;
        }
        //یک حرف بزرگ، یک حرف کوچک، یک عدد و یک کاراکتر ویژه (@, !, &, $, ؟))
        //hal in shart haro bayd barrasi kard
        boolean flgU = false,flgL = false,flgD = false;
        boolean flgV = false;
        char[] charvije = {'@','!','&','$','?'};
        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                flgD = true;
            }
            if(Character.isLowerCase(c)){
                flgL = true;
            }
            if(Character.isUpperCase(c)){
                flgU = true;
            }
            for(char v : charvije){
                if(v==c)
                    flgV=true;
            }

        }
        if(!(flgL && flgV && flgD && flgU)){
            System.out.println("Error: "+"invalid password" +
                    " password shold contain UpperCase" +
                    "+Lowecase + Digit + especial characters " +
                    "(!,@,$,&,?)");
            return;
        }
        //ta alan hame khata ha check shid
        //agar hame meyar haro pass kard dige mitavan user ijad kard
        //tolid shomare karti 16 raghami va yekta
        String cardNumber =  makecardnumber();
        //ta inja ke ba moafaghiyat oomadim account misazim
        //balance avaliye ro 0 mizarim
        User user_new = new User(username,password,FullName,cardNumber,
                PhoneNumber,Email,"0.0");

        this.addUser(user_new);
        System.out.println("account registered successfully !");
        System.out.println("Assigned card number: "+cardNumber);


    }

    public void login(String username,String password){
        boolean match_username = false;
        for(User usr : all_usesrs){
            if(usr.getUsername().equals(username)){
                usr.login(password);
                match_username = true;
            }
        }
        if(!match_username)
            System.out.println("Error: "+"login failed !-wrong password!!");
    }

    public User username_User(String username){
        for (User usr : all_usesrs) {
            if(usr.getUsername().equals(username))
                return usr;
        }
        return currentuser;
    }

    public User Cardnumber_User(String cardnumber){
        for (User usr : all_usesrs) {
            if(usr.getCardNumber().equals(cardnumber))
                return usr;
        }
        return currentuser;
    }



}

