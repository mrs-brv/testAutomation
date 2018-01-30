package jUnit;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

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
}
