import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserOrder implements Basket {


    private final List<String> userBasket = new ArrayList<>();
    MenuList menuList = new MenuList();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayBasket() {

    }

    @Override
    public void addFoodToBasket(int menuItem) {

    }

    public void makeAnOrder() {
//        System.out.println("Pick something from our menu");
//        menuList.displayMenu();
//        int menuItem = scanner.nextInt();
//        addFoodToBasket(menuItem);
//
    }
}
