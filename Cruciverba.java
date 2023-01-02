import java.io.BufferedReader;
import java.io.FileReader;

public class Cruciverba {
    char[][] cruciverba;
    FileReader f;
    public Cruciverba(int rows, int cols, FileReader f)
    {
        cruciverba = new char[rows][cols];
        this.f = f;
        leggiCruciverbaDaFile();
        stampaCruci();
    }
    //we gotta a problem :D
    private void leggiCruciverbaDaFile()
    {
        BufferedReader fin = new BufferedReader(f);
        boolean eof = false;
        int j = 0;
        while (!eof) {
            try {
                String s = fin.readLine();
                for (int i = 0; i < s.length(); i++) {
                    try {
                        cruciverba[i][j] = s.charAt(i);
                    } catch (Exception e) {
                        System.out.println("porcoddio manco sei buono a fare un cruciverba dio merda");
                    }
                }
            } catch (Exception e) {
                eof = true;
            }
        }
    }
    private void stampaCruci() {
        for (int i = 0; i < cruciverba.length; i++) {
            System.out.println(cruciverba[i]);
        }
    }

}