package ejercicios2do.TiendaCelulares;

import java.util.List;

public class AlgoritmoMayor implements iAlgoritmo{

    @Override
    public void buscar(List<Celular> listaCelular, String modelo, int precio) {
        //front and back search
        System.out.println("Busqueda mediante algoritmo de extremos");
        int primero=0;
        int ultimo=listaCelular.size()-1;
        while(primero<=ultimo){
            if (precio!=0 && !modelo.equals("")){
                if (precio(listaCelular.get(primero).getPrecio(),precio) && listaCelular.get(primero).getModelo().equals(modelo)){
                    listaCelular.get(primero).info();
                } else if (precio(listaCelular.get(ultimo).getPrecio(),precio) && listaCelular.get(ultimo).getModelo().equals(modelo)){
                    listaCelular.get(ultimo).info();
                }
            } else if (precio==0 && !modelo.equals("")){
                if ( listaCelular.get(primero).getModelo().equals(modelo)){
                    listaCelular.get(primero).info();
                } else if (listaCelular.get(ultimo).getModelo().equals(modelo)){
                    listaCelular.get(ultimo).info();
                }
            } else if (precio!=0 && modelo.equals("")){
                if (precio(listaCelular.get(primero).getPrecio(),precio) ){
                    listaCelular.get(primero).info();
                } else if (precio(listaCelular.get(ultimo).getPrecio(),precio)){
                    listaCelular.get(ultimo).info();
                }
            }
            primero++;
            ultimo--;
        }
    }

    public boolean precio(int precio,int precioBuscado){
        int iter=precio;
        int zNum=0;
        int firstDigit=0;
        while(iter/10!=0){
            iter=iter/10;
            zNum++;
            firstDigit=iter%10;
        }
        int limita=firstDigit*(1*(int)Math.pow(10,zNum));
        int limitb=limita+(1*(int)Math.pow(10,zNum));

        return precioBuscado<=limitb && precioBuscado>=limita;
    }

}
