import java.rmi.*;
import java.rmi.server.*;

// Implémentation de l'interface distante
public class AppImpl extends UnicastRemoteObject implements AppInterface {
    // Constructeur
    public AppImpl() throws RemoteException {}

    // Implémenter les méthodes définies dans l'interface
    public void method1() throws RemoteException {
        // Code pour la méthode 1
    }

    public String method2() throws RemoteException {
        // Code pour la méthode 2
        return "Résultat de la méthode 2";
    }
}
