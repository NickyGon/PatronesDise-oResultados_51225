package builder.basic.notUsingBuilder;

public class Product {
    private String atributo1;
    private String atributo2;
    private String atributo3;
    private String atributo4;
    private String atributo5;

    public Product(){}

    public Product(String atributo1){
        atributo1=this.atributo1;
        atributo2="value2";
        atributo3="value3";
        atributo4="value4";
        atributo5="value5";
    }

    public void ProductType1(){
        atributo1="value1";
        atributo2="value2";
        atributo3="value3";
        atributo4="value4";
        atributo5="value5";
    }


    public void ProductType2(){
        atributo1="Pvalue1";
        atributo2="Pvalue2";
        atributo3="Pvalue3";
        atributo4="Pvalue4";
        atributo5="Pvalue5";
    }

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    public String getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(String atributo3) {
        this.atributo3 = atributo3;
    }

    public String getAtributo4() {
        return atributo4;
    }

    public void setAtributo4(String atributo4) {
        this.atributo4 = atributo4;
    }

    public String getAtributo5() {
        return atributo5;
    }

    public void setAtributo5(String atributo5) {
        this.atributo5 = atributo5;
    }
}
