/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarBageBand;

/**
 *
 * @author suejanehan
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import pipelines.Consumer;

/**
 *
 * @author suejanehan
 */
public class Player extends Consumer<Note>{
    float frequency = 44100;

    public Player() {
    }
    
    public void consume(Note note) {
        System.out.println("Inside consumer function of player");
        Note n = note;
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel channel = synth.getChannels()[0];
            channel.noteOn( n.frequency , n.amplitude );
            Thread.sleep(n.duration);
            channel.noteOff(n.frequency, n.amplitude);
        } catch (MidiUnavailableException | InterruptedException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(){
        super.update();
    }

    public void start() {
        super.start();
    }
    
}
