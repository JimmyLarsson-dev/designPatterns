package builder;

public class Main {

    public static void main(String[] args) {
        Product product = new Product.ProductBuilder()
                .setName("iphone")
                .setDescription("äppel päppel")
                .setPrice(99)
                .build();
        System.out.println(product.getName());
    }
}
