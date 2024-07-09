package Tree;

import Human.Human;

import java.util.ArrayList;

public class FameleTree {
    public int humanId;
    public ArrayList<Human> humanList;
    public String secondName;

    public FameleTree(ArrayList<Human> humanList, String secondName) {
        this.humanList = humanList;
        this.humanId = 0;
        this.secondName = secondName;
    }

    public void add(Human human){
        if (humanId == 0){
            humanList.add(human);
            humanId++;
        }
        if (humanId > 0){
            if ()
        }
    }


}
