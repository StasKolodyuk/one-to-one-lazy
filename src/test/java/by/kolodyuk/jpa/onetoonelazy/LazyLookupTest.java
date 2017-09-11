package by.kolodyuk.jpa.onetoonelazy;

import by.kolodyuk.jpa.onetoonelazy.model.ParentLookup;
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
    public void composite() {
        ParentLookup parentLookup = entityManager.find(ParentLookup.class, 1L);

        assert parentLookup.getId() == 1L;
        assert parentLookup.getLookupId() == 1L;
        assert parentLookup.getLookupDescription().equals("firstDescription");
    }
}
