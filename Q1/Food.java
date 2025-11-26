public class Food extends MenuItem{

    private String spiceLevel;
    private int preparationTime;

    public Food(String category, int price, String name
            , String itemId, String spiceLevel, int preparationTime){
        super(category, price, name, itemId);
        this.spiceLevel = spiceLevel;
        this.preparationTime = preparationTime;
    }

    //tabe haye getter o setter monaseb
    public String getSpiceLevel(){
        return spiceLevel;
    }
    public void setSpiceLevel(String spiceLevel){
        this.spiceLevel = spiceLevel;
    }
    public int getPreparationTime(){
        return preparationTime;
    }
    public void setPreparationTime(int  preparationTime){
        this.preparationTime = preparationTime;
    }


    @Override
    public String getDetails() {
        String details ;
        details = "ID: "+this.getItemId()+", Name: "+this.getName()
                +", Price: "+String.valueOf(this.getPrice())
                +", Category: "+this.getCategory()
                +", Spice: "+spiceLevel
                +", Preparation Time: "
                +String.valueOf(preparationTime)+"min";
        return details;
    }
}
