package com.intellimeet

class Customer {
    String name
    int age

    static hasMany = [orders: ProductOrder]

    static constraints = {
    }
}
