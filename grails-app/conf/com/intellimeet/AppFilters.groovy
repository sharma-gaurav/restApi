package com.intellimeet

class AppFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                println "============================="
                println params
                println "============================="
                println request.getMethod()
                println "============================="
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
