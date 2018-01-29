package jUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FirstjUnitTest extends ConfigUnit {

    public int testvalue = 2;
    public String testMessage="MRS";
    public String testMessage2="XMRS";
    public  int testValue2 = 15;


    @Test
    public void firstTest() {
        assertFalse("działa",testvalue==(1+3));
        assertTrue("działa",testvalue==(1+1));
    }
    @Test
    public void secondTest(){
        Integer wartoscTestowa = null;
        assertNull(wartoscTestowa);
        wartoscTestowa=1;
        assertNotNull(wartoscTestowa);

    }
}
