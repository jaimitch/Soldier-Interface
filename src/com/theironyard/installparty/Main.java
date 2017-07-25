package com.theironyard.installparty;

public class Main {

    public static void main(String[] args) {
	BasicTraining basicTraining = new BasicTraining();

        System.out.println(basicTraining.rank);
        System.out.println(basicTraining.name);
        System.out.println(basicTraining.serialNumber);

        System.out.println(basicTraining.speak());
        System.out.println(basicTraining.hasEaten());
        System.out.println(basicTraining.hasSlept());

        System.out.println(basicTraining.windmill());
        System.out.println(basicTraining.closeline());
        System.out.println(basicTraining.biting());

        System.out.println(basicTraining.yoMomma());
        System.out.println(basicTraining.yoGranny());
        System.out.println(basicTraining.yoBigAssAuntie());

        System.out.println(basicTraining.finishHim());

    }

}
