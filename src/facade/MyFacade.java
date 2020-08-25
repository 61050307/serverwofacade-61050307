/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author siraphat
 */
public class MyFacade {
    private static MyFacade myFacadeObj = null;
        private MyFacade() {}
        public static MyFacade getMyFacadeObject() {
            if (myFacadeObj == null) {
                myFacadeObj = new MyFacade();
            } 
            return myFacadeObj;
        }
        public void StartFunc() {
            StartClass obj = new StartClass();
            obj.startBooting();
            obj.readSystemConfigFile();
            obj.init();
            obj.initializeContext();
            obj.initializeListeners();
            obj.createSystemObjects();
            obj.releaseProcesses();
            
           
        }
        public void StopFunc() {
            StopClass obj = new StopClass();
            obj.destory();
            obj.destoryContext();
            obj.destoryListeners();
            obj.destroySystemObjects();
            
        }
    
}
