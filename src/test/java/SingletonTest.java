import com.codeallday.design.patterns.Singleton;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingletonInstanceCreation() {
        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        System.out.println(first.hashCode());
        System.out.println(second.hashCode());

        System.out.println(first.getMyList());
        System.out.println(second.getMyList());
    }
}
