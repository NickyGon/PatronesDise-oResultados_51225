package abstractFactory.basic;

public class FactoryProduct {
    public static iProduct make(String typeProduct){
        iProduct i1;

        switch (typeProduct){
            case "product1":
                i1=new ConcreteProduct();
                break;
            case "product2":
                i1=new ConcreteProduct2();
                break;
            case "product3":
                i1=new ConcreteProduct3();
                break;
            default:
                i1= new ConcreteProduct();
                break;
        }

        return i1;

    }
}
