package ejercicios2do.TiendaCelulares;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[]args) {
        TiendaCelulares tiendaCelulares= new TiendaCelulares();
        List<Celular> listaDeCelulares= new ArrayList<>();

        listaDeCelulares.add(new Celular("Galaxy A3","Samsung","Media",1910));
        listaDeCelulares.add(new Celular("Galaxy A3","Samsung","Media",1890));
        listaDeCelulares.add(new Celular("Galaxy S21","Samsung","Alta",8500));
        listaDeCelulares.add(new Celular("Note 20 Ultra 5G","Samsung","Alta",6790));
        listaDeCelulares.add(new Celular("Galaxy S10+","Samsung","Media",5250));

        listaDeCelulares.add(new Celular("Mi 11","Xiaomi","Alta",5100));
        listaDeCelulares.add(new Celular("Mi 11","Xiaomi","Alta",5130));
        listaDeCelulares.add(new Celular("Redmi Note 10","Xiaomi","Media",2500));
        listaDeCelulares.add(new Celular("Mi 10 Lite","Xiaomi","Media",2950));
        listaDeCelulares.add(new Celular("Redmi 9C","Xiaomi","Baja",831));

        listaDeCelulares.add(new Celular("Mate 40 Pro","Huawei","Alta",3590));
        listaDeCelulares.add(new Celular("P30","Huawei","Alta",2100));
        listaDeCelulares.add(new Celular("Mate 20 Lite","Huawei","Media",1370));
        listaDeCelulares.add(new Celular("Y5P","Huawei","Baja",800));
        listaDeCelulares.add(new Celular("Mate 20 Lite","Huawei","Media",1380));

        listaDeCelulares.add(new Celular("Xperia 1 II","Sony","Alta",7650));
        listaDeCelulares.add(new Celular("Xperia 1 II","Sony","Alta",7690));
        listaDeCelulares.add(new Celular("Galaxy S21","Samsung","Alta",8520));
        listaDeCelulares.add(new Celular("Redmi Note 10","Xiaomi","Media",2520));
        listaDeCelulares.add(new Celular("Mi 11","Xiaomi","Alta",5110));

        tiendaCelulares.setCelularList(listaDeCelulares);

        tiendaCelulares.setAlgoritmo();
        tiendaCelulares.buscarCelulares("Mi 11",0);

    }



}
