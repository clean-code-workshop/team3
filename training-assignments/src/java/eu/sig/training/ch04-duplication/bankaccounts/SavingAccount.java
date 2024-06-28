package eu.sig.training.ch04.v3;

import eu.sig.training.ch04.BusinessException;
import eu.sig.training.ch04.Money;

// tag::SavingsAccount[]
public class SavingsAccount extends Account {
    CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(Money amount)
        throws BusinessException {
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            Transfer result = new Transfer(this, acct, amount);
            return result;
        } else {
            throw new BusinessException("Account staat niet geregistereerd kan geen geld overmaken🐷");
        }
    }
