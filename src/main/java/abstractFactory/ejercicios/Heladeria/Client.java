package abstractFactory.ejercicios.Heladeria;

public class Client {
    public static void main(String[]args){
        HeladoDeAgua ha1=(HeladoDeAgua) FactoryHelados.make(FactoryHelados.Helado.AGUA);
        ha1.setFruta(new Fruta("Dulce","Frutilla","1 Bs","Grande"));
        ha1.crear();

        HeladoDeAgua ha2=(HeladoDeAgua) FactoryHelados.make(FactoryHelados.Helado.AGUA);
        ha2.setFruta(new Fruta("Amargo","Limón","1 Bs","Mediano"));
        ha2.crear();

        HeladoDeAgua ha3=(HeladoDeAgua) FactoryHelados.make(FactoryHelados.Helado.AGUA);
        ha3.setFruta(new Fruta("Dulce","Manzana","3 Bs","Mediana"));
        ha3.crear();

        HeladoDeCrema hc1=(HeladoDeCrema) FactoryHelados.make(FactoryHelados.Helado.CREMA);
        hc1.setCrema(new Crema("Chocolate","12 Bs","PIL"));
        hc1.setFruta(new Fruta("Amargo","Limón","3 Bs","Grande"));
        hc1.crear();

        HeladoDeCrema hc2=(HeladoDeCrema) FactoryHelados.make(FactoryHelados.Helado.CREMA);
        hc2.setCrema(new Crema("Vainilla","10 Bs","Delizia"));
        hc2.setFruta(new Fruta("Dulce","Frutilla","5 Bs","Mediano"));
        hc2.crear();

        HeladoDeCrema hc3=(HeladoDeCrema) FactoryHelados.make(FactoryHelados.Helado.CREMA);
        hc3.setCrema(new Crema("Café","9 Bs","PIL"));
        hc3.setFruta(new Fruta("Dulce","Maracuyá","8 Bs","Mediana"));
        hc3.crear();

        HeladoMixto hm1=(HeladoMixto) FactoryHelados.make(FactoryHelados.Helado.MIXTO);
        hm1.setCrema(new Crema("Chocolate","10 Bs","Panda"));
        hm1.setFruta(new Fruta("Dulce","Uva","12 Bs","Mediana"));
        hm1.crear();

        HeladoMixto hm2=(HeladoMixto) FactoryHelados.make(FactoryHelados.Helado.MIXTO);
        hm2.setCrema(new Crema("Menta","15 Bs","SanCor"));
        hm2.setFruta(new Fruta("Dulce","Ciruela","14 Bs","Mediana"));
        hm2.crear();

        HeladoMixto hm3=(HeladoMixto) FactoryHelados.make(FactoryHelados.Helado.MIXTO);
        hm3.setCrema(new Crema("Leche","15 Bs","PIL"));
        hm3.setFruta(new Fruta("Acida","Naranja","9 Bs","Grande"));
        hm3.crear();

    }
}
