class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/api/customers" (version:'1.0', resources: "customer", namespace: "v1") {
            "/orders" (version:'1.0', resources: "order", namespace: "v1")
        }

        "/api/customers" (version:'2.0', resources: "customer", namespace:"v2") {
            "/orders" (version:'2.0', resources: "order", namespace:"v2")
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
