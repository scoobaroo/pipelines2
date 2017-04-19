/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarBageBand;

/**
 *
 * @author suejanehan
 */
public class Note {
    public int frequency;
    public int duration;
    public int amplitude;
    public Note(int freq, int amp, int dur){
        this.frequency=freq;
        this.amplitude=amp;
        this.duration=dur;
    }
}
