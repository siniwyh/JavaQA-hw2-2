public class Main {
    public static void main(String[] args) {
        int rubleFor = 100; // бонусный рубль за
        int balanceBefore = 123; // баланс
        int sum = 1001; // сумма пополнения
        boolean over = sum > 1000; // условие, при котором начисляется бонус
        int bonus = over ? sum / rubleFor : 0; // тернарный условный оператор
        int withBonus = sum + bonus; // расчет суммы пополнения + бонус
        int balanceAfter = balanceBefore + withBonus; // расчет баланса после пополнения

        System.out.println("Счет: " + balanceAfter + "р. (из них " + bonus + " бонусных за последнее пополнение)");

    }
}
