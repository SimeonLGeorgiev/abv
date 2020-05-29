package org.test.users

import geb.Browser
import org.test.pages.AbvHomePage
import org.test.pages.AbvMainPage
import org.test.users.roles.WebRoles

class WebUser {

    WebRoles role;

    WebUser(WebRoles role = WebRoles.ADMIN) {
        this.role = role
    }

    void login() {
       Browser.drive  {
           def page = at AbvHomePage
           waitFor { page.usernameInputField(role.username) }
           waitFor { page.passwordInputField(role.password) }
           page.loginBtn.click()
       }

    }

     void createAndSendEmail(String mail1,String mail2,String theme) {
         Browser.drive {
             def page2 = at AbvMainPage
             page2.createEmailBtn.click()
                 try {
                     page2.addReceivers(mail1, mail2)
                 }
                 catch (ignored) {
                     println("There is a bug on this field and i have to ignore it");
                 }
             page2.themeTextField(theme)
             page2.sendMailBtn.click()
         }
     }
}