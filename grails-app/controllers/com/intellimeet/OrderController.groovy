package com.intellimeet

import grails.rest.RestfulController

class OrderController extends RestfulController <ProductOrder>{
    static responseFormats = ['json']

    OrderController() {
        super (ProductOrder)
    }

}
