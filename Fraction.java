public class Fraction {
    private Fraction fraction1;
    private Fraction fraction2;
    private Fraction answer;
    private Fraction answer1;
    private int num = 1 ;
    private int denom = 1;

    public int getDenominator() {
        return denom;
    }

    public void setDenominator(int denom) {
        this.denom = denom;
    }

    public int getNumerator() {
        return num;
    }

    public void setNumerator(int num) {
        this.num = num;
    }

    public Fraction addition(Fraction fraction1, Fraction fraction2) {
        this.fraction1 = fraction1;
        this.fraction2 = fraction2;
        this.answer = new Fraction();
        answer.setNumerator((fraction1.getNumerator() * fraction2.getDenominator())
                + (fraction2.getNumerator() * fraction1.getDenominator()));
        answer.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());

        Messages.displayAnswer("Результат сложения", "+", fraction1, fraction2, answer);
        return new Fraction();
    }

    public void addition(Fraction fraction2) {
        this.fraction2 = fraction2;
        this.answer1 = new Fraction();
        this.num = this.num + num;
        this.denom = this.denom + denom;
        answer1.setNumerator((this.num * fraction2.getDenominator())
                + (fraction2.getNumerator() * this.denom));
        answer1.setDenominator(this.denom * fraction2.getDenominator());
        Messages.displayAnswer1("Результат сложения с 1 аргументом", answer1);
    }

    public Fraction subtraction(Fraction fraction1, Fraction fraction2) {
        this.fraction1 = fraction1;
        this.fraction2 = fraction2;
        this.answer = new Fraction();
        answer.setNumerator((fraction1.getNumerator() * fraction2.getDenominator()) - (fraction2.getNumerator() * fraction1.getDenominator()));
        answer.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        Messages.displayAnswer("Результат вычитания", "-", fraction1, fraction2, answer);
        return new Fraction();
    }

    public void subtraction(Fraction fraction2) {
        this.fraction2 = fraction2;
        this.answer1 = new Fraction();
        this.num = this.num + num;
        this.denom = this.denom + denom;
        answer1.setNumerator((this.num * fraction2.getDenominator()) - (fraction2.getNumerator() * this.denom));
        answer1.setDenominator(this.denom * fraction2.getDenominator());
        Messages.displayAnswer1("Результат вычитания с 1 аргументом", answer1);
    }

    public Fraction multiplication(Fraction fraction1, Fraction fraction2) {
        this.fraction1 = fraction1;
        this.fraction2 = fraction2;
        this.answer = new Fraction();
        answer.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
        answer.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        Messages.displayAnswer("Результат умножения", "*", fraction1, fraction2, answer);
        return new Fraction();
    }

    public void multiplication(Fraction fraction2) {
        this.fraction2 = fraction2;
        this.answer1 = new Fraction();
        this.num = this.num + num;
        this.denom = this.denom + denom;
        answer1.setNumerator(this.num * fraction2.getNumerator());
        answer1.setDenominator(this.denom * fraction2.getDenominator());
        Messages.displayAnswer1("Результат умножения с 1 аргументом", answer1);
    }

    public Fraction division(Fraction fraction1, Fraction fraction2) {
        this.fraction1 = fraction1;
        this.fraction2 = fraction2;
        this.answer = new Fraction();
        answer.setNumerator(fraction1.getNumerator() * fraction2.getDenominator());
        answer.setDenominator(fraction1.getDenominator() * fraction2.getNumerator());
        return new Fraction();
    }

    public void division(Fraction fraction2) {
        this.fraction2 = fraction2;
        this.answer1 = new Fraction();
        this.num = this.num + num;
        this.denom = this.denom + denom;
        answer1.setNumerator(this.num * fraction2.getDenominator());
        answer1.setDenominator(this.denom * fraction2.getNumerator());
    }

    public void divisionDisplay() {
        if (fraction2.getNumerator() == 0) {
            System.out.println("Нельзя делить на 0.");
            return;
        } else {
            Messages.displayAnswer("Результат деления", "/", fraction1, fraction2, answer);
        }
    }

    public void divisionDisplay1() {
        if (fraction2.getNumerator() == 0) {
            System.out.println("Нельзя делить на 0.");
            return;
        } else {
            Messages.displayAnswer1("Результат деления с 1 аргументом", answer1);
        }
    }

    public void display() {
        if (num == 0 || denom == 1) {
            System.out.print(num);
        } else {
            if ((num < 0 && denom < 0) || (num > 0 && denom < 0)) {
                num *= -1;
                denom *= -1;
            }
            if (num == denom) {
                num = 1;
                denom = 1;
                //System.out.print(this.num + "/" + this.denom);
                return;
            }
            System.out.print(this.num + "/" + this.denom);
        }
    }
}