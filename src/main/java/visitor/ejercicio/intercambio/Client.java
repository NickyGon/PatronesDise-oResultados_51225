package visitor.ejercicio.intercambio;

public class Client {
    public static void main(String[]args){
        Argentina argentina=new Argentina();
        Brasil brasil=new Brasil();
        Bolivia bolivia= new Bolivia();
        Italia italia= new Italia();

        LibreCambista libreCambista=new LibreCambista();

        //true-->Dolar a moneda false--->Moneda a dolar
        argentina.accept(15,libreCambista, iPaises.changeMode.DOLARMONEDA);
        argentina.accept(15,libreCambista, iPaises.changeMode.MONEDADOLAR);
        bolivia.accept(15,libreCambista, iPaises.changeMode.DOLARMONEDA);
        bolivia.accept(15,libreCambista, iPaises.changeMode.MONEDADOLAR);
        brasil.accept(15,libreCambista, iPaises.changeMode.DOLARMONEDA);
        brasil.accept(15,libreCambista, iPaises.changeMode.MONEDADOLAR);
        italia.accept(15,libreCambista, iPaises.changeMode.DOLARMONEDA);
        italia.accept(15,libreCambista, iPaises.changeMode.MONEDADOLAR);

    }
}
