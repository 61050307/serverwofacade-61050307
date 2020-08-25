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
public class StartClass {
    public void startBooting(){
	System.out.println("Starts booting...");
    }
    public void readSystemConfigFile(){
        System.out.println("Reading system config files...");
    }
    public void init(){
	System.out.println("Initializing...");
    }
    public void initializeContext(){
	System.out.println("Initializing context...");
    }
    public void initializeListeners(){
	System.out.println("Initializing listeners...");
    }
    public void createSystemObjects(){
        System.out.println("Creating system objects...");
    }
    public void releaseProcesses(){
        System.out.println("Releasing processes...");
    }
}
