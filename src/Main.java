public class Main {

    public static void main(String[] args) {

        int initialAmount = 50;
        int payment = 2000;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int finalAmount = initialAmount + payment + bonus;

        System.out.println("Начислено бонусов:" + bonus + "руб.");
        System.out.println("Итого на счету:" + finalAmount + "руб.");
    }
}
