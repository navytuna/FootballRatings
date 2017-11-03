/*
 * 
 * WARNING:
 * The equations here were manually put together
 * Because of this, they are almost certainly inaccurate.
 * Blame the lack of sources that the developer was able to grab
 * from the NFL for this.
 * 
 */

public class Receiver implements driver {
	double ypc, tdpc, rof, A; //Almost everything is shortened to an acronym
//ypc is yards per catch
//tdpc is receiving touch downs per catch
//rof is rate of fumble
//A is used to store another eqn
//Inputting variables are commented out in the Unit Tester
	
	public double ypc (double reyards, double cau){
		ypc = (reyards/cau-7*1.7);
		return ypc;
	}
	public double tpdc (double retdwns, double cau){
		tdpc = (retdwns/cau)*57.4;
		return tdpc;
	}
	public double rof (double numfums, double cau, double ruattempts){
		rof = (numfums/(cau+ruattempts))*129.9;
		return rof;
	}
	public double A (double ypc, double tdpc) {
		A = 0.87*ypc+0.13*tdpc;
		return A;
	}
	public double runrating (double A, double ROF){
		double runrating = ((A+rof)/9)*100;
		return runrating;
	}
}
