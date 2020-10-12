package com.krgcorporate.greeter;

import lombok.Builder;

@Builder
public class Greeter {

    private final Mood mood;

    public String getGreetingMessage() {
        return String.format("Hello, i'm in a %s mood and you ?", this.mood);
    }
}
