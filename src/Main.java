public class Main {
    public static void main(String[] args) {
        // first exercise:
        int numberIf = 1;
        if (numberIf == 0)  {
            System.out.println("is zero");
            return;
        } else if (numberIf > 0) {
            System.out.println("is positive");
            return;
        }
        System.out.println("is negative");


        // second exercise
        int numberWhile = 1;
        while (numberWhile < 3 ) {
            numberWhile++;
            System.out.println(numberWhile);
        }

        // third exercise
        do {
            numberWhile++;
            System.out.println(numberWhile);
        } while (numberWhile < 3 );

        // four exercise
        for (int count = 0; count <= 3; count++) {
            System.out.println(count);
        }

        // five exercise
        String season = "spring";
        switch (season) {
            case "spring":
                System.out.println("It's spring");
                break;
            case "summer":
                System.out.println("It's summer");
                break;
            case "winter":
                System.out.println("It's winter");
                break;
            case "fall":
                System.out.println("It's fall");
                break;
            default:
                System.out.println("Invalid season of the year");
                break;
        }
    }
}