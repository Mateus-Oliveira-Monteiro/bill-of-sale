package model;

import java.util.List;

public class Total implements CalculateTotal{
    List<Product> products;
    @Override
    public void calculateTotal() {
        for (Product p : products) {
            double total = p.getPrice() * p.getQuantity();
            System.out.println(total);
        }

    }
}
