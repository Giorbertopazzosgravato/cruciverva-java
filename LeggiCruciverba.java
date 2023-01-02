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
        return new Cruciverba(rowCols[0], rowCols[1]);
    }
    private int[] getRowCols(String s)
    {
        boolean isSecondNumber = false;
        String firstNumber = "", secondNumber = "";
        for (int i = 0; i < s.length() - 1; i++)
        {
            
            if(s.charAt(i) == ' ')
            {
                isSecondNumber = true;
            }
            else if (!isSecondNumber) 
            {
                firstNumber += s.charAt(i);
            }
            else
            {
                secondNumber += s.charAt(i);
            }
        }
        return new int[]{Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)};
    }
}