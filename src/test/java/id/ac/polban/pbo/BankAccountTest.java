package id.ac.polban.pbo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    @Test
    void deposit_menambahSaldo() {
        // Arrange
        BankAccount acc =
            new BankAccount("001", "Andi", 100_000);

        // Act
        acc.deposit(50_000);

        // Assert
        assertEquals(150_000, acc.getBalance(), 0.001);
    }
}
