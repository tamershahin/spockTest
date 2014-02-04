package spocktest

class TestController extends BasicController {

    def index(IndexCommand command) {
        if (!command.validate()) {
            throw new Exception('dummy')
        }

        render 'well done!'
    }

    def afterInterceptor = {
        log.debug 'do something'
    }

}

class IndexCommand {
    Integer id

    static constraints = {
        id nullable: false, min: 1
    }
}
