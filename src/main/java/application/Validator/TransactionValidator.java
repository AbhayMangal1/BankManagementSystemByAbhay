package application.Validator;

import application.Entity.Account;


public class TransactionValidator {

    public boolean validate(Account from, Double amount) {
        return (from.getBalance() - amount) > 0 && amount > 0;
    }
}
