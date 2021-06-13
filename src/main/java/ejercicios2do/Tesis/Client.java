package ejercicios2do.Tesis;

public class Client {
    public static void main(String[]args){
        PcTutor pcTutor=new PcTutor();
        CarpetaTesis carpetaTesis= new CarpetaTesis();

        Tesis tesis;
        tesis=new Tesis("Análisis del comportamiento social en mascotas durante tiempos de pandemia",
                "Durante años, el ser humano ha tenido un can como mascota al menos una vez para hacerle compañía, pero durante el coronavirus esta relación ha llevado a cambios drásticos en la actitud del perro.",
                "","","","",
                "Usted va por buen camino en su proyecto. Sin embargo, debería mejorar la redacción de sus antecedentes");
        carpetaTesis.guardarVersion(tesis);
        pcTutor.saveVersion("1",carpetaTesis.crearVersion());
        tesis=new Tesis("Análisis del comportamiento social en mascotas durante tiempos de pandemia",
                "Durante años, el ser humano ha tenido un can como mascota al menos una vez en su vida con el propósito de darle compañía. Sin embargo, durante la pandemia esta relación sufrió cambios notables en la actitud del animal, siendo la mayoría de estos negativos (ansiedad por separación, agresividad con otros canes, etc)",
                "En este proyecto, se diseñará un modelo de rehabilitación canina para mascotas con ansiedad por separación. con el propósito de ayudar a los dueños a mejorar su vida y relación con sus perros",
                "","","",
                "Muy bien realizado, la redacción ha mejorado bastante");
        carpetaTesis.guardarVersion(tesis);
        pcTutor.saveVersion("2",carpetaTesis.crearVersion());

        tesis=new Tesis("Análisis del comportamiento social en mascotas durante tiempos de pandemia",
                "Durante años, el ser humano ha tenido un can como mascota al menos una vez en su vida con el propósito de darle compañía. Sin embargo, durante la pandemia esta relación sufrió cambios notables en la actitud del animal, siendo la mayoría de estos negativos (ansiedad por separación, agresividad con otros canes, etc)",
                "En este proyecto, se diseñará un modelo de rehabilitación canina para mascotas con ansiedad por separación. con el propósito de ayudar a los dueños a mejorar su vida y relación con sus perros",
                "Se realizó una reunión con los 30 sujetos de muestra, realizando actividades de desensibilización a la separación de su dueño a largo plazo (exposición a otros canes, ambientación relajante, preparación de comida)",
                "","",
                "Los métodos son interesantes, pero no encuentro la relación de su problemática con la realización de comida.");
        carpetaTesis.guardarVersion(tesis);
        pcTutor.saveVersion("3",carpetaTesis.crearVersion());

        tesis=new Tesis("Análisis del comportamiento social en mascotas durante tiempos de pandemia",
                "Durante años, el ser humano ha tenido un can como mascota al menos una vez en su vida con el propósito de darle compañía. Sin embargo, durante la pandemia esta relación sufrió cambios notables en la actitud del animal, siendo la mayoría de estos negativos (ansiedad por separación, agresividad con otros canes, etc)",
                "En este proyecto, se diseñará un modelo de rehabilitación canina para mascotas con ansiedad por separación. con el propósito de ayudar a los dueños a mejorar su vida y relación con sus perros",
                "Se realizó una reunión con los 30 sujetos de muestra, realizando actividades de desensibilización a la separación de su dueño a largo plazo (exposición a otros canes, ambientación relajante, repetici+on de ordenes)",
                "Durante la realización del experimento, se observó que muchos de los sujetos han respondido de buena manera",
                "",
                "Los resultados son explicados de una manera abstracta y nada académica");
        carpetaTesis.guardarVersion(tesis);
        pcTutor.saveVersion("4",carpetaTesis.crearVersion());

        tesis=new Tesis("Análisis del comportamiento social en mascotas durante tiempos de pandemia",
                "Durante años, el ser humano ha tenido un can como mascota al menos una vez en su vida con el propósito de darle compañía. Sin embargo, durante la pandemia esta relación sufrió cambios notables en la actitud del animal, siendo la mayoría de estos negativos (ansiedad por separación, agresividad con otros canes, etc)",
                "En este proyecto, se diseñará un modelo de rehabilitación canina para mascotas con ansiedad por separación. con el propósito de ayudar a los dueños a mejorar su vida y relación con sus perros",
                "Se realizó una reunión con los 30 sujetos de muestra, realizando actividades de desensibilización a la separación de su dueño a largo plazo (exposición a otros canes, ambientación relajante, repetici+on de ordenes)",
                "Durante la realización del experimento, se observó que el 70% de la muestra ha respondido con éxito, con el 20% necesitando de estimulación contante y el 10% con problemas durante el entrenamiento",
                "Con este trabajo se ha demostrado que una estimulación externa y relacional de parte del dueño a su mascota ayuda a controlar la ansidedad por separación. Sin embargo, hay que resaltar que este método no es funcional en todos los canes, por lo que esto no debería tomarse como una referencia absoluta",
                "Felicidades, su trabajo es excelente!!");
        carpetaTesis.guardarVersion(tesis);
        pcTutor.saveVersion("5",carpetaTesis.crearVersion());
        carpetaTesis.restaurarVersion(pcTutor.getVersion("3"));
    }
}
