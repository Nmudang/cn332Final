/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author User
 */
abstract class ServiceDecorator implements Service {
    Service service;
    public ServiceDecorator(Service service){
        this.service = service;
    }
}
