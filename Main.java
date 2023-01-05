import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LeggiCruciverba l = new LeggiCruciverba("cruciverba.txt");
        Cruciverba cruci = l.leggiCruciverba();
        cruci.stampaCruci();
        cruci.stampaParoleSuFile();
    }
}
