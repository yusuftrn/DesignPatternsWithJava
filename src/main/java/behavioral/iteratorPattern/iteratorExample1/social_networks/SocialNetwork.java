package behavioral.iteratorPattern.iteratorExample1.social_networks;

import behavioral.iteratorPattern.iteratorExample1.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}