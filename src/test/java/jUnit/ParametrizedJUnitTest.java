package jUnit;

import com.jsystems.PhoneValidator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.custom.combined.CombinedParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedJUnitTest {
    private PhoneValidator phoneValidator;

    @Test
    @Parameters({"1234567890", "123-456-7890", "123.456.7890", "123 456 7890", "123-456-7890 x1234", "123-456-7890 ext1234"})
    public void checkIfPhoneCorrect(String phoneNumber) {
        assertTrue(phoneValidator.validatePhoneNumber(phoneNumber));

    }

    @Test
    @Parameters({"mrs@vp.pl", "mrs@vp.com.travel", "sitek.ms@gmail.com"})
    public void checkIfEmailCorrect(String email) {
        assertTrue(phoneValidator.isValidEmail(email));
    }

    @Test
    @CombinedParameters({"1,3", "2,4"})
    public void combinedParam(String first, String second){
        String result = first + second;
        System.out.println(result);
        assertTrue(result.contains("1") || result.contains("3"));
        assertTrue(result.contains("2") || result.contains("4"));
    }
}
