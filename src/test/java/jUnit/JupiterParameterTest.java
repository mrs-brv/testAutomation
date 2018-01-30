package jUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class JupiterParameterTest {
    @DisplayName("JUPITER PARAMETRIZED TEST")
    @ParameterizedTest
    @CsvSource({"Hallo , 5","jUnit 5, 7", "'Hallo, jUnit 5', 15"})
    public void shouldArrayCompare(String tekst, Integer integer){
        List<String> listaStringow = Arrays.asList("Hallo", "jUnit 5", "Hallo, jUnit 5");
        List<Integer> listaIntegerow = Arrays.asList(5,7,15);
        assertTrue(listaStringow.contains(tekst));
        assertTrue(listaIntegerow.contains(integer));
    }
}
