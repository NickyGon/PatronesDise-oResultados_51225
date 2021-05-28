package abstractFactory.ejercicios.Heladeria;

public class FactoryHelados {
    public enum Helado{
        AGUA,CREMA,MIXTO;
    }
    public static iHelado make(Helado type){
        iHelado helado;
        switch (type){
            case AGUA:
                helado=new HeladoDeAgua();
                ((HeladoDeAgua)helado).setTamano("Grande");
                ((HeladoDeAgua)helado).setForma("Estandar");
                ((HeladoDeAgua)helado).setBase(new Base("Paleta","Grande","Madera","5 Bs"));
                ((HeladoDeAgua)helado).setFruta(new Fruta());
                break;
            case CREMA:
                helado=new HeladoDeCrema();
                ((HeladoDeCrema)helado).setTamano("Mediano");
                ((HeladoDeCrema)helado).setForma("Estandar");
                ((HeladoDeCrema)helado).setBase(new Base("Cono","Mediano","Galleta","10 Bs"));
                ((HeladoDeCrema)helado).setFruta(new Fruta());
                ((HeladoDeCrema)helado).setCrema(new Crema());
                break;
            case MIXTO:
                helado= new HeladoMixto();
                ((HeladoMixto)helado).setTamano("Pequeño");
                ((HeladoMixto)helado).setForma("Wafer");
                ((HeladoMixto)helado).setBase(new Base("Galletas","Pequeñas","Integrales","5 Bs"));
                ((HeladoMixto)helado).setFruta(new Fruta());
                ((HeladoMixto)helado).setCrema(new Crema());
                ((HeladoMixto)helado).setCosto("50 Bs");
                break;
            default:
                helado=null;
                break;
        }
        return helado;
    }
}
