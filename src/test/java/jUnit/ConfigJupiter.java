package jUnit;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class ConfigJupiter {
    @BeforeEach
    public void setUp() {
        System.out.println("-+-+-+ Before EACH JUPITER +-+-+-");
    }
    @AfterEach
    public void tearDown(){
        System.out.println("-+-+-+ After EACH JUPITER +-+-+-");
    }
    @AfterAll
    public static void closeAll() {
        System.out.println("-+-+-+ After ALL CLASS JUPITER +-+-+-");
    }

    @BeforeAll
    public static void init() {
        System.out.println("-+-+-+ Before ALL CLASS JUPITER +-+-+-");
    }
}
