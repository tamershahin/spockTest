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

        when: 'the indexObj action throws an exception'
        params.id = 1
        controller.indexObj()

        then: "expect that the exception handler was invoked"
        view == '/someErrorPage'

    }

    void "test without "() {

        when: 'the index action throws an exception'
        controller.index()

        then: "expect that the exception handler was invoked"
        view == '/someErrorPage'

    }

}
