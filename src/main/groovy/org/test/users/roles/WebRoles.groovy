package org.test.users.roles

import org.test.commons.Configuration

enum WebRoles {

    ADMIN( Configuration.instance.config.credentials.admin.username as String,Configuration.instance.config.credentials.admin.password as String),
    USER( Configuration.instance.config.credentials.user.username as String,Configuration.instance.config.credentials.user.password as String)


    String username
    String password

    WebRoles(String username, String password) {
        this.username = username
        this.password = password
    }
}

