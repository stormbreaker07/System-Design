package designPatterns.creational.prototype.cloning;

import java.util.List;

public class ShallowCloneClass implements Cloneable{

    private final List<String> data;


    public ShallowCloneClass() {
        //retrieving data from some source or some computation is happening which take 2 seconds

        try {
            Thread.sleep(2000);
            this.data = List.of("abara", "ka", "dabara");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public ShallowCloneClass(List<String> data) {
        this.data = data;
    }

    public void printData() {
        for(String x : this.data) System.out.print(x);
        System.out.println();
    }

    @Override
    public ShallowCloneClass clone() {
        try {
            return (ShallowCloneClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public List<String> getData() {
        return data;
    }
}
