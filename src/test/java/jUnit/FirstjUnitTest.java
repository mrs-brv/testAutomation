package jUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;

public class FirstjUnitTest extends ConfigUnit {

    public int testvalue = 2;
    public String testMessage="MRS";
    public String testMessage2="XMRS";
    public  int testValue2 = 15;
    List<Integer> integery = Arrays.asList(1,2,3,4,5,6);
    List<Integer> integery2 = Arrays.asList(1,2,3,4,5,6);


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


    @Test
    public void thirdTest(){
        assertThat(integery, hasItem(5));
        assertThat(integery, hasSize(6));
        assertArrayEquals(integery.toArray(), integery2.toArray());

    }
}
