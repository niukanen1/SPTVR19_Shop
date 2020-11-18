package entity.manager;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String name;
    private String weight;
    private String life;
    private double price;

    @Override
    public String toString() {
        return "entity{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", life='" + life + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product Product = (Product) o;
        return Objects.equals(name, Product.name) &&
                Objects.equals(weight, Product.weight) &&
                Objects.equals(life, Product.life) &&
                Objects.equals(price, Product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, life, price);
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
