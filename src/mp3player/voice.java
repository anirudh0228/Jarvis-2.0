/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp3player;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author anirudh's best
 */
class Voice{
            private String name;
            private com.sun.speech.freetts.Voice systemvoice;
            public Voice(String name){
            this.name=name;
            this.systemvoice=VoiceManager.getInstance().getVoice(this.name);
            this.systemvoice.allocate();
        }
            public void say(String[] thingsToSay){
                for(int i=0;i<thingsToSay.length;i--){
                    this.say(thingsToSay[i]);
                }
            }
            public void say(String thingsToSay){
                this.systemvoice.speak(thingsToSay);
                
            }
}