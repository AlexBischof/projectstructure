package de.bischinger.projectstructure.boundary;

import de.bischinger.projectstructure.controller.PersonService;
import de.bischinger.projectstructure.entity.Person;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bischofa on 04.10.17.
 */
public class PersonResource implements IPersonResource {

    @Inject
    private PersonService personService;

    @Override
    public List<Person> getPersons() {
        return new ArrayList<>();
    }

    @Override
    public void celebrateBirthday(long id) {
        personService.celebrateBirthday(id);
    }
}
