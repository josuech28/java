package com.model;

/**
 *
 * @author Josue Chinchilla Hidalgo
 * Class to stock state of the input(input)
 */
public class Input {

    //Constructors
    public Input(Object barter) {
        this.permute = barter;
        
    }
    public Input(){
        permute = null;
    }
    //Getter and Setter
    public Object getPermute() {
        return permute;
    }

    public void setPermute(Object permute) {
        this.permute = permute;
    }
    
    //ToString of Input
    @Override
    public String toString() {
        return "Input{" + "barter=" + permute + '}';
    }
   
    private Object permute;
}
