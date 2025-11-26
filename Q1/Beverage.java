public class Beverage extends MenuItem{
    private String Size;
    private String temperature;

    public Beverage(String category, int price, String name
            , String itemId,String Size, String temperature){
        super(category, price, name, itemId);
        this.Size = Size;
        this.temperature = temperature;
    }
    //methid haye getter o setter
    //chon field haro private kardam
    public String getSize() {
        return Size;
    }
    public void setSize(String Size) {
        this.Size = Size;
    }
    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }


    @Override
    public String getDetails() {
        String details ;
        details = "ID: "+this.getItemId()+", Name: "+this.getName()
                +", Price: "+String.valueOf(this.getPrice())
                +", Category: "+this.getCategory()
                +", Size: "+Size
                +", Temperature: "+temperature;
        return details;
    }
}
