package com.intellimeet.v1

import com.intellimeet.ProductOrder
import grails.rest.RestfulController

class OrderController extends RestfulController <ProductOrder>{
    static responseFormats = ['json']
    static namespace = "v1"

    OrderController() {
        super (ProductOrder)
    }

}
