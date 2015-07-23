package com.intellimeet

import grails.rest.Resource

@Resource(uri = "/customer", formats = ["json", "xml"])
class Customer {
    String name
    int age

    static constraints = {
    }
}
