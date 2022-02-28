public class Increment {
    public static void main(String[] args){
        int i;
        int x = 0;
        int y = 0;
        //For loop
        for(i = 1; i < 3; i++){
            System.out.println("i: "+i);
        }
        //While loop
        while (x < 3){
            System.out.println("x: "+x);
            x++;
        }
        //Do while loop
        do{
            System.out.println("y: " + y);
            y++;
        }
        while(y<3);
    }
}
