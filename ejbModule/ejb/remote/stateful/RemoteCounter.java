package ejb.remote.stateful;

import javax.ejb.Remote;

@Remote
public interface RemoteCounter {
	public int getCount();
	public void increment();
	public void decrement();
	public int getNbInstance();
}
