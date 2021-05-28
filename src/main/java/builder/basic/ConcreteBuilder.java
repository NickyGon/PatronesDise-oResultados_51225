package builder.basic;

public class ConcreteBuilder extends Builder{

    @Override
    public void buildAttibute1() {
        product.setAtributo1("value1");
    }

    @Override
    public void buildAttibute2() {
        product.setAtributo2("value2");
    }

    @Override
    public void buildAttibute3() {
        product.setAtributo3("value3");
    }

    @Override
    public void buildAttibute4() {
        product.setAtributo4("value4");
    }

    @Override
    public void buildAttibute5() {
        product.setAtributo5("value5");
    }
}
