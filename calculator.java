import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.*;

public class calculator {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        do {
            System.out.println("Введите числитель и знаменатель первой дроби.");
            System.out.print("Числитель: ");
            try {
                fraction1.setNumerator(in.nextInt());
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
                return;
            }
            System.out.print("Знаменатель: ");
            try {
                fraction1.setDenominator(in.nextInt());
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
                return;
            }
            if (fraction1.getDenominator() == 0) {
                System.out.println("Ошибка: Знаменатель не может быть равен 0");
            }
        } while (fraction1.getDenominator() == 0);

        System.out.print("Первая дробь: ");
        fraction1.display();
        System.out.println("\n");

        do {
            System.out.println("Введите числитель и знаменатель второй дроби.");
            System.out.print("Числитель: ");
            try {
                fraction2.setNumerator(in.nextInt());
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
                return;
            }
            System.out.print("Знаменатель: ");
            try {
                fraction2.setDenominator(in.nextInt());
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
                return;
            }
            if (fraction2.getDenominator() == 0) {
                System.out.println("Ошибка: Знаменатель не может быть равен 0");
            }
        } while (fraction2.getDenominator() == 0);

        System.out.print("Вторая дробь: ");
        fraction2.display();
        System.out.println("\n");

        Fraction answer = new Fraction();
        Fraction answer1 = new Fraction();
        //Сложение
        answer.addition(fraction1, fraction2);
        answer1.addition(fraction2);
        //Вычитание
        answer.subtraction(fraction1, fraction2);
        answer.subtraction(fraction2);
        //Умножение
        answer.multiplication(fraction1, fraction2);
        answer1.multiplication(fraction2);
        //Деление
        answer.division(fraction1, fraction2);
        answer1.division(fraction2);
        answer.divisionDisplay();
        answer1.divisionDisplay1();


        // вычисление выражения
        System.out.println("Введите арифметическое выражение с 2 простыми дробями. Обязательно нужно поставить пробел между арифметическим знаком и дробью");
        Scanner in = new Scanner(System.in);
        String arExp = in.nextLine();
        String pattern = "^(-?\\d{1,10})/(-?\\d{1,10})( )[-+*:]( )(-?\\d{1,10})/(-?\\d{1,10})$";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher1 = pattern1.matcher(arExp);
        if (matcher1.matches() == true) {
            String[] partsArExp = arExp.split("[/( )]+");
            String arOper = partsArExp[2];
            int num1 = Integer.parseInt(partsArExp[0]);
            int denom1 = Integer.parseInt(partsArExp[1]);
            int num2 = Integer.parseInt(partsArExp[3]);
            int denom2 = Integer.parseInt(partsArExp[4]);
            if ((denom1 == 0) | (denom2 == 0)) ;
            if (arOper.equals("+")) {
              answer.addition(fraction1, fraction2);
            } else if (arOper.equals("-")) {
              answer.subtraction(fraction1, fraction2);
            } else if (arOper.equals("*")) {
              answer.multiplication(fraction1, fraction2);
              answer.display();
            } else if (arOper.equals(":")) {
              if (num2 != 0) {
                answer.division(fraction1, fraction2);
              answer.divisionDisplay();
            } else {
              System.out.println("Числитель не может быть равен нулю");
            }
            }
            } else {
            System.out.println("Вы ввели выражение неправильно.");

        }
    }
}

