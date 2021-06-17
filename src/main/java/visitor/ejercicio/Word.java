package visitor.ejercicio;

public class Word implements iEditorTexto{
    private String nameDoc;
    private int numeroCaracteres=0;
    private String cuerpoDoc;

    public Word(){}

    public Word(String nameDoc, String cuerpoDoc) {
        this.nameDoc = nameDoc;
        this.cuerpoDoc = cuerpoDoc;
        setNumeroCaracteres();
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }

    public int getNumeroCaracteres() {
        return numeroCaracteres;
    }

    public void setNumeroCaracteres() {
        numeroCaracteres=0;
        for (int i=0;i<cuerpoDoc.length();i++){
            if (cuerpoDoc.charAt(i)!=' '){
                numeroCaracteres++;
            }
        }
    }

    public String getCuerpoDoc() {
        return cuerpoDoc;
    }

    public void setCuerpoDoc(String cuerpoDoc) {
        this.cuerpoDoc = cuerpoDoc;
        setNumeroCaracteres();

    }

    @Override
    public void accept(iMetodos metodos) {
        metodos.guardar(this);
    }
}
