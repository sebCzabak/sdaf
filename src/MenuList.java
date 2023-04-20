import java.util.List;

public class MenuList {

    private final List<MenuItem> menuItems = List.of(
            new MenuItem(1, "Hamburger", "Tasty burger", 4.95),
            new MenuItem(2, "Cheeseburger", "Tasty burger with cheese", 6.50),
            new MenuItem(3, "Chicken burger", "Chicken filet in a bun", 5.00),
            new MenuItem(4, "Vegan Burger", "Burger for vegans 0% meat", 7.50),
            new MenuItem(5, "Soda", "Refreshing drink", 3.50),
            new MenuItem(6, "Water", "Refreshing water", 1.50),
            new MenuItem(7, "French fries", "Delicious freshly fired fires!", 3.50),
            new MenuItem(8, "Chicken nuggets", "Chicken pieces", 5.60));

    public void displayMenu() {
        System.out.println("Menu: ");
        for(MenuItem item:menuItems){
            System.out.println(item.getId()+"."+item.getName()+" "+item.getPrice()+"$");

        }
        System.out.println();

    }


}
