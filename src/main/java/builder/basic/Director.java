package builder.basic;

public class Director {
    private Builder builder;

    public Product getProduct(){
        return builder.getProduct();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createProduct();
        this.builder.buildAttibute1();
        this.builder.buildAttibute2();
        this.builder.buildAttibute3();
        this.builder.buildAttibute4();
        this.builder.buildAttibute5();
    }
}
