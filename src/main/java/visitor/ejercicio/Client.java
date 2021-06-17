package visitor.ejercicio;

public class Client {
    public static void main(String[]args){
        Word word=new Word("HOLA","Hola mundo");
        Notepad notepad= new Notepad("NO","Hola Bolivia");
        Sublime sublime= new Sublime("NOLAN","Hola Peru");

        PluginGuardar pluginGuardar= new PluginGuardar();
        word.accept(pluginGuardar);
        notepad.accept(pluginGuardar);
        sublime.accept(pluginGuardar);

    }

}
