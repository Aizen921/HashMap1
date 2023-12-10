import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String,String> prodotti = new HashMap<>();
        prodotti.put("Cibo "," Pizza");
        prodotti.put("Bevande ", " Sprite");
        prodotti.put("Altro ", " Shampoo");
        System.out.println(prodotti);
        System.out.println();
        Map<String, String> prodotti2 = Map.of("Cibo "," Pasta", "Bevande "," Coca-Cola","Altro ", " Dentifricio");
        System.out.println(prodotti2);
        System.out.println();
        Map<String, String> prodotti3 = Map.ofEntries(
        new AbstractMap.SimpleEntry<>("Cibo "," Cereali"),
        new AbstractMap.SimpleEntry<>("Bevande ", " Aranciata"),
        new AbstractMap.SimpleEntry<>("Altro ", " Detersivi"));
        System.out.println(prodotti3);
    }
}
