package pattern.build;

import java.util.ArrayList;
import java.util.List;

public class Persion {

    private List<String> list = new ArrayList<>();

    public void add(String part){
        list.add(part);
    }

    public void show(){
        for(String item: list){
            System.out.println(item);
        }

    }}
