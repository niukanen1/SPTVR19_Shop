package managers;

import entity.manager.Product;
import entity.manager.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveToFile {


    public SaveToFile () {

    }


    public void saveUsers(List<User> listUsers) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("UserBase");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listUsers);
            oos.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("in/out error");
        }

    }
    public List loadUsers() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("UserBase");
            ois = new ObjectInputStream(fis);
            return (List) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("in/out error");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        return new ArrayList();
    }

    public void saveProducts(List<Product> listProducts) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("ProductBase");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listProducts);
            oos.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("in/out error");
        }


    }

    public List loadProducts () {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("ProductBase");
            ois = new ObjectInputStream(fis);
            return (List) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("in/out error");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        return new ArrayList();

    }


}
