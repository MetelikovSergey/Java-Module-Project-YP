import java.util.Scanner;

public class Calculator {
    public static void calculete(int countGuest) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        while (true) {
            String name;
            System.out.println("Введите название блюда");
            name = scanner.next();
            if (name.equalsIgnoreCase("Завершить")) {

                break;
            } else {
                product.nameProduct += name + "\n ";
                System.out.println("Введите стоимость товара (цифрой)");
                product.priceProduct += scanner.nextDouble();
                System.out.println("Чтобы закончить формирование счета введите команду \"Завершить\"\nЕсли хотите продолжить формировать счет,");
            }
        }
        System.out.println(product.nameProduct + "\n" + "Общая стоимость = " +
                String.format("%.2f",product.priceProduct)   + " " + Formater.GetEnding((int) product.priceProduct) );
        System.out.println("Сума для каждого гостя = " + String.format("%.2f",product.priceProduct / countGuest)
                +" " + Formater.GetEnding((int) (product.priceProduct / countGuest)) );
    }
}