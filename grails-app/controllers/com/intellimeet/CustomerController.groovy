package com.intellimeet

import grails.rest.RestfulController

class CustomerController extends RestfulController<Customer> {
    static responseFormats = ['json']

    CustomerController() {
        super(Customer)
    }
}
