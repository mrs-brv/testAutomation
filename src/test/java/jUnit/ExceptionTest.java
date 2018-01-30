package jUnit;

import com.jsystems.models.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class ExceptionTest {
    @Test(expected = ArithmeticException.class)
    public void testArithmeticException(){
        int i=1/0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException(){
        List<String> listaStringow = new ArrayList<String>();
        assertTrue(listaStringow.get(0).equals("asdasdasd"));
    }

    Person person = new Person("Adam", 14);
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException(){
        new Person("Janina", -1);

    }
}
