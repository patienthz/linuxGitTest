package test2;

public class GameTest {
    public static void main(String[] args) {
        //create two characters
        Role r1 = new Role("Jack",100);
        Role r2 = new Role("Tom",100);

        while (true){

            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+" killed "+r2.getName());
                break;
            }

            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName()+" killed "+r1.getName());
                break;
            }

        }


    }
;
}
