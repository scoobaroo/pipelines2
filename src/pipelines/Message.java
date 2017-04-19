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
public class Message<Data> {
    public Data content;
    public Boolean quit=false;
    public Boolean fail=false;
    public Message(Data content){
        this.content=content;
    }
    public Data getContent(){
        return this.content;
    }
    public void setContent(Data content){
        this.content=content;
    }
}
