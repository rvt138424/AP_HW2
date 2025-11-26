public abstract class MenuItem {
    private String category;
    private int price;
    private String name;
    private String itemId;

    public MenuItem(String category, int price, String name, String itemId) {
        this.category = category;
        this.price = price;
        this.name = name;
        this.itemId = itemId;
    }

    //field ha private hastan
    //getter o setter monaseb misazim
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getItemId(){
        return itemId;
    }
    public void setItemId(String itemId){
        this.itemId = itemId;
    }


    public abstract String getDetails();
}