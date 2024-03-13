import java.rmi.*;
import java.rmi.server.*;

// Implémentation de la fabrique de comptes bancaires
public class BankAccountFactoryImpl extends UnicastRemoteObject implements BankAccountFactory {
    // Constructeur
    public BankAccountFactoryImpl() throws RemoteException {}

    // Méthode pour créer un nouveau compte bancaire
    public BankAccount createAccount(String owner, double initialBalance) throws RemoteException {
        return new BankAccount(owner, initialBalance);
    }
}
