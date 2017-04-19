/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelines;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author suejanehan
 */
public class Publisher {
    List<Subscriber> subscribers = new ArrayList<>();
    public void notifySubscribers(){
        for (Subscriber s : subscribers){   
            s.update();
        }
    }
    public void subscribe(Subscriber s){
        subscribers.add(s);
    }
    public void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }
}
