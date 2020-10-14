
import java.util.HashMap;
import java.util.Map;

public class Kassa {

    private Map<Integer, Integer> amountOfCoinsPerTable = new HashMap<>();

    public int getAmountOfCoins(int tableNumber) {
        Integer foundAmount = amountOfCoinsPerTable.get(tableNumber);
        return (foundAmount != null) ? foundAmount : 0;
    }

    public void buyCoins(int tableNumber, int amountOfCoinsToBuy) {
        if (amountOfCoinsToBuy<0) return;
        int foundAmount = getAmountOfCoins(tableNumber);
        amountOfCoinsPerTable.put(tableNumber, amountOfCoinsToBuy + foundAmount);
    }

    public void order(int tableNumber, int amountOfCoinsOrdered) {
        Integer foundAmount = amountOfCoinsPerTable.get(tableNumber);
        if (foundAmount == null) return;
        if (foundAmount < amountOfCoinsOrdered) return;
        amountOfCoinsPerTable.put(tableNumber, foundAmount - amountOfCoinsOrdered);
    }
}