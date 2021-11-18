import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testInsertStonks_WithAddingIntegersToBalance() {
        Account acc = new Account(500);

        int result = acc.insertStonks(40);
        int expected = 540;

        assertEquals(expected, result);
    }

    @Test
    public void testGetStonks_WithWithdrawingMoreMoneyThanAvailable() {
        Account acc = new Account(99);

        assertThrows(IllegalArgumentException.class, () -> acc.getStonks(100));

    }


}