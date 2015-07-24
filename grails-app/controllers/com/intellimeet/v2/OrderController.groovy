package com.intellimeet.v2

import com.intellimeet.ProductOrder
import grails.rest.RestfulController

class OrderController extends RestfulController <ProductOrder>{
    static responseFormats = ['json']
    static namespace = "v2"

    OrderController() {
        super (ProductOrder)
    }

}
