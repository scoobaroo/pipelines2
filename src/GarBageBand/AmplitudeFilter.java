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
public class AmplitudeFilter extends Tester<Note>{
    public int minAmp = 0;
    public int maxAmp = 1000;
    public AmplitudeFilter() {
    }

    @Override
    public Boolean test(Note note) {
        System.out.println("Inside test function of AmplitudeFilter");
        if (note.amplitude>maxAmp || note.amplitude<minAmp)
            return false;
        else
            return true;
    }
    public void update(){
        super.update();
    }
}
