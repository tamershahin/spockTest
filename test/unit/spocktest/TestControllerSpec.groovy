package spocktest

import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification
import spock.lang.Unroll

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

    @Unroll
    void "test without "() {

        when: 'the index action throws an exception'
        params.id = id
        controller.index()

        then: "expect that the exception handler was invoked"
        response.text == 'got problems'

        where:
        id << [-1, 0, null]
    }

}
