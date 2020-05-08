package org.test.roles

import org.test.commons.Configuration
import org.test.commons.GebConfig


enum webRole {
    ADMIN( 'test@test.com','11aa11AA')

    String username
    String password

    webRole(String username, String password) {
        this.username = username
        this.password = password
    }
}

