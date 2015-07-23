class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/customers" (resources: "customer")

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
