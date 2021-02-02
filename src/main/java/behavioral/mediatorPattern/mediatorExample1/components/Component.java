package behavioral.mediatorPattern.mediatorExample1.components;

import behavioral.mediatorPattern.mediatorExample1.mediator.Mediator;

/**
 * Common component interface
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();

}
