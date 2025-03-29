package designPatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class DataContainerObject {

    private final List<String> data;

    public DataContainerObject() {
        //retrieving data from some source or some computation is happening which take 2 seconds

        try {
            Thread.sleep(2000);
            data = List.of("abara", "ka", "dabara");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printData() {
        for(String x : this.data) System.out.print(x);
        System.out.println();
    }

    //now as creating a new object of this class will take 2 seconds every time which will reduce the
    //performance so we gonna create a new way know as cloning to create a new object
}
