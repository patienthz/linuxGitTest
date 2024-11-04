package test2;

import java.util.Random;

public class Role {
    private String name;
    private double blood;

    public Role(){

    }
    public Role(String name, double blood) {
        this.name = name;
        this.blood = blood;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBlood() {
        return blood;
    }
    public void setBlood(double blood) {
        this.blood = blood;
    }

    public void attack(Role role){
        //count produced damage
        Random random = new Random();
        double hurt = random.nextDouble()*19 + 1;

        //change the blood of damaged person
        double remainBlood = role.getBlood()-hurt;

        if (remainBlood<0){
            remainBlood=0;
        }
        role.setBlood(remainBlood);

        System.out.println(this.getName()+" attack "+role.getName()+" and produce "+hurt+
                " damage "+"and "+role.getName()+" remain "+remainBlood+" blood.");
    }

}
