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
    public Cruciverba leggiCruciverba()
    {
        return new Cruciverba();
    }
}