package spocktest

import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification
/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
@TestFor(TestController)
class TestControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test with "() {

        when: 'pass to the action a mocked commandObject'
        def commandMock = mockCommandObject(IndexCommand)
        commandMock.id = 1
        controller.indexObj(commandMock)

        then: "expected a DmgUiException"
        Exception ex = thrown()
        assert ex

    }

    void "test without "() {

        when: 'call the action'
        controller.index()

        then: "expected a DmgUiException"
        Exception ex = thrown() //test will fail with this message: Expected exception java.lang.Exception, but no exception was thrown
        assert ex

    }

}
