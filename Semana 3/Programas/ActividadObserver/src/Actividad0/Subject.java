package Actividad0;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	
	//Make a list from the observers
	List<Observer> observers = new ArrayList<>();
	
	//Attach to the list any observer that goes on the code 
	void attach(Observer obs) {
		observers.add(obs);
	}
	//detach any observer found in the list
	void detach(Observer obs) {
		observers.removeIf(x -> x.equals(obs));
	}
	
	//Notify the update of the objects
		void notifyobservers(){
		for(Observer obs:observers)
			obs.update();
	}

}
