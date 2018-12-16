package ejb.remote.stateless;

import javax.ejb.Stateless;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

@Stateless
public class CalculatorBean implements RemoteCalculator {
	static Logger logger = Logger.getLogger(CalculatorBean.class);
	
	public CalculatorBean(){
    	logger.setLevel(Level.DEBUG);
    	BasicConfigurator.configure();
    	logger.info("Appel du Construteur de CalculatorBean");
	}
	
	public int add(int a, int b) {
		// TODO Auto-generated method stub
        logger.info("Action de la méthode add du CalculatorBean avec comme paramètre : "+a+" et "+b);
		return a + b;
	}
	
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		logger.info("Action de la méthode substract du CalculatorBean avec comme paramètre : "+a+" et "+b);
		return a - b;
	}
}