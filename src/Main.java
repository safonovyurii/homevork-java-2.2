public class Main {

    public static void main(String[] args) {
        int score = 100;
        boolean data = true;


        int amount = 1700;


        int bonus = (amount / 100);

        if (amount < 1000) {
            bonus = 0;
        }

        int result = (score + amount + bonus);

        System.out.println("Итоговый баланс:" + result);

        System.out.println("Колличество начисленных бонусов:" + bonus);


    }
}