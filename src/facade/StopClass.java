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
public class StopClass {
     public void destory(){
        System.out.println("Destorying...");
    }
    public void destroySystemObjects(){
	System.out.println("Destroying system objects...");
    }
    public void destoryListeners(){
        System.out.println("Destroying listeners...");
    }
    public void destoryContext(){
        System.out.println("Destroying context...");
    }
    public void shutdown(){
        System.out.println("Shutting down...");
    }
}
