import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ville {
    private int nbrHabitants;
    private int nbrJeunes;

    public Ville(int nbrHabitants, int nbrJeunes) {
        this.nbrHabitants = nbrHabitants;
        this.nbrJeunes = nbrJeunes;
    }

    public int pourcentageJeunes(){
        try {
            return  nbrJeunes * 100 / nbrHabitants;
        }
        catch (ArithmeticException e) {
        System.out.println("Nombre Habitants doit être non nul : "+e.getMessage());
            return 0;
        }finally
        {
            System.out.println("Exécuté dans tous les cas ");
        }
    }

    public void lireFichier() throws FileNotFoundException,IOException{
        BufferedReader br = new BufferedReader(new FileReader("fichier.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close();
    }

    public Ville(int nombreHabitants) throws NombreHabitantsException
    {
        if (nombreHabitants<0)
            throw new NombreHabitantsException();
        else
            this.nbrHabitants=nombreHabitants;
    }

    public int getNbrHabitants() {
        return nbrHabitants;
    }

    public int getNbrJeunes() {
        return nbrJeunes;
    }

    public void setNbrHabitants(int nbrHabitants) {
        this.nbrHabitants = nbrHabitants;
    }

    public void setNbrJeunes(int nbrJeunes) {
        this.nbrJeunes = nbrJeunes;
    }
}
