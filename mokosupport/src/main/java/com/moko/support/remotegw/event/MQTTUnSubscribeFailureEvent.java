package com.moko.support.remotegw.event;

public class MQTTUnSubscribeFailureEvent {
    private String topic;

    public MQTTUnSubscribeFailureEvent(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
}
