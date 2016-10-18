package ejb.remote.stateful;

public interface RemoteCounter {
	public int getCount();
	public void increment();
	public void decrement();
	public int getNbInstance();
}
