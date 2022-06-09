package CH5.simpleDotCom.myVersion;

public class SimpleDotComGame {
    public static void main(String[] args){
        System.out.println("\nSink the dot com game ... \n");

        SimpleDotCom dotCom = new SimpleDotCom();
        Helper helper = new Helper();
        while(true){
            String guess = helper.getUserInput("guess a position (1 - 6): ");
            if(guess == null || Integer.parseInt(guess) < 1 || Integer.parseInt(guess) > 6){
                System.out.println("please enter numbers from 1 to 6");
                continue;
            }
            String result = dotCom.checkYourself(Integer.parseInt(guess)-1);
            System.out.println(result);
            if(result == "kill"){
                break;
            }
        }
    }
}
