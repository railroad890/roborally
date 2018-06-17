package com.railroad890;

public class ProgramCard {

    private int _priority;
    private int _type;
    private int _direction;
    private int _value;

    public ProgramCard(int priority, int type, int direction, int value){
        _priority = priority;
        _type = type;
        _direction = direction;
        _value = value;
    }

    public int get_priority() {
        return _priority;
    }

    public int get_type() {
        return _type;
    }

    public int get_direction() {
        return _direction;
    }

    public int get_value() {
        return _value;
    }
}
