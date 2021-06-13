package ejercicios2do.TiendaCelulares;

import java.util.List;

public class AlgoritmoMenor implements iAlgoritmo{

    @Override
    public void buscar(List<Celular> listaCelular, String modelo, int precio) {
        System.out.println("Busqueda mediante algoritmo linear");
        //linear search
        for (int i=0;i<listaCelular.size();i++){
            if (!modelo.equals("") && precio!=0){
                if (listaCelular.get(i).getModelo().equals(modelo)&&precio(listaCelular.get(i).getPrecio(),precio)) {
                    listaCelular.get(i).info();
                }
            } else if (modelo.equals("") && precio!=0){
                if (precio(listaCelular.get(i).getPrecio(),precio)) {
                    listaCelular.get(i).info();
                }
            }else if (!modelo.equals("") && precio==0){
                if (listaCelular.get(i).getModelo().equals(modelo))
                listaCelular.get(i).info();
            }
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
