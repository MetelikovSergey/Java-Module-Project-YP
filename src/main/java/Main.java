import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfGuests = 0;


        do {
            System.out.println("Введите количество гостей\nКоличество гостей должно быть больше 1.");
            while (!scanner.hasNextInt()){
                System.out.println("Не коректное количество гостей, попробуйте еще раз.\nКоличество гостей должно быть больше 1." +
                        "\nВведите количество гостей ");
                scanner.next();
            }
            numberOfGuests = scanner.nextInt();

        }while (numberOfGuests <= 1);


        Calculator.calculete(numberOfGuests);

    }
}