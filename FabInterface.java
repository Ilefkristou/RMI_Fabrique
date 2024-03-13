import java.rmi.*;

// Interface de fabrique d'objets
public interface FabInterface extends Remote {
    // Méthode pour créer un nouvel objet distant
    public AppInterface createObject() throws RemoteException;
}
