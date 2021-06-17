package visitor.ejercicio;

public class PluginGuardar implements iMetodos{

    @Override
    public void guardar(Notepad notepad){
        System.out.println("Guardando documento "+notepad.getNameDoc()+".pdf en Notepad");
        System.out.println(notepad.getCuerpoDoc());
        System.out.println("Numero de caracteres: "+notepad.getNumeroCaracteres());
    }

    @Override
    public void guardar(Word word) {
        System.out.println("Guardando documento "+word.getNameDoc()+".pdf en Word");
        System.out.println(word.getCuerpoDoc());
        System.out.println("Numero de caracteres: "+word.getNumeroCaracteres());
    }

    @Override
    public void guardar(Sublime sublime) {
        System.out.println("Guardando documento "+sublime.getNameDoc()+".pdf en Sublime");
        System.out.println(sublime.getCuerpoDoc());
        System.out.println("Numero de caracteres: "+sublime.getNumeroCaracteres());
    }
}
