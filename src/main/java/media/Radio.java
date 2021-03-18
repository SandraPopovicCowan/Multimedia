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
public class Radio {
    private double fmFrequency = 91.8;
    private double amFrequency = 600;
    private char band = 'F';
    
  public double getFmFrequency() {
        return this.fmFrequency;
    }
    
    public void setFmFrequency (double newFmFrequency) {
        this.fmFrequency = newFmFrequency;
    }
    
    public double getAmFrequency () {
        return this.amFrequency;
    }
    
    public void setAmFrequency (int newAmFrequency) {
        this.amFrequency = newAmFrequency;
    }
    
    public char getBand() {
        return this.band;
    }
    
    public void setTurnOn(char newBand) {
        this.band = newBand;
    }
    
       
    
    
    
    
}
