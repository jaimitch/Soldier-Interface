package com.theironyard.installparty;

public class BasicTraining extends Soldier implements KaRazy, Dozens, Bomb {
    String name = "Mitchell";
    String rank = "Airman";
    double serialNumber = 8675309;

    @Override
    public String speak() {
        return "Sir, yes Sir!";
    }

        boolean hasEaten(){
            return true;
        }

        boolean hasSlept() {
            return false;
        }

    public String windmill() {
            return "windmill";
    }
    public String closeline() {
        return "closeline";
    }
    public String biting() {
            return "bite";
    }

    public String yoMomma() {
            return "Yo momma so stupid, she thought a Quarterback was a refund";
    }
    public String yoGranny() {
            return "Yo granny ears so big, she can hear the sunrise";
    }
    public String yoBigAssAuntie() {
            return "Yo big ass auntie so big, when God said let there be light He asked her to move out of the way!!";
    }


    @Override
    public String throwBomb() {
        return "Mortal Kombat";
    }
}
