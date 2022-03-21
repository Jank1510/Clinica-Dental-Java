/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicadental.com;

import clinicadental.com.controller.viewControllerLogin;

/**
 *
 * @author jank
 */
public class app {
    public static void main(String[] args) {
        viewControllerLogin loginController= new viewControllerLogin();
        loginController.iniciarLogin();
    }
}
