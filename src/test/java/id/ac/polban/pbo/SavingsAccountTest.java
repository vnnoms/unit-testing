package id.ac.polban.pbo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SavingsAccountTest {

    @Test
    void aturanSubclass_berlakuLewatReferenceInduk() {
        BankAccount acc = new SavingsAccount(
            "003", "Citra", 100_000, 0.05);

        assertThrows(
            InsufficientBalanceException.class,
            () -> acc.withdraw(60_000)
        );

        assertEquals(100_000, acc.getBalance(), 0.001);
    }
}
