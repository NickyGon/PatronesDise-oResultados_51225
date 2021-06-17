package visitor.ejemplo;


public interface iVeterinario {
    void recetarMedicina(Perro perro);
    void recetarMedicina(Gato gato);
    void recetarMedicina(Caballo caballo);
}
