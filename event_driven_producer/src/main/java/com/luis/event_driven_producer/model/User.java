package com.luis.event_driven_producer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record User(
        @JsonProperty("name")
        String name
) { }
