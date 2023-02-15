

public class Calculator {
    public static void calculete(int countGuest) {

        Product product = new Product();
        System.out.println("Введите название блюда:");
        while (true) {
            String name;

            name = Main.scanner.next();
            if (name.equalsIgnoreCase("Завершить")) {
                break;
            } do {
                product.nameProduct += name + "\n";
                System.out.println("Введите стоимость товара (цифрой)");
                while(!Main.scanner.hasNextDouble()){
                    System.out.println("Не коректный ввод цены, попробуйте еще раз.");
                    Main.scanner.next();
                }
                product.priceProduct += Main.scanner.nextDouble();
                System.out.println("Чтобы закончить формирование счета введите команду \"Завершить\"\nЕсли хотите продолжить формировать счет,\n" +
                        "введите название блюда:");

            }while (Main.scanner.hasNextDouble());
        }
        System.out.println(product.nameProduct + "\n" + "Общая стоимость = " +
                String.format("%.2f",product.priceProduct)   + " " + Formater.GetEnding((int) product.priceProduct) );
        System.out.println("Сума для каждого гостя = " + String.format("%.2f",product.priceProduct / countGuest)
                +" " + Formater.GetEnding((int) (product.priceProduct / countGuest)) );
    }
}