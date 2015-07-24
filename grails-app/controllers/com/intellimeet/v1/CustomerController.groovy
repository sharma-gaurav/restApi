package com.intellimeet.v1

import com.intellimeet.Customer
import grails.converters.JSON
import grails.converters.XML
import grails.rest.RestfulController

class CustomerController extends RestfulController<Customer> {
    static responseFormats = ['json']
    static namespace = "v1"

    CustomerController() {
        super(Customer)
    }

    @Override
    def index() {
        println "This is version 1 controller"
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
