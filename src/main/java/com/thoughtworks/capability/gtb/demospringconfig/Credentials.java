package com.thoughtworks.capability.gtb.demospringconfig;

public class Credentials {
    private String username;
    private String password;
    private String authMethod;

    public Credentials() {
    }

    public Credentials(String username, String password, String authMethod) {
        this.username = username;
        this.password = password;
        this.authMethod = authMethod;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    @Override
    public String toString() {
        return username + "," + password + "," + authMethod;
    }
}
