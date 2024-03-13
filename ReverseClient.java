import java.rmi.*;
import java.rmi.registry.*;

// Classe cliente pour invoquer les méthodes distantes
public class ReverseClient {
    public static void main(String[] args) {
        // Vérification des arguments en ligne de commande
        if (args.length != 2) {
            System.out.println("Utilisation : java ReverseClient ch1 ch2");
            System.exit(0);
        }
        try {
            // Récupération du registre RMI
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            // Récupération de la fabrique d'inversion de chaînes
            FabReverseInterface fabrique = (FabReverseInterface) reg.lookup("Fabrique");
            ReverseInterface ReverseObj1;
            // Création d'une instance d'inversion de chaîne pour le premier argument
            ReverseObj1 = fabrique.newReverse();
            ReverseInterface ReverseObj2;
            // Création d'une instance d'inversion de chaîne pour le deuxième argument
            ReverseObj2 = fabrique.newReverse();
            // Appel de la méthode d'inversion pour le premier argument
            String result = ReverseObj1.reverseString(args[0]);
            System.out.println("L'inverse de " + args[0] + " est " + result + "\n");
            // Appel de la méthode d'inversion pour le deuxième argument
            String result1 = ReverseObj2.reverseString(args[1]);
            System.out.println("L'inverse de " + args[1] + " est " + result1 + "\n");
        } catch (Exception e) {
            System.out.println("Erreur d'accès à l'objet distant.");
            System.out.println(e.toString());
        }
    }
}
