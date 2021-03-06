import java.util.ArrayList;

public class arrivalTimeSearch {
    private ternarySearchTree<stopTime> stopTimeTree;

    //create ternary search tree for searching by arrival time
    public arrivalTimeSearch() {
        stopTimeTree = new ternarySearchTree<>();
        stopTimeList makeList = new stopTimeList();
        ArrayList<stopTime> list = makeList.getList();

        for(int i = 0; i < list.size(); i++) {
            stopTimeTree.put(list.get(i).getFullDetails(), list.get(i));
        }
    }

    //get tree that was created
    public ternarySearchTree<stopTime> getStopTimeTree() {
        return stopTimeTree;
    }
}
