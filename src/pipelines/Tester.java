/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelines;

/**
 *
 * @author suejanehan
 */
public abstract class Tester<Data> extends Filter<Data> {
    public Tester(){
    }
    public abstract Boolean test(Data msg);
    public void update(){
        Message<Data> m = inPipe.read();
        if(m.fail==true) outPipe.write(m);
        if (test(m.content)) outPipe.write(m);
        else{
            m.fail=true;
            outPipe.write(m);
        }
    }
}
