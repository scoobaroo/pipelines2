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
public abstract class Transformer<Data> extends Filter<Data> {
    public Transformer(){ 
    }
    public abstract Data transform(Data msg);
    public void update(){
        Message<Data> m = inPipe.read();
        Data content = m.getContent();
        Data newContent = transform(content);
        outPipe.write(new Message(newContent));
    }
}
