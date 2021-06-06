package memento.ejercicios;


public class Client {
    public static void main(String[]args){
        BaseDeDatos baseDeDatos=new BaseDeDatos();
        SQL sql=new SQL();

        Personas persona;
        persona=new Personas("Victoria Stilwell","11119103",19);
        sql.setBackup(persona);
        baseDeDatos.createBackup("BackupMarzo",sql.createBackupVersion());

        persona=new Personas("Jody Dombroski","11113482",24);
        sql.setBackup(persona);
        baseDeDatos.createBackup("BackupAbril",sql.createBackupVersion());

        persona=new Personas("Carlos Valverde","11112702",42);
        sql.setBackup(persona);
        baseDeDatos.createBackup("BackupMayo",sql.createBackupVersion());

        persona=new Personas("David Yates","11113014",38);
        sql.setBackup(persona);
        baseDeDatos.createBackup("BackupJunio",sql.createBackupVersion());

        persona=new Personas("Graheme Hall","11112321",31);
        sql.setBackup(persona);
        baseDeDatos.createBackup("BackupJulio",sql.createBackupVersion());


        sql.restoreBackup(baseDeDatos.getMemento("BackupAbril"));

    }
}
