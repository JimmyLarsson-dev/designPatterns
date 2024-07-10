package builder;

public class Product {
    private final String name;
    private final String description;
    private final int price;

    public Product(ProductBuilder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public int getPrice() {
        return this.price;
    }

    public static class ProductBuilder {
        private String name;
        private String description;
        private int price;

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
