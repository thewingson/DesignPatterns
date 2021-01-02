package kz.almat.structural.composite;

import java.util.List;

public class Category implements Countable{

    private List<Countable> childs;

    public Category(List<Countable> childs) {
        this.childs = childs;
    }

    public List<Countable> getChilds() {
        return childs;
    }

    public void setChilds(List<Countable> childs) {
        this.childs = childs;
    }

    @Override
    public Integer calculate() {
        Integer sum = 0;
        for (Countable countable : this.childs){
            sum += countable.calculate();
        }

        return sum;
    }
}
