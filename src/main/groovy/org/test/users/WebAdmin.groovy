package org.test.users

import org.test.roles.webRole
import static org.test.roles.webRole.ADMIN



class WebAdmin {

    static def login() {
        println ADMIN.username
        println ADMIN.password

    }
}
