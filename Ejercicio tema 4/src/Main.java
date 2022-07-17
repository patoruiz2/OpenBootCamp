public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        int numberIf = 10;
        if (numberIf > 0) {
            System.out.println("It is positive");
        }
        if(numberIf == 0 ) {
            System.out.println("It is zero");
        }
        if (numberIf < 0) {
            System.out.println("It is negative");
        }

        int numberWhile = 0;
        while (numberWhile < 3){
            numberWhile++;
            System.out.println("the numberWhile is " + numberWhile);
        }

        int numberDoWhile = 3;
        do{
            numberDoWhile++;
            System.out.println("The numberDoWhile is " + numberDoWhile);
        }while (numberDoWhile < 3);

        for (int numberFor = 0; numberFor <= 3; numberFor++){
            System.out.println("The numberFor is " + numberFor);
        }

        var season = "Summer";
        switch (season){
            case "Summer":
                System.out.println("We're in the summer");
                break;
            case "Winter":
                System.out.println("We're in the winter");
                break;
            case "Autumn":
                System.out.println("We're in the autumn");
                break;
            case "Spring":
                System.out.println("We're in the spring");
                break;
            default:
                System.out.println("The value of season doesn't exist ");
                break;
        }
    }
}