import java.util.ArrayList;

public class Order {
    //baraye raayat capsule sazi hame field
    //haro private kardam
    private int orderId;
    private Customer customer;
    private ArrayList<MenuItem> items ;
    private int totalAmount = 0 ;
     public Order(int orderId, Customer customer
             , ArrayList<MenuItem> items) {
         this.orderId = orderId;
         this.customer = customer;
         this.items = items;
     }
     public int getOrderId() {
         return orderId;
     }
     //be nazaram in tabe niyazi nakhahad bod baraye etminan tarif mikonam
     public void setOrderId(int orderId) {
         this.orderId = orderId;
     }
     public Customer getCustomer() {
         return customer;
     }
     //be nazaram avaz kardan customer niyazi nist
    //vali khodaro che didi shayad niyaz shod
    //kar az mohkam kari eyb nmikone
    public void setCustomer(Customer customer) {
         this.customer = customer;
    }
    //tabeyi baraye didan order ha
    public ArrayList<MenuItem> getItems() {
         return items;
    }
    public void setItems(ArrayList<MenuItem> items) {
         this.items = items;
    }
    //be nazaram tabeyi barye gereftan gheymat kol niyaze

    public int getTotalAmount() {
         return totalAmount;
    }
    public void setTotalAmount(int totalAmount) {
         this.totalAmount = totalAmount;
    }
    public int calculateTotal() {
         //mohasebe kol fish
         for (MenuItem item : items) {
             totalAmount += item.getPrice();
         }
         //loyaltypoint ro hesab mikonim
         customer.addLoyaltyPoints(totalAmount);

         //hesab kardn takhfifi ke mikhore
         double discount = customer.getDiscount();
         //mablagh ghabel pardakht
         totalAmount = (int) (totalAmount - (double)totalAmount* discount);
         return totalAmount;
    }

    public String getOrderSummary(){
         String orderSummary = "";
         orderSummary = "OrderI ID: "+orderId
                 +", Customer: " + customer.getName()
                 +", Total Amount: "+totalAmount+'\n'
                 +"Items: ";
         for(int i = 0; i< items.size(); i++){
             orderSummary += items.get(i).getName();
             if(i < items.size()-1)
                 orderSummary += " - ";
         }
         return orderSummary;
    }

     //
}
