package com.intellimeet

import grails.rest.Resource

@Resource(formats = ["json", "xml"])
class Customer {
    String name
    int age

    static constraints = {
    }
}
