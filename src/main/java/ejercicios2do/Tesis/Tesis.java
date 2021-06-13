package ejercicios2do.Tesis;

public class Tesis {
    private String Titulo;
    private String Antecedentes;
    private String Solucion;
    private String Metodologia;
    private String Resultados;
    private String Conclusiones;
    private String notasDeRevision;

    public Tesis(String titulo,String antecedentes, String solucion, String metodologia, String resultados, String conclusiones, String notasDeRevision) {
        this.Titulo=titulo;
        this.Antecedentes = antecedentes;
        this.Solucion = solucion;
        this.Metodologia = metodologia;
        this.Resultados = resultados;
        this.Conclusiones = conclusiones;
        this.notasDeRevision=notasDeRevision;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAntecedentes() {
        return Antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        Antecedentes = antecedentes;
    }

    public String getSolucion() {
        return Solucion;
    }

    public void setSolucion(String solucion) {
        Solucion = solucion;
    }

    public String getMetodologia() {
        return Metodologia;
    }

    public void setMetodologia(String metodologia) {
        Metodologia = metodologia;
    }

    public String getResultados() {
        return Resultados;
    }

    public void setResultados(String resultados) {
        Resultados = resultados;
    }

    public String getConclusiones() {
        return Conclusiones;
    }

    public void setConclusiones(String conclusiones) {
        Conclusiones = conclusiones;
    }

    public String getNotasDeRevision() {
        return notasDeRevision;
    }

    public void setNotasDeRevision(String notasDeRevision) {
        this.notasDeRevision = notasDeRevision;
    }

    public void info(){
        System.out.println("-----"+Titulo+"-----");
        System.out.println("Antecedentes: "+Antecedentes);
        System.out.println("Solución: "+Solucion);
        System.out.println("Metodología: "+Metodologia);
        System.out.println("Resultados: "+Resultados);
        System.out.println("Conclusiones: "+Conclusiones);
        System.out.println("Notas de revisión del tutor: "+notasDeRevision);
    }
}
