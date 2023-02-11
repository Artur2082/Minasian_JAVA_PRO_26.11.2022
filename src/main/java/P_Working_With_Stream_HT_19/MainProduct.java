package P_Working_With_Stream_HT_19;

import java.util.*;
import java.util.stream.Collectors;

public class MainProduct {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product("Book", 300, true, new Date(1672915985000L));
        Product product2 = new Product("Book", 70, false, new Date(1675853585000L));
        Product product3 = new Product("Journal", 230, true, new Date(1661079185000L));
        Product product4 = new Product("Book", 400, true, new Date(1654339985000L));
        Product product5 = new Product("Book", 60, false, new Date(1675728000000L));
        Product product6 = new Product("Journal", 300, true, new Date(1661079185000L));

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
                && e.getDate().after(new Date(1672531200000L))
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
