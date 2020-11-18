package managers;

import entity.manager.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private SaveToFile save = new SaveToFile();
    private List<Product> listProducts = save.loadProducts();;
    Scanner input = new Scanner(System.in);



    public void createProduct() {
        Product product = new Product();




        System.out.println("---Add product---");
        System.out.print("Add name: ");
        String name = input.nextLine();
        product.setName(name);

        System.out.print("Add weight: ");
        product.setWeight(input.nextLine());

        System.out.print("Add life: ");
        product.setLife(input.nextLine());

        System.out.print("Add price: ");
        product.setPrice(input.nextDouble());

        listProducts.add(product);
        save.saveProducts(listProducts);

    }

    public void displayProduct () {
        for (int i = 0; i < listProducts.size(); i++) {
            System.out.println(i + " --- " + listProducts.get(i));
        }
    }

    public int ChooseProduct () {
        System.out.println("---- Choose Product ---- ");
        displayProduct();
        return input.nextInt();
    }

    public double getProductPrice (int i) {
        return listProducts.get(i).getPrice();
    }

    public void removeProduct (int i) {
        listProducts.remove(i);
    }

}
