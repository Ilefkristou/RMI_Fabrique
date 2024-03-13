import java.rmi.*;
import java.rmi.registry.*;

// Classe du serveur pour la création et l'enregistrement des objets
public class ReverseServer {
    public static void main(String[] args) {
        try {
            // Création du registre RMI sur le port 1099
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("Serveur : Construction de l'implémentation");

            // Création de l'implémentation de la fabrique d'inversion de chaînes
            FabReverseImpl fab = new FabReverseImpl();
            System.out.println("Objet Fabrique lié dans le RMI registry");

            // Enregistrement de la fabrique dans le registre RMI
            registry.rebind("Fabrique", fab);
            System.out.println("Serveur prêt.");
            System.out.println("Attente des invocations des clients ...");
        } catch (Exception e) {
            System.out.println("Erreur de liaison de l'objet Fabrique");
            System.out.println(e.toString());
        }
    }
}
