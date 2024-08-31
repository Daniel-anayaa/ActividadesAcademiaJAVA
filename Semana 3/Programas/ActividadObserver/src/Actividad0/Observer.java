package Actividad0;

public abstract class Observer {
	
	//HAS A subject
	Subject sub;
	
	
	//Constructor de subject
	Observer(Subject sub){
		this.sub = sub;
		sub.attach(this);
	}
	
	//Metodo abstracto de update
	abstract void update();

}
