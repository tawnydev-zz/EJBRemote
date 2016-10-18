package ejb.remote.stateful;

import javax.ejb.Remote;
import javax.ejb.Stateful;

@Stateful
@Remote(RemoteCounter.class)
public class CounterBean implements RemoteCounter {
	private static int nbInstance=0;
	private int index=0;
	
	public CounterBean(){
		nbInstance++;
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		return index;
	}

	public void increment() {
		// TODO Auto-generated method stub
		index++;
	}

	public void decrement() {
		// TODO Auto-generated method stub
		index--;
	}
	
	public int getNbInstance(){
		return nbInstance;
	}
}
