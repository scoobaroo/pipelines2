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
public abstract class Producer<Data> extends Filter<Data>{
    public Producer(){
    }
    public abstract Data produce();
    public void start(){
        while(true){
            Data data = produce();
            Message message=new Message(data);
            if (data==null) {
                message.quit=true;
                outPipe.write(message);
                break;
            }
            if(message.quit==true)
                break;
        outPipe.write(message);
        }
    }

    public void update(){
        Data d = produce();
        Message m = new Message(d);
        if(d==null){
            m.quit=true;
        }
        outPipe.write(m);
    }
}
