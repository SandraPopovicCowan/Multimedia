/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author macbookair
 */
public class Television {
    private int volume = 0;
    private int currentProgram = 1;
    private boolean tunrOn = false;



    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }
    
    public int currentProgram() {
        return this.currentProgram;
    }
    
    public void setCurrentProgram (int newCurrentProgram) {
        this.currentProgram = newCurrentProgram;
    }
    
    public boolean getTurnOn() {
        return this.tunrOn;
    }
    
    public void setTurnOn(boolean newTurnOn) {
        this.tunrOn = newTurnOn;
    }
    
    
     

     
     
}