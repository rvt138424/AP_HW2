public class Customer extends Person {
    //meghdardehi be sorat private
    private String customerId;
    private int loyaltyPoints;

    public Customer(String name,String phoneNumber,String customerId,int loyaltyPoints) {
        super(name,phoneNumber);
        this.customerId=customerId;
        this.loyaltyPoints=loyaltyPoints;
    }

    /*tabe haye monaseb getter o setter baraye
     emkan taghir mghdir ijad mikonim*/
     public String getCustomerId() {
         return customerId;
     }

     public int getLoyaltyPoints() {
         return loyaltyPoints;
     }

     public void setCustomerId(String customerId) {
         this.customerId = customerId;
     }

     public void setLoyaltyPoints(int loyaltyPoints) {
         this.loyaltyPoints = loyaltyPoints;
     }

     public void addLoyaltyPoints(int kharid){
         if(kharid > 500000)
             loyaltyPoints+=1;
         else if (kharid > 1000000)
             loyaltyPoints+=2;
     }

     //in tabe darsad takhfif ro barmigardone
    //agar loyaltipoint monaseb nadasht zarib 0 be mani 0% takhfif migirad
     public double getDiscount(){
         if(loyaltyPoints > 5){
             return 10/100;
         }
         else if (loyaltyPoints > 3) {
             return 5/100;
         }
         else
             return 0.0;
     }

     @Override
     public String getInfo(){
         String Info;
         Info = "ID: "+customerId+", Name: "+this.getName()
                 +", Phone: "+this.getPhoneNumber()
                 + ", Loyalty Points: "+loyaltyPoints;
         return Info;
     }
}
