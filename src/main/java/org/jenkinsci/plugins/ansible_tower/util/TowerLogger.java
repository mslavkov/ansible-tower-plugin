package org.jenkinsci.plugins.ansible_tower.util;

/*
    This class is intended for potential future use. All non-Jenkins logging in the other classes
    flow through here.
 */

import java.io.Serializable;

public class TowerLogger implements Serializable {
    private boolean debugging = false;
    public void setDebugging(boolean debugging) { this.debugging = debugging; }
    public void logMessage(String message) {
        if(debugging) {
            writeMessage(message);
        }
    }

    public static void writeMessage(String message) {
        System.out.println("[Ansible-Tower] "+ message);
    }
}
