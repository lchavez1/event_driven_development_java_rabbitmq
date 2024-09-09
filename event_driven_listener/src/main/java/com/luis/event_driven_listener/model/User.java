package com.luis.event_driven_listener.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record User(
        @JsonProperty("name")
        String name
) { }
