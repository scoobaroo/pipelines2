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
public class DurationFilter extends Tester<Note>{
    public int maxDuration = 1500;
    public int minDuration = 10;

    public DurationFilter() {
    }

    public Boolean test(Note note) {
        System.out.println("Inside test function of DurationFilter");
        if (note.duration>maxDuration || note.duration<minDuration)
            return false;
        else
            return true;
    }
    public void update(){
        super.update();
    }
}
