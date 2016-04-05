package demo

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(PersonController)
@Mock(Person)
class PersonControllerSpec extends Specification {

    void "test named query"() {
        setup:
        GroovySpy(Person, global: true)
        1 * Person.visibleToUser(_, _, _) >> {[list: { [[name: 'Jake'], [name: 'Zack']]}]}

        when:
        def model = controller.visible()

        then:
        model.people.size() == 2
    }
}
