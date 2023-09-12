package lessons.bankingApp.service;

import lessons.bankingApp.dao.AccountDao;
import lessons.bankingApp.model.Account;

public class AccountService {

    private AccountDao dao;
    public static int accountSavingCounter = 0;

    public AccountService(AccountDao dao) {
        this.dao = dao;
    }

    public Account getAccountById(int accountId) {
        return dao.getAccountById(accountId);
    }

    public void saveAccount(Account account) {
        dao.saveAccount(account);
        accountSavingCounter++;
    }
}
