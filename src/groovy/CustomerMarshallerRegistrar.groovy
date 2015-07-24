import com.intellimeet.Customer
import grails.converters.JSON

import javax.annotation.PostConstruct

class CustomerMarshallerRegistrar {
    @PostConstruct
    void registerMarshallers() {
        JSON.registerObjectMarshaller(Customer) {
            def map= [:]
            map['fullname'] = it.name
            map['age'] = it.age
            return map
        }
    }
}
