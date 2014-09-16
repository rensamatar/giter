package com.tarconcept.model;

/**
 * Created by tar on 9/16/14.
 */
public class ItemGit {
    private String command;
    private String description;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemGit(String command, String description) {
        this.command = command;
        this.description = description;
    }
}
