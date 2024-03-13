import java.rmi.*;
import java.rmi.server.*;

// Implémentation de la fabrique d'objets
public class FabImpl extends UnicastRemoteObject implements FabInterface {
    // Constructeur
    public FabImpl() throws RemoteException {}

    // Implémenter la méthode de création d'objet
    public AppInterface createObject() throws RemoteException {
        return new AppImpl();
    }
}
