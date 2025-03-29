package designPatterns.creational.prototype.cloning;

import java.util.ArrayList;
import java.util.List;

public class CloneThisClass implements Prototype{

    private final List<String> data;

    public CloneThisClass() {
        //retrieving data from some source or some computation is happening which take 2 seconds

        try {
            Thread.sleep(2000);
            this.data = List.of("abara", "ka", "dabara");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public CloneThisClass(List<String> data) {
        this.data = data;
    }

    public void printData() {
        for(String x : this.data) System.out.print(x);
        System.out.println();
    }

    //as we have created a new interface and try to clone using that interface we are independent
    //from the cloneable interface if we want we can remove it.
    @Override
    public Prototype deepClone() {
        //code to make it deep copy
        List<String> newData = new ArrayList<>();
        newData.addAll(this.data);
        return new CloneThisClass(newData);
    }

    public List<String> getData() {
        return data;
    }
}
