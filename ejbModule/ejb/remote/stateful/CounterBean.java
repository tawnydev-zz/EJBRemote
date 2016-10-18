package ejb.remote.stateful;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import ejb.remote.stateless.CalculatorBean;
@Stateful
@Remote(RemoteCounter.class)
public class CounterBean implements RemoteCounter {
	static Logger logger = Logger.getLogger(CounterBean.class);
	private static int nbInstance=0;
	private int index=0;
	
	public CounterBean(){
    	logger.setLevel(Level.DEBUG);
    	BasicConfigurator.configure();
    	logger.info("Appel du Construteur de CounterBean");
		nbInstance++;
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		logger.info("récupération de la valeur de la variable index");
		return index;
	}

	public void increment() {
		// TODO Auto-generated method stub
		logger.info("incrementation de la variable index");
		index++;
	}

	public void decrement() {
		// TODO Auto-generated method stub
		logger.info("decrementation de la variable index");
		index--;
	}
	
	public int getNbInstance(){
		logger.info("recuperation de la valeur de la variable nbInstance");
		return nbInstance;
	}
}
