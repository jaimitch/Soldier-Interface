package com.theironyard.installparty;

public interface Bomb extends Dozens {

    public String throwBomb();

    default public String finishHim(){
        return "Mortal Kombat";
    }
}
