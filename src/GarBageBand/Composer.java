/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarBageBand;

import pipelines.Message;
import pipelines.Producer;
import java.util.Random;

/**
 *
 * @author suejanehan
 */
public class Composer extends Producer<Note>{

    public Composer() {

    }
    
    public Note produce() {
        System.out.println("Inside produce function of Composer");
        Random rand = new Random();
        System.out.println(rand.nextInt(127));
        int frequency = rand.nextInt(127);
        System.out.println(rand.nextInt(1000));
        int amplitude = rand.nextInt(1000);
        System.out.println(rand.nextInt(1000));
        int duration = rand.nextInt(1000);
        Note note = new Note(frequency,amplitude,duration);
        return note;
    }
    
    public void update() {
        super.update();
    }

    public void start() {
        System.out.println("Composer started producing notes");
        super.start();
    }
    
}
