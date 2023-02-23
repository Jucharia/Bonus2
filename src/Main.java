public class Main {
    public static void main(String[] args) {

        int startingScore = 250; //начальный счет
        int replenishment = 1000; //сумма пополнения
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
            System.out.println("бонусы начисляются, если сумма пополнения превышает 1000 рублей");
        } else {
            bonus = 0;
            System.out.println("бонусы не начисляются при сумме пополнения 1000 рублей и меньше");
        }


        System.out.println(startingScore + replenishment + bonus + " итоговая сумма по счету");
    }
}