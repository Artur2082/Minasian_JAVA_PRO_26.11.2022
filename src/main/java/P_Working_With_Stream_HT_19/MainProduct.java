package P_Working_With_Stream_HT_19;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MainProduct {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product("Book", 300, true, LocalDate.of(2023,1,5));
        Product product2 = new Product("Book", 70, false, LocalDate.of(2023,2,8));
        Product product3 = new Product("Journal", 230, true, LocalDate.of(2022, 8, 21));
        Product product4 = new Product("Book", 400, true, LocalDate.of(2022, 6,4));
        Product product5 = new Product("Book", 60, false, LocalDate.of(2023,2,7));
        Product product6 = new Product("Journal", 300, true, LocalDate.of(2022,8,21));

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        List<Product> productList1 = productList.stream().filter(e ->
                        e.getType().equals("Book") && e.getPrice() > 250)
                .collect(Collectors.toList());
        System.out.println("Books with price higher 250 :" + '\n' + productList1);

        List<Product> productList2 = productList.stream()
                .filter(e -> e.getType().equals("Book") && e.isDiscount()).collect(Collectors.toList());
        productList2.forEach(e -> e.setPrice(e.getPrice() - (int) (e.getPrice() * 0.1)));
        System.out.println("Books with discount :" + '\n' + productList2);

        System.out.println("Lowest price : " + getMinimal(productList, "Book"));

        System.out.println("Last three elements :");
        productList.stream().skip(productList.size() - 3).forEach(System.out::println);

        System.out.println("Books sold in 2023 with price under 75 :");
        List<Product> productList4 = productList.stream().filter(e -> e.getType().equals("Book")
                && e.getDate().isAfter(LocalDate.of(2023,1,1))
                && e.getPrice() <= 75).collect(Collectors.toList());
        System.out.println(productList4);
        int sum = productList4.stream().mapToInt(Product::getPrice).sum();
        System.out.println("Total sum = " + sum);

        Map<String, List<Product>> mapProduct = productList.stream()
                .collect(Collectors.groupingBy(Product::getType));
        System.out.println("Grouping by type :" + '\n' + mapProduct);
    }

    public static Product getMinimal(List<Product> list, String type) {
        Product product = null;
        try {
            product = list.stream().filter(e -> e.getType().equals(type) && type.equals("Book"))
                    .min(new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return o1.getPrice() - o2.getPrice();
                        }
                    }).orElseThrow(() -> new OutOfTypeException("Product - " + type + " not found;"));
        } catch (OutOfTypeException e) {
            System.out.println(e.getMessage());
        }
        return product;
    }
}
