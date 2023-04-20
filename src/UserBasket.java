import java.util.*;

public class UserBasket implements Basket {
    private final Map<Integer,String> baskets = new HashMap<>();
    private final List<String>userBasket = new ArrayList<>();
    Scanner scanner =new Scanner(System.in);
    public void addFoodToBasket(int menuItem){
        int foodInBasket=scanner.nextInt();
        userBasket.add(foodInBasket,"Hamburger");
    }
    public void displayBasket() {
        if (userBasket.isEmpty()) {
            System.out.println("Your basket is empty,common make an order! :)\n");
        } else {
            System.out.println("Currently in your basket: \n");
            for (String basket : userBasket) {
                System.out.println(basket);
            }
        }
   }

}
