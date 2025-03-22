package dev.jun.topologyinventory.domain.vo;

import java.util.UUID;

public record Id(UUID id) {
    public static Id withId(String id) {
        return new Id(UUID.fromString(id));
    }

    public static Id withoutId() {
        return new Id(UUID.randomUUID());
    }
}
