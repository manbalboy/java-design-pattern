package singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {



    @Test
    @DisplayName("getInstance 로 가져온 instance는 같은 객체 이다.")
    void same_instance () {
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();


        assertTrue(singletonA == singletonB);
    }

}