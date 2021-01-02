package kz.almat.structural.composite;

import java.util.LinkedList;
import java.util.List;

public class CategoryBuilder {

    private List<Countable> countables;

    public CategoryBuilder() {
        countables = new LinkedList<>();
    }

    public CategoryBuilder addItem(Countable countable){
        this.countables.add(countable);
        return this;
    }

    public CategoryBuilder addItems(List<Countable> countables){
        this.countables.addAll(countables);
        return this;
    }

    public Category build(){
        return new Category(this.countables);
    }
}
