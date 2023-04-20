import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<String> menu = new ArrayList<>();

    public void addFoodToMenu(String footToMenu){
        menu.add(footToMenu);
    }
    public List<String>getMenu(){
        return menu;
    }
}
