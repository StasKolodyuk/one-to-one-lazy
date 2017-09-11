package by.kolodyuk.jpa.onetoonelazy;

import by.kolodyuk.jpa.onetoonelazy.model.Parent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@DataJpaTest
@RunWith(SpringRunner.class)
public class LazyLookupTest {

    @Autowired
    EntityManager entityManager;

    @Test
    public void test() {
        Parent parent = entityManager.find(Parent.class, 1L); // First query

        assert parent.getId() == 1L;
        assert parent.getLookup().getId() == 1L; // Still one query
        assert parent.getLookup().getDescription().equals("firstDescription"); // Second query
    }
}
