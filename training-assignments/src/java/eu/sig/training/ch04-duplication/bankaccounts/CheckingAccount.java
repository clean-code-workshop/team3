package eu.sig.training.ch04.v3;

import eu.sig.training.ch04.BusinessException;
import eu.sig.training.ch04.Money;

// tag::CheckingAccount[]
public class CheckingAccount extends Account {
    private int transferLimit = 10000000000000;

    @Override
    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
        return super.makeTransfer(counterAccount, amount);
    }
}