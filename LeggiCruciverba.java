import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class LeggiCruciverba {
    private FileReader f;
    private BufferedReader fin;
    public LeggiCruciverba(String pathToFile) throws IOException
    {
        this.f = new FileReader(pathToFile);
        this.fin = new BufferedReader(f);
    }
    public Cruciverba leggiCruciverba() throws IOException
    {
        int rowCols[];
        String rowColsString = fin.readLine();
        rowCols = getRowCols(rowColsString);
        System.out.println(rowCols[0] + " " + rowCols[1]);
        char[][] contenuto = leggiCruciverbaDaFile(rowCols[0], rowCols[1]);;
        return new Cruciverba(rowCols[0], rowCols[1]);
    }
    private int[] getRowCols(String s)
    {
        boolean isSecondNumber = false;
        String firstNumber = "", secondNumber = "";
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                isSecondNumber = true;
            }
            else if (!isSecondNumber) {
                firstNumber += s.charAt(i);
            }
            else{
                secondNumber += s.charAt(i);
            }
        }
        if (Integer.parseInt(firstNumber) > 50 || Integer.parseInt(firstNumber) < 2 || Integer.parseInt(secondNumber) > 50 || Integer.parseInt(secondNumber) < 2) {
            throw new RuntimeException("dimensioni non corrette >:(");
        }
        return new int[]{Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)};
    }
    private char[][] leggiCruciverbaDaFile(int rows, int cols)
    {
        char[][] cruciverba = new char[rows][cols];
        boolean eof = false;
        int j = 0;
        while (!eof) {
            try {
                String rigaDelFile = fin.readLine();
                System.out.println("s value: " + rigaDelFile);
                for (int i = 0; i < rigaDelFile.length(); i++) {
                    try {
                        cruciverba[j][i] = rigaDelFile.charAt(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                j++;
            } catch (Exception e) {
                eof = true;
            }
        }
        return cruciverba;
    }
}