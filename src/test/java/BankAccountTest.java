import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.linesOf;

public class BankAccountTest {

    BankAccount BankAccount;

    @BeforeEach
    public void setUp(){
        BankAccount = new BankAccount();
    }

    @Test
    public void canDepositMoney(){

//        when
        int actual = BankAccount.deposit(100);
        int expected = 100;
//        then
        assertThat(actual).isEqualTo(expected);


    }

    @Test
    public void canWithdrawMoney(){

//        Act
        int actual = BankAccount.withdrawal(100);
        int expected = 0;
//        Assert
        assertThat(actual).isEqualTo(expected);




    }





}
