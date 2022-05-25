package com.company;

public class Main {

    public static void main(String[] args) {
        Boss argen = new Boss();
        argen.setHeath(250);
        argen.setDamage(15);
        System.out.println(argen.getHeath ()+ "\n "+ argen.getDamage());
        System.out.println("argenboss");
        Skeleton skeleton = new Skeleton();
        skeleton.setHeath(200);
        skeleton.setDamage(20);
        skeleton.weapon.setAwm("awm");
        skeleton.weapon.setGunShot("gunshot");
        System.out.println(skeleton.printInfo());
    }
}
