package com.machinemindinnovation.basicspringboot;

public class DevDB implements DB{
    @Override
    public String getData() {
        return "Dev DB Data";
    }
}
