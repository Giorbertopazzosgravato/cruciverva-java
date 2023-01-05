import java.io.FileWriter;
import java.io.PrintWriter;

public class Cruciverba {
    char[][] cruciverba;
    public Cruciverba(char[][] cruciverba)
    {
        this.cruciverba = cruciverba;
    }

    public void stampaCruci() {
        for (int i = 0; i < cruciverba.length; i++) {
            System.out.println(cruciverba[i]);
        }
    }
    public void stampaParoleSuFile() {
        try (FileWriter f = new FileWriter("parole.txt");
             PrintWriter fout = new PrintWriter(f))
             {
                for (int i = 0; i < cruciverba.length; i++) {
                    StringBuilder strb = new StringBuilder("");
                    strb.append(cruciverba[i]);
                    String[] s = strb.toString().split(" ");
                    for (int j = 0; j < s.length; j++) {
                        if (s[j].length() >= 2) {
                            fout.println(s[j]);
                        }
                    }
                }
                //righe     5
                //colonne   10
                for (int j = 0; j < cruciverba[0].length; j++) {
                    StringBuilder strb = new StringBuilder("");
                    for (int i = 0; i < cruciverba.length; i++) {
                        strb.append(cruciverba[i][j]);
                    }
                    String[] s = strb.toString().split(" ");
                    for (String string : s) {
                        if (string.length() >= 2) {
                            fout.println(string);
                        }
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}