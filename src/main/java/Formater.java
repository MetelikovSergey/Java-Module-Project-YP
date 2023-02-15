public class Formater {
    public static String GetEnding(int num)
    {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) {
            return "рублей.коп";
        }

        switch (num%10) {
            case 1:
                return "рубль.коп";
            case 2:
            case 3:
            case 4:
                return "рубля.коп";
            default:
                return "рублей.коп";
        }
    }

}

