package com.mustafa.kafkatutorial.enm;

public enum EnmKafkaTopics {
    TEST_TOPIC("test_topic");

    private final String name;

    EnmKafkaTopics(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
