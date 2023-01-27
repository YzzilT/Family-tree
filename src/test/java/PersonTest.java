import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void addChild() {
        // arrange
        Person parent = new Person ("Lizzy", "Telford");
        Person child = new Person("Junior", "Telford");
        List<Person> childeren = new ArrayList<>();

        // act
        parent.addChild(parent, child);
        List<Person> kids = parent.getChildren();

        // assert
        assertEquals(childeren, kids);

        }

}