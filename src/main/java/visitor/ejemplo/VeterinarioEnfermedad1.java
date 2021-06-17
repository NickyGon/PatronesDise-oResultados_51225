package visitor.ejemplo;

import java.util.Date;

public class VeterinarioEnfermedad1 implements iVeterinario{


    @Override
    public void recetarMedicina(Perro perro) {
        System.out.println("Perro> Medicina para la enfermedad #1");
        System.out.println(new Date().toString());

    }

    @Override
    public void recetarMedicina(Gato gato) {
        System.out.println("Gato> Medicina para la enfermedad #1");
        System.out.println(new Date().toString());
    }

    @Override
    public void recetarMedicina(Caballo caballo) {
        System.out.println("Caballo> Medicina para la enfermedad #1");
        System.out.println(new Date().toString());
    }
}
