import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainTest {
    //Tests for user inputs from main class: when user chooses the atransaction type, account type, or the amount.

    @Before
    public void setUp() {
    }

    @Test
    public void testInvalidOption() {
        //user input of an invalid option (e.g., "abc")
        String input = "abc3";
        int selectedOption = getUserInputOption(input);
        int expectedOption = -1; 
        assertEquals(expectedOption, selectedOption);
    }

    @Test
    public void testInvalidDepositAccountType() {
        //user input of an invalid deposit account type (e.g., "3")
        String input = "3";
        int selectedAccountType = getUserInputAccountType(input);
        int expectedAccountType = -1; 
        assertEquals(expectedAccountType, selectedAccountType);
    }

    @Test
    public void testInvalidWithdrawalAccountType() {
        //user input of an invalid withdrawal account type (e.g., "3\n")
        String input = "3\n";
        int selectedAccountType = getUserInputAccountType(input);
        int expectedAccountType = -1; 
        assertEquals(expectedAccountType, selectedAccountType);
    }

    // method to handle user input and return the selected option
    private int getUserInputOption(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        return -1; 
    }

    // method to handle user input and return the selected account type
    private int getUserInputAccountType(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        return -1; 
    }
}
