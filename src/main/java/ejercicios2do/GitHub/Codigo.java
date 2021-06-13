package ejercicios2do.GitHub;

public class Codigo {
    private String lineasDeCodigo;
    private String commitMessage;

    public Codigo(String lineasDeCodigo, String commitMessage) {
        this.lineasDeCodigo = lineasDeCodigo;
        this.commitMessage = commitMessage;
    }

    public String getLineasDeCodigo() {
        return lineasDeCodigo;
    }

    public void setLineasDeCodigo(String lineasDeCodigo) {
        this.lineasDeCodigo = lineasDeCodigo;
    }

    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public void info(){
        System.out.println("Commit message: "+commitMessage);
        System.out.println(lineasDeCodigo);
    }
}
