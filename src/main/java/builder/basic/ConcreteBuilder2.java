package builder.basic;

public class ConcreteBuilder2 extends Builder{

    @Override
    public void buildAttibute1() {
        product.setAtributo1("value5");
    }

    @Override
    public void buildAttibute2() {
        product.setAtributo2("value6");
    }

    @Override
    public void buildAttibute3() {
        product.setAtributo3("value7");
    }

    @Override
    public void buildAttibute4() {
        product.setAtributo4("value8");
    }

    @Override
    public void buildAttibute5() {
        product.setAtributo5("value9");
    }
}
