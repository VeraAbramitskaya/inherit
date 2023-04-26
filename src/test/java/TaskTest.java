import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void ShoulFindSimpleTaskMatches (){
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String query = "родителям";

        boolean expected = true;
        boolean actual = SimpleTask.matches(query); // что не так с matches?
        Assertions.assertEquals(expected, actual);


    }

}
