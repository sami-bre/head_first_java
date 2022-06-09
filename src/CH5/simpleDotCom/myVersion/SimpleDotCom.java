package CH5.simpleDotCom.myVersion;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<Integer> locations = new ArrayList<Integer>();

    SimpleDotCom(){
        // generate the cell positions while constructing a simple dot com object.
        int start = (int) (Math.random() * 4);
        this.locations.add(start);
        this.locations.add(start+1);
        this.locations.add(start+2);
    }

    String checkYourself(int position){
        if(locations.contains(position)){
            locations.remove((Integer) position);
            if(locations.isEmpty()){
                return "kill";
            } else {
                return "hit";
            }
        } else {
            return "miss";
        }
    }
}
