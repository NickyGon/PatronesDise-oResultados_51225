package ejercicios2do.GitHub;

public class Persona {
    private String name;
    private String programmingLang;
    private String nickname;

    public Persona(String name, String programmingLang, String nickname) {
        this.name = name;
        this.programmingLang = programmingLang;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgrammingLang() {
        return programmingLang;
    }

    public void setProgrammingLang(String programmingLang) {
        this.programmingLang = programmingLang;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void info(){
        System.out.println("- "+name+" ("+nickname+"). Programador en "+programmingLang);
    }
}
