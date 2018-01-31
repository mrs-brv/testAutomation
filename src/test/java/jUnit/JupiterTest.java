package jUnit;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;

public class JupiterTest extends ConfigJupiter{
    int testowy = 20;
    String testowyString="Ala nie ma myszy";
    @Test
    @DisplayName("-+-+-+ To jest test jupiter  +-+-+-")
    @RepeatedTest(5)
    public void jupiterTest(){
        assertTrue(testowy == 20);
    }

    @ParameterizedTest
    @DisplayName("Testy z CSV")
    @CsvFileSource(resources = "/plik.csv")
    public void csvTest(String name, Integer age){
        assertTrue(name instanceof String);
        assertTrue(age instanceof Integer);
    }
    @ParameterizedTest
    @ValueSource(ints={1,2,3,4})
    public void withValueSourceTest(int value){
        assertTrue(value<100);
    }
}
