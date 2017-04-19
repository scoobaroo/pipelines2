/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarBageBand;

import pipelines.Tester;

/**
 *
 * @author suejanehan
 */
public class FrequencyFilter extends Tester<Note>{
    public int maxFrequency = 127;
    public int minFrequency = 10;
    public FrequencyFilter() {
    }
    public Boolean test(Note note) {
        System.out.println("Inside test function of FrequencyFilter");
        if (note.frequency>maxFrequency || note.frequency<minFrequency)
            return false;
        else
            return true;
    }
    public void update(){
        super.update();
    }
}
