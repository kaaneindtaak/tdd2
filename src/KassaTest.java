
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KassaTest {
    @Test
    void startingSituation() {
        Kassa kassa = new Kassa();
        int coins = kassa.getAmountOfCoins(33);
        assertEquals(0, coins);
    }

    @Test
    void buyCoins() {
        Kassa kassa = new Kassa();
        kassa.buyCoins(33, 100);
        int coins = kassa.getAmountOfCoins(33);
        assertEquals(100, coins);
    }

    @Test
    void buyCoinsNegativeAmount() {
        Kassa kassa = new Kassa();
        kassa.buyCoins(33, -100);
        int coins = kassa.getAmountOfCoins(33);
        assertEquals(0, coins);
    }

    @Test
    void buyCoins_forOtherTable() {
        Kassa kassa = new Kassa();
        kassa.buyCoins(33, 100);
        int coins = kassa.getAmountOfCoins(1);
        assertEquals(0, coins);
    }

    @Test
    void order() {
        Kassa kassa = new Kassa();
        kassa.buyCoins(33, 100);
        kassa.order(33, 10);
        int coins = kassa.getAmountOfCoins(33);
        assertEquals(90, coins);
    }

    @Test
    void order_noCoins() {
        Kassa kassa = new Kassa();
        kassa.order(33, 10);
        int coins = kassa.getAmountOfCoins(33);
        assertEquals(0, coins);
    }

    @Test
    void order_notEnoughCoins() {
        Kassa kassa = new Kassa();
        kassa.buyCoins(33, 10);
        kassa.order(33, 100);
        int coins = kassa.getAmountOfCoins(33);
        assertEquals(10, coins);
    }

    @Test
    void order_exactlyEnoughCoins() {
        Kassa kassa = new Kassa();
        kassa.buyCoins(33, 100);
        kassa.order(33, 100);
        int coins = kassa.getAmountOfCoins(33);
        assertEquals(0, coins);
    }

    @Test
    void buyCoinsTwice() {
        Kassa kassa = new Kassa();
        kassa.buyCoins(33, 100);
        kassa.buyCoins(33, 77);
        int coins = kassa.getAmountOfCoins(33);
        assertEquals(177, coins);
    }
    @Test
    void buyCoinsFor2Tables() {
        Kassa kassa = new Kassa();
        kassa.buyCoins(33, 100);
        kassa.buyCoins(25, 144);

        int coinsForTable33 = kassa.getAmountOfCoins(33);
        assertEquals(100, coinsForTable33);
        int coinsForTable25 = kassa.getAmountOfCoins(25);
        assertEquals(144, coinsForTable25);
    }
    @Test
    void buyCoinsAndOrderForOtherTable() {
        Kassa kassa = new Kassa();
        kassa.buyCoins(33, 100);
        kassa.buyCoins(25, 144);
        kassa.order(25, 10);

        int coinsForTable33 = kassa.getAmountOfCoins(33);
        assertEquals(100, coinsForTable33);
        int coinsForTable25 = kassa.getAmountOfCoins(25);
        assertEquals(134, coinsForTable25);

    }
}