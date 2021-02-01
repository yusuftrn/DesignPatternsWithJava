package behavioral.iteratorPattern.iteratorExample1.iterators;

import behavioral.iteratorPattern.iteratorExample1.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}