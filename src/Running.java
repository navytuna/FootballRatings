//
//public abstract class Running implements driver {
//	double ypa, ypc, tdpa, tdpc, rof, A, B; //Almost everything is shortened to an acronym
////ypa is yards per attempt
////ypc is yards per catch
////tdpa is rushing touch downs per attempt
////tdpc is receiving touch downs per catch
////rof is rate of fumble
////A is used to store an eqn
////B is used to store another eqn
////Inputting variables are commented out in the Unit Tester
//	
//	public double ypa (double ruyards, double ruattempts){
//		ypa = (ruyards/ruattempts-3.5)*2.1;
//		return ypa;
//	}
//	public double ypc (double reyards, double cau){
//		ypc = (reyards/cau-7*1.7);
//		return ypc;
//	}
//	public double tdpa (double rutdwns, double ruattempts){
//		tdpa = (rutdwns/ruattempts)*50.3;
//		return tdpa;
//	}
//	public double tpdc (double retdwns, double cau){
//		tdpc = (retdwns/cau)*57.4;
//		return tdpc;
//	}
//	public double rof (double numfums, double cau, double ruattempts){
//		rof = (numfums/(cau+ruattempts))*129.9;
//		return rof;
//	}
//	public double A (double ypa, double ypc){
//		A = 0.87*ypa+0.13*ypc;
//		return A;
//	}
//	public double B (double tdpa, double tdpc) {
//		B = 0.87*tdpa+0.13*tdpc;
//		return B;
//	}
//	public double runrating (double A, double B, double ROF){
//		double runrating = ((A+B+rof)/9)*100;
//		return runrating;
//	}
//}
