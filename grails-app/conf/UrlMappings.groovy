class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/v1/customers" (resources: "customer", namespace: "v1") {
            "/orders" (resources: "order", namespace: "v1")
        }

        "/v2/customers" (resources: "customer", namespace:"v2") {
            "/orders" (resources: "order", namespace:"v2")
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
