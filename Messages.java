public class Messages {

    public static void displayAnswer(String operation, String operator,
                                     Fraction fraction1, Fraction fraction2, Fraction answer) {
        System.out.print(operation + ": ");
        fraction1.display();
        System.out.print(" " + operator + " ");
        fraction2.display();
        System.out.print(" = ");
        answer.display();
        System.out.println("\t");
    }
    public static void displayAnswer1(String operation, Fraction answer1) {
        System.out.print(operation + ": ");
        answer1.display();
        System.out.println("\n");
    }
}

