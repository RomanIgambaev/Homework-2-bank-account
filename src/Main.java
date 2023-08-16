public class Main {
    public static void main(String[] args) {
        double money = 1000;
        int coint = 1;
        double profit;
        while (coint <= 12) {
            money += money/100*2;
            profit = money - 1000;
            coint++;
            System.out.println("Прирост суммы каждый месяц " + (int)profit);
            if (coint >= 3){
                System.out.println("Сумма вклада "+(int)money);
            }
        }

    }
}