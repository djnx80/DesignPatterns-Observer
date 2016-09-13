package my.djnx.designpatterns.interfaces;

public interface Subject {
	void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
