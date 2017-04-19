package GarBageBand;

import pipelines.Transformer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Amplifier extends Transformer<Note>{
    
    float magnitude = 2;
    public Amplifier() {
    }
    public Note transform(Note note){
        System.out.println("Inside transform function of amplifier");
        note.amplitude = (int)  magnitude*note.amplitude;
        return note;
    }
    public void update(){
        super.update();
    }
    
}
