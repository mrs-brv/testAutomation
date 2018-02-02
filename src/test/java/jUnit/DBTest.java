package jUnit;

import com.jsystems.models.UserMock;
import com.jsystems.util.UserRepository;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class DBTest {
    UserRepository userRepository = new UserRepository();
    @Test
    public void getUsers(){
        List<UserMock> userMockTest = new ArrayList<>();
        userMockTest = userRepository.getAll();
        System.out.println(userMockTest.toString());
//        assertTrue(userMockTest.)
    }
}
