public class Main {
    public static void main(String[] args) {
        int account = 100;
        int add = 1000;

        if (add >= 1000) {
            int bonus = add / 100;

            System.out.println("Вы получили бонусов- " + (add / 100));
            System.out.println("Сумма на счете- " + (account + add + bonus));
        } else {
            System.out.println("Вы получили бонусов- 0");
            System.out.println("Сумма на счете- " +(account + add));
        }

    }
}