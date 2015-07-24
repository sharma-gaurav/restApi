import grails.converters.*
import com.intellimeet.*

class BootStrap {

    def init = { servletContext ->
        XML.registerObjectMarshaller Customer, { Customer customer, XML xml ->
            xml.attribute 'id', "$customer.id"
            xml.build {
                fullname(customer.name)
                age(customer.age)
            }
        }

        JSON.registerObjectMarshaller(Customer) {
            def map= [:]
            map['fullname'] = it.name
            map['age'] = it.age
            return map
        }
    }

    def destroy = {
    }
}
