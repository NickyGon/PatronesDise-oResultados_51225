<<<<<<< HEAD
package mediator.ejercicios;



public class Client {
    public static void main(String[]args) {
        Skype skype=new Skype();

        DEV dev1 = new DEV(skype);
        DEV dev2 = new DEV(skype);
        DEV dev3 = new DEV(skype);
        QA qa1 = new QA(skype);
        QA qa2 = new QA(skype);
        QA qa3= new QA(skype);
        SM sm1 = new SM(skype);
        SM sm2=new SM(skype);
        SM sm3=new SM(skype);

        dev1.setNombre("Juan Perez");
        dev1.setLenguaje("Java");
        dev1.setCI(11110692);

        dev2.setLenguaje("Python");
        dev2.setNombre("Conrad Martins");
        dev2.setCI(11119034);

        dev3.setLenguaje("C++");
        dev3.setNombre("Raul Gonzalez");
        dev3.setCI(11118032);


        qa1.setGrado(1);
        qa1.setNombre("Maria Polino");
        qa1.setCI(11113344);

        qa2.setGrado(2);
        qa2.setNombre("Shaun Loine");
        qa2.setCI(11115353);

        qa3.setGrado(3);
        qa3.setNombre("Maine Stilwell");
        qa3.setCI(11115306);


        String[] array={"CSM","A-CSM"};
        sm1.setCertificaciones(array);
        sm1.setNombre("Victoria Dombroski");
        sm1.setCI(11110911);

        String[] array1={"CSP-SM","CSM","PSM"};
        sm2.setCertificaciones(array1);
        sm2.setNombre("Shellby Jordan");
        sm2.setCI(11118411);

        String[] array2={"PSM III"};
        sm3.setCertificaciones(array2);
        sm3.setNombre("Manuela Montero");
        sm3.setCI(11112710);

        skype.addPersonasAlChat(dev1);
        skype.addPersonasAlChat(dev2);
        skype.addPersonasAlChat(dev3);
        skype.addPersonasAlChat(qa1);
        skype.addPersonasAlChat(qa2);
        skype.addPersonasAlChat(qa3);
        skype.addPersonasAlChat(sm1);
        skype.addPersonasAlChat(sm2);
        skype.addPersonasAlChat(sm3);

        System.out.println("*****DEV****");
        dev1.send("Necesito ayuda con mi sección de la app");
        dev2.send("Como están todos");
        dev3.send("Buenas noches, compañeros");
        System.out.println("*****QA****");
        qa1.send("Hoy es Miercoles 2 de junio del 2021");
        qa2.send("Esperando aplicaciones para la revision QA");
        qa3.send("QA de la app de Tinder en proceso");
        System.out.println("*****SM****");
        sm1.send("Como están todos, hoy se termina el sprint");
        sm2.send("Nuevo sprint en dos dias");
        sm3.send("El producto está terminado al 70%");
    }
}
=======
package mediator.ejercicios;



public class Client {
    public static void main(String[]args) {
        Skype skype=new Skype();

        DEV dev1 = new DEV(skype);
        DEV dev2 = new DEV(skype);
        DEV dev3 = new DEV(skype);
        QA qa1 = new QA(skype);
        QA qa2 = new QA(skype);
        QA qa3= new QA(skype);
        SM sm1 = new SM(skype);
        SM sm2=new SM(skype);
        SM sm3=new SM(skype);

        dev1.setNombre("Juan Perez");
        dev1.setLenguaje("Java");
        dev1.setCI(11110692);

        dev2.setLenguaje("Python");
        dev2.setNombre("Conrad Martins");
        dev2.setCI(11119034);

        dev3.setLenguaje("C++");
        dev3.setNombre("Raul Gonzalez");
        dev3.setCI(11118032);


        qa1.setGrado(1);
        qa1.setNombre("Maria Polino");
        qa1.setCI(11113344);

        qa2.setGrado(2);
        qa2.setNombre("Shaun Loine");
        qa2.setCI(11115353);

        qa3.setGrado(3);
        qa3.setNombre("Maine Stilwell");
        qa3.setCI(11115306);


        String[] array={"CSM","A-CSM"};
        sm1.setCertificaciones(array);
        sm1.setNombre("Victoria Dombroski");
        sm1.setCI(11110911);

        String[] array1={"CSP-SM","CSM","PSM"};
        sm2.setCertificaciones(array1);
        sm2.setNombre("Shellby Jordan");
        sm2.setCI(11118411);

        String[] array2={"PSM III"};
        sm3.setCertificaciones(array2);
        sm3.setNombre("Manuela Montero");
        sm3.setCI(11112710);

        skype.addPersonasAlChat(dev1);
        skype.addPersonasAlChat(dev2);
        skype.addPersonasAlChat(dev3);
        skype.addPersonasAlChat(qa1);
        skype.addPersonasAlChat(qa2);
        skype.addPersonasAlChat(qa3);
        skype.addPersonasAlChat(sm1);
        skype.addPersonasAlChat(sm2);
        skype.addPersonasAlChat(sm3);

        System.out.println("*****DEV****");
        dev1.send("Necesito ayuda con mi sección de la app");
        dev2.send("Como están todos");
        dev3.send("Buenas noches, compañeros");
        System.out.println("*****QA****");
        qa1.send("Hoy es Miercoles 2 de junio del 2021");
        qa2.send("Esperando aplicaciones para la revision QA");
        qa3.send("QA de la app de Tinder en proceso");
        System.out.println("*****SM****");
        sm1.send("Como están todos, hoy se termina el sprint");
        sm2.send("Nuevo sprint en dos dias");
        sm3.send("El producto está terminado al 70%");
    }
}
>>>>>>> c840d62aee26865b3e8222b553c49398b223eec1
