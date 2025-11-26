import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Employee E1 = new Employee("akbar allahverdi","09330505673",
                "E001","Chef",
                89000000.99,198);
        Employee E2 = new Employee("Asghar khorami","09126773893",
                "E002","Accountant",
                21000000.99,178);
        Employee E3 = new Employee("Nazanin ahmadi","09104563782",
                "E003","Waitress",
                18000000.99,160);
        //listy as karmand ha
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(E1);
        employees.add(E2);
        employees.add(E3);

        Customer C1 = new Customer("Avesta","09330807604",
                "C001",5);
        Customer C2 = new Customer("Armita","09123564788",
                "C002",12);
        Customer C3 = new Customer("Sara","09107364893",
                "C003",4);
        Customer C4 = new Customer("Zhina","09123374678",
                "C004",2);
        Customer C5 = new Customer("Jafar","09193889294",
                "C005",0);
        //listy as moshtari ha
        ArrayList<Customer> customurs =  new ArrayList<>();
        customurs.add(C1);
        customurs.add(C2);
        customurs.add(C3);
        customurs.add(C4);
        customurs.add(C5);
        Food F1 = new Food("Fast Food",350000,"Pizza Pepperoni",
                "F001","Spicy",30);
        Food F2 = new Food("Fast food",385000,"Pizza alferedo",
                "F002","Medium",35);
        Food F3 = new Food("Main Dish",885000,
                "Steak and fries","F003","Mild",30);
        Beverage B1 = new Beverage("Cold Drink",115000,
                "Mohito","B001","Large","Cold");
        Beverage B2 = new Beverage("Cold Drink",60000,
                "Coca-Cola","B002","Medium","Cold");
        Beverage B3 = new Beverage("Hot Drink",100000,
                "Espresso","B003","Small","Hot");

        ArrayList<MenuItem> itemha = new ArrayList<>();
        itemha.add(F1);
        itemha.add(F2);
        itemha.add(F3);
        itemha.add(B1);
        itemha.add(B2);
        itemha.add(B3);

        //sabt sefaresh baraye har moshtari
        ArrayList<MenuItem> O1 = new ArrayList<>();
        O1.add(B1);
        O1.add(F1);
        O1.add(B2);
        Order ord1 = new Order(1,C1,O1);
        int tot1 = ord1.calculateTotal();
        System.out.println(ord1.getCustomer().getName()+
                " total order price is: "+tot1+" toman");

        ArrayList<MenuItem> O2 = new ArrayList<>();
        O2.add(B1);
        O2.add(F2);
        O2.add(F3);
        Order ord2 = new Order(2,C2,O2);
        int tot2 = ord2.calculateTotal();
        System.out.println(ord2.getCustomer().getName()+
                " total order price is: "+tot2+" toman");

        ArrayList<MenuItem> O3 = new ArrayList<>();
        O3.add(F1);
        O3.add(F3);
        O3.add(B2);
        Order ord3 = new Order(3,C3,O3);
        int tot3 = ord3.calculateTotal();
        System.out.println(ord3.getCustomer().getName()+
                " total order price is: "+tot3+" toman");

        ArrayList<MenuItem> O4 = new ArrayList<>();
        O4.add(F2);
        O4.add(F1);
        O4.add(B2);
        Order ord4 = new Order(4,C4,O4);
        int tot4 = ord4.calculateTotal();
        System.out.println(ord4.getCustomer().getName()+
                " total order price is: "+tot4+" toman");

        ArrayList<MenuItem> O5 = new ArrayList<>();
        O5.add(F1);
        O5.add(F2);
        O5.add(B3);
        Order ord5 = new Order(5,C5,O5);
        int tot5 = ord5.calculateTotal();
        System.out.println(ord5.getCustomer().getName()+
                " total order price is: "+tot5+" toman");


        //mohasebe hoghogh har karmand
        int hgh1 = (int)E1.calculateSalary();
        System.out.println("hoghogh "+E1.getName()+" as "+
                E1.getPosition()+" is "+hgh1+" toman");
        int hgh2 = (int)E2.calculateSalary();
        System.out.println("hoghogh "+E2.getName()+" as "+
                E2.getPosition()+" is "+hgh2+" toman");
        int hgh3 = (int)E3.calculateSalary();
        System.out.println("hoghogh "+E3.getName()+" as "+
                E3.getPosition()+" is "+hgh3+" toman");
        //peyda kardan vafadar tarin moshtari
        int maxP = -1;
        Customer bestloyalty = new Customer(" "," "," ",-1);
        for(Customer customer : customurs){
            int loyalty = customer.getLoyaltyPoints();
            if(loyalty>maxP)
                bestloyalty = customer;
        }
        System.out.println("vafadar tarin moshtari ma :"+
                bestloyalty.getInfo());

        //kholase etelaatkarmandan
        System.out.println("etelaat karmandan : ");
        for(Employee empl : employees)
            System.out.println(empl.getInfo());

        //kholase etelat moshtari ha
        System.out.println("etelaat Moshtari ha : ");
        for(Customer cstmr : customurs)
            System.out.println(cstmr.getInfo());

        //kholase etelat menu
        System.out.println("etelaat Menu : ");
        for(MenuItem itm : itemha)
            System.out.println(itm.getDetails());
    }
}