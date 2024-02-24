import java.io.FileNotFoundException;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        Ville v1 = new Ville(300, 100);
        Ville v2 = new Ville(0, 100);

        System.out.println("Ville 1: " + v1.pourcentageJeunes() + "%");
        System.out.println("Ville 2: " + v2.pourcentageJeunes() + "%");

        try {
            v1.lireFichier();
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé");
        } catch (IOException e) {
            System.out.println("Erreur de lecture");
        }

        try {
            Ville v3 = new Ville(-500);
        }catch (NombreHabitantsException e){
            return;
        }
    }
}
