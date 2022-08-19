import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a
    // nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a
    // single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested
    // list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

public class E341_FlattenNestedListIterator {
    public static void main(String[] args) {
        // Your NestedIterator object will be instantiated and called as such:
        // NestedIterator i = new NestedIterator(nestedList);
        // while (i.hasNext()) v[f()] = i.next();
    }
}

class NestedIterator implements Iterator<Integer> {

    // private List<NestedInteger> nestedList = null;
    // private int count = -1;

    private List<Integer> integerList = null;
    private Iterator<Integer> integerListIterator = null;

    public NestedIterator(List<NestedInteger> nestedList) {
        // this.nestedList = nestedList;
        // this.count = 0;

        integerList = new ArrayList<>();
        search(nestedList);
        integerListIterator = integerList.iterator();
    }

    private void search(List<NestedInteger> nestedList) {
        for (int i = 0; i < nestedList.size(); i++) {
            NestedInteger nestedInteger = nestedList.get(i);

            if (nestedInteger.isInteger()) {
                integerList.add(nestedInteger.getInteger());
            } else {
                List<NestedInteger> newNestedIntegers = nestedInteger.getList();
                search(newNestedIntegers);
            }
        }
    }

    @Override
    public Integer next() {
        // Integer integer = null;
        //
        // NestedInteger nestedInteger = nestedList.get(count);
        // count++;
        //
        // if (nestedInteger.isInteger()) {
        // integer = nestedInteger.getInteger();
        // } else {
        // List<NestedInteger> newNestedIntegers = nestedInteger.getList();
        // NestedIterator iterator = new NestedIterator(newNestedIntegers);
        // while (iterator.hasNext()) {
        // integer = iterator.next();
        // }
        // }
        //
        // return integer;

        return integerListIterator.next();
    }

    @Override
    public boolean hasNext() {
        // if (count < nestedList.size()) {
        // return true;
        // }
        // return false;

        return integerListIterator.hasNext();
    }
}