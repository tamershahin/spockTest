package spocktest

import grails.util.Environment

public class BasicController {

    def afterInterceptor = {
        log.debug 'do something'
    }

    def handleException(Exception e) {
        if (Environment.current == Environment.DEVELOPMENT) {
            log.debug 'Exception:: ', e
        }
        render 'got problems'  //in the real app i render a json
    }

}