package org.test.users

import org.test.users.roles.WebRoles


class WebUser {

    WebRoles role;

    WebUser(WebRoles role = WebRoles.ADMIN) {
        this.role = role
    }

    void login() {
        println role.username
        println role.password

    }
}
