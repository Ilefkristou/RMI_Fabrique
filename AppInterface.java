import java.rmi.*;

// Interface distante pour l'application
public interface AppInterface extends Remote {
    // Déclarer les méthodes distantes que l'application serveur exposera
    public void method1() throws RemoteException;
    public String method2() throws RemoteException;
}
