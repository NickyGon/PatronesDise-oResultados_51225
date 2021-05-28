package builder.basic;

public abstract class Builder {
    protected Product product;
    public Product getProduct(){
        return product;
    }
    public void createProduct(){
        product=new Product();
    }

    public abstract void buildAttibute1();
    public abstract void buildAttibute2();
    public abstract void buildAttibute3();
    public abstract void buildAttibute4();
    public abstract void buildAttibute5();
}
