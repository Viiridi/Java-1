package pojos;

import exceptions.InsufficientFundsException;

import java.math.BigDecimal;

public class Account {

    private long number;
    private String name;
    private BigDecimal balance;
    private static long nextNumber = 1001;

    public Account(String name) throws Exception {
        number = nextNumber++;
        setName(name);
        balance = new BigDecimal("0");
    }

    public Account(String name, BigDecimal balance) throws Exception {
        this(name);
        if (balance.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = balance;
        } else {
            throw new InsufficientFundsException();
        }
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) throws InsufficientFundsException {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        } else {
            throw new InsufficientFundsException();
        }
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new Exception("Name must not be empty");
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
