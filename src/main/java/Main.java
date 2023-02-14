import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfGuests;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите количество гостей");
            numberOfGuests = scanner.nextInt();
            if (numberOfGuests < 1){
                System.out.println("Не коректное количество гостей, попробуйте еще раз.\n Количество гостей должно быть больше 1 ");
            } else if (numberOfGuests == 1) {
                System.out.println("Не коректное количество гостей, попробуйте еще раз.\n Количество гостей должно быть больше 1");

            } else if (numberOfGuests > 1) {
                break;
            }
        }
        Calculator.calculete(numberOfGuests);

    }
}
