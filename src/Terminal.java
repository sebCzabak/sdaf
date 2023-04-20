import java.util.Scanner;

public class Terminal {
    public Terminal() {
    }
    MenuList menuList = new MenuList();
    UserBasket userBasket = new UserBasket();
    UserOrder userOrder = new UserOrder();

    public void greeting() {

        System.out.println("Welcome to MC'Donald's.");
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("What you wanna do?\n");
            System.out.println("1.Show menu");
            System.out.println("2.Show my basket");
            System.out.println("3.Make an order");
            System.out.println("4.Exit");

            int userChoice = scanner.nextInt();

            switch (userChoice) {

                case 1 -> menuList.displayMenu();
                case 2 -> userBasket.displayBasket();
                case 3 -> userOrder.makeAnOrder();
                case 4 -> shouldContinue = false;

            }

        }


    }
}
