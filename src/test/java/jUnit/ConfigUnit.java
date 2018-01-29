package jUnit;

import org.junit.Before;
import org.junit.BeforeClass;

public class ConfigUnit {
    @Before
    public  void setUp(){
        System.out.println("-+-+-+ PIERWSZY TEST +-+-+-");


    }

    @BeforeClass
    public static void init(){
        System.out.println("-+-+-+ PIERWSZY TEST CLASS +-+-+-");
    }
}
