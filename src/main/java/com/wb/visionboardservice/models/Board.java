package com.wb.visionboardservice.models;

import java.util.UUID;

public class Board {
    private UUID userId;
    private String name;
    private String description;

    public Board() {
    }

    public Board(UUID userId, String name, String description) {
        this.userId = userId;
        this.name = name;
        this.description = description;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Board{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

