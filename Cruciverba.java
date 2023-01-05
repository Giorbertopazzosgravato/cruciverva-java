public class Cruciverba {
    char[][] cruciverba;
    public Cruciverba(int rows, int cols)
    {
        cruciverba = new char[rows][cols];
    }
    //we gotta a problem :D
    
    private void stampaCruci() {
        for (int i = 0; i < cruciverba.length; i++) {
            System.out.println(cruciverba[i]);
        }
    }

}