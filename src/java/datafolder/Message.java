/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datafolder;

import APIresources.TimeResources;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kimmo
 */
@XmlRootElement
public class Message {

    private String content;
    private String postName;
    private int conversationID;
    private String currentTime;

    public Message() {
    }

    public Message(String content, String name, int id) {
        this.content = content;
        this.postName = name;
        this.conversationID = id;
        this.currentTime = TimeResources.getInstance().getTimestamp();
    }

    @XmlElement
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @XmlElement
    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }
    public void setConversationID(int id){
        this.conversationID = id;
    }
    @XmlElement
    public int getConversationID(){
        return this.conversationID;
    }
        
    @XmlElement
    public String getCurrentTime(){
        return this.currentTime;
    }
}
