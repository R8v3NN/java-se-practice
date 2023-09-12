package lessons.bankingApp.dao;


import lessons.bankingApp.model.Account;

import java.util.ArrayList;

public class AccountDao {

    ArrayList<Account> accounts = new ArrayList<>();

    public AccountDao() {
        accounts.add(new Account(1, "000001", 280.00));
        accounts.add(new Account(2, "000002", 300.00));
        accounts.add(new Account(3, "000003", 280.00));
    }

    public Account getAccountById(int accountId) {
        return accounts.get(accountId - 1);
    }

    public void saveAccount(Account account) {
        accounts.set(account.getId() - 1, account);
    }
}
