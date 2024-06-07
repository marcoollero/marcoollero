package comlogin.model;

public class Menu {
    private String name;
    private String productname;
    private Integer price;
    private Integer base_price;

    public Menu (String name, String productname, Integer price, Integer base_price){
        this.name= name;
        this.productname = productname;
        this.price = price;
        this.base_price = base_price;
    }

    public String getName(){return name;}
    public String getProductname(){return productname;}
    public Integer getPrice(){return price;}
    public Integer getBase_price(){return base_price;}


}
