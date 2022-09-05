import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class StringListTest {
    private final StringList stringlist = new StringListImpl();
    @Test
public void clearTest() {
        StringList stringList = new StringListImpl();
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");
        assertThat(stringList.size()).isEqualTo(4);
        stringList.clear();
        assertThat(stringlist.isEmpty()).isTrue();


    }
}
