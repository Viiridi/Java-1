package p04control;

public class Branches {

    public static void main(String[] args) {

        int count = 1;

        while (count <= 10){
            if (count == 6) {
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        }
        loop();
        System.out.println("loop() method finished");
    }

    private static void loop(){
        for (int i=0; i < 5; i++){
            System.out.println(i);
            if (i == 3){
                return;
            }
        }
    }
}
