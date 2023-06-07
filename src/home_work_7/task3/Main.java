package home_work_7.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    private List<Integer> list ;
    public Main(Integer...args){
        this.list = new ArrayList<>(Arrays.asList(args));
    }

    public Main(){
        this.list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public List<Integer> getList() {
        return list;
    }

    public void iterate(){
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            iterator.set(next + 1);
        }
    }
}
