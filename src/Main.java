public class Main {
    public static void main(String[] args) {
        double numberA = 8.5;
        double numberB = 9.45;
        int numberGeneral = 10;
        double difA = Math.abs(numberGeneral - numberA);
        double difB = Math.abs(numberGeneral - numberB);
        boolean firstIsCloser = difA < difB;
        boolean secondIsCloser = difB < difA;
        if (firstIsCloser) {
            System.out.println("Число " + numberA + " находится ближе к числу " + numberGeneral + " чем, число " + numberB);
        } else if (secondIsCloser) {
            System.out.println("Число " + numberB + " находится ближе к числу " + numberGeneral + " чем, число " + numberA);
        } else {
            System.out.println("Числа " + numberA + " и " + numberB + " равноудалены от числа " + numberGeneral);
        }
    }
}