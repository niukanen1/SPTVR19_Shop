package managers;

import entity.manager.Product;
import entity.manager.User;

import java.util.List;
import java.util.Scanner;

public class UserManager {
    Scanner input = new Scanner(System.in);
    private SaveToFile save = new SaveToFile();
    private List<User> listUsers = save.loadUsers();;

    public void createUser () {

        User user = new User();

        System.out.println("---- User adding ----");
        System.out.print("User name: ");
        user.setName(input.nextLine());

        System.out.print("\nUser phone: ");
        user.setPhoneNumber(input.nextLine());

        System.out.print("User balance: ");
        user.setBalance(input.nextFloat());


        listUsers.add(user);
        save.saveUsers(listUsers);


    }
    public void displayUsers () {
        for (int i = 0; i < listUsers.size(); i++) {
            System.out.println(i + " --- " + listUsers.get(i));
        }
    }

    public int ChooseUser () {
        System.out.println("---- Choose user ----\n Enter number from 0 : ");
        displayUsers();
        return input.nextInt();
    }

    public double getUserBalance (int i) {
        return listUsers.get(i).getBalance();
    }

    public void decreaseBalance (int i, double price) {
        System.out.println("Decreasing balance...");
        double v = listUsers.get(i).getBalance() - price;
        listUsers.get(i).setBalance(v);
        System.out.println("User's current balance is " + listUsers.get(i).getBalance());
        save.saveUsers(listUsers);
    }

}
