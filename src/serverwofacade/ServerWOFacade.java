/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

import facade.MyFacade;

public class ServerWOFacade {
    public static void main(String[] args) {
        MyFacade obj = MyFacade.getMyFacadeObject();
        obj.StartFunc();
        obj.StopFunc();
        System.out.println("61050307 Siraphat Puranawong");
    }
    
}
