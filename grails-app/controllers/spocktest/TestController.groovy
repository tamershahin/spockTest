package spocktest

class TestController extends BasicController{

    def index() {
        throw new Exception('dummy')
    }

    def indexObj(IndexCommand command) {
        throw new Exception('dummy')
    }

}

class IndexCommand {
    String id

    static constraints = {
        id nullable: false
    }
}
