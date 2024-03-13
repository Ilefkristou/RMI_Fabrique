import java.rmi.*;
import java.rmi.server.*;

// Implémentation de la fabrique pour l'application RMI HelloApp
public class HelloFactoryImpl extends UnicastRemoteObject implements HelloFactory {
    // Constructeur
    public HelloFactoryImpl() throws RemoteException {}

    // Méthode pour créer une nouvelle instance de Hello
    public Hello createHello() throws RemoteException {
        return new Hello();
    }
}
