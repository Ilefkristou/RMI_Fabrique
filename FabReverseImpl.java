import java.rmi.*;
import java.rmi.server.*;

// Implémentation de la fabrique d'inversion de chaînes de caractères
public class FabReverseImpl extends UnicastRemoteObject implements FabReverseInterface {
    // Constructeur
    public FabReverseImpl() throws RemoteException {}

    // Méthode pour créer une nouvelle instance d'inversion de chaîne
    public ReverseInterface newReverse() throws RemoteException {
        return new Reverse();
    }
}
