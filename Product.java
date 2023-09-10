package ZensarEsd;
public class Product {

    //	Data Members
    int product_code;
    String product_name;
    int product_price;
    int product_quantity;
    boolean inStock;
    static int total_products;

    static{
        System.out.println("Shop Name: My Shop");
    }

    //	Parameterized Constructor
    public Product(int product_code, String product_name, int product_price, int product_quantity, boolean inStock) {
        super();
        this.product_code = product_code;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_quantity = product_quantity;
        this.inStock = inStock;
        this.total_products++;
    }

    //	Getter and Setter Methods
    public int getProduct_code() {
        return product_code;
    }
    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public int getProduct_price() {
        return product_price;
    }
    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }
    public int getProduct_quantity() {
        return product_quantity;
    }
    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }
    public boolean isInStock() {
        return inStock;
    }
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public static void printAllProducts(Product[] productContainer) {
        System.out.println("Product Details\n");
        System.out.println("Code\tName\tPrice\tQty\tIn Stock");
        System.out.println("==================================================");

        for(Product p:productContainer) {
            System.out.println(p);
            System.out.println("--------------------------------------------------");
        }
    }

    //	Override toString() Method
    @Override
    public String toString() {
        return product_code + "\t" + product_name + "\t"
                + product_price + "\t" + product_quantity + "\t" + inStock;
    }

}