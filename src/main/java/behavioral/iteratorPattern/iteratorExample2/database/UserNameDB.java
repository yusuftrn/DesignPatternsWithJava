package behavioral.iteratorPattern.iteratorExample2.database;

public class UserNameDB implements Container {
    public String[] userNames = {"Yusuf", "Ahmet", "Melek", "Lora", "Michel"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < userNames.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return userNames[index++];
            }
            return null;
        }
    }
}
