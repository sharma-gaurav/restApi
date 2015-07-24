package com.intellimeet

class ProductOrder {
    int orderNumber
    int amount

    static belongsTo = [customer: Customer]

    static constraints = {
    }
}
