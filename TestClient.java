package ZensarEsd;

public class TestClient {

    public static void main(String[] args) {


//	    Created Array Of Products named productContainer
        Product[] productContainer = new Product[4];

//		Adding Values to ProductContainer Array
        productContainer[0] = new Product(100, "Pen", 10, 7, true);
        productContainer[1] = new Product(101, "Book", 30, 0, false);
        productContainer[2] = new Product(102, "Pencil", 5, 5, true);
        productContainer[3] = new Product(103, "Scale", 30, 0, false);


        System.out.println("Total Products: " + Product.total_products);
        Product.printAllProducts(productContainer);



    }

}

