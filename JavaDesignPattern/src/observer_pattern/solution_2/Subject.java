package observer_pattern.solution_2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<ObserverInterface> observers = new ArrayList<ObserverInterface>();

    public void attach(ObserverInterface observer) {
        observers.add(observer);
    }

    public void detach(ObserverInterface observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (ObserverInterface observer : observers) {
            observer.update();
        }
    }
}
