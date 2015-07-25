import com.intellimeet.*

class BootStrap {

    def init = { servletContext ->
        new UserRole(new User("gaurav", "password").save(), new Role("ROLE_USER").save()).save(flush:true)
    }
    def destroy = {
    }
}
