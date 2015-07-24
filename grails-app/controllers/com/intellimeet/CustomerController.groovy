package com.intellimeet

import grails.converters.JSON
import grails.converters.XML
import grails.rest.RestfulController
import org.springframework.http.HttpStatus

class CustomerController extends RestfulController<Customer> {
    static responseFormats = ['json']

    CustomerController() {
        super(Customer)
    }

    @Override
    def index() {
        def customers = Customer.list()

        withFormat {
            html customers: customers
            json { render customers as JSON }
            xml { render customers as XML }
            '*' { render customers as JSON }
        }
    }

    @Override
    def show() {
        def customer = Customer.get(params.long("id"))

        respond(customer)
    }
}
