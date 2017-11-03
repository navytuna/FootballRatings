//Things in this class are not named as in the other classes

public class Quarter {
 private double completions, attempts, yards, touchdowns, interceptions;
 public Quarter(double completions1, double attempts1, double yards1, double touchdowns1, double interceptions1){
 completions=completions1;
 attempts=attempts1;
 yards=yards1;
 touchdowns=touchdowns1;
 interceptions=interceptions1;
 }
 public double getA(){
	 double A = (completions/attempts-0.3)*5;
	 if (A < 2.375){
		 if (0 < A){
			 return A;
		 }else{
			 A = 0;
			 return A;
		 }
	 }else{
		 A = 2.375;
		 return A;
	 }
 }
 
 public double getB(){
	 double B = (yards/attempts-3)*0.25;
	 if (B < 2.375){
		 if (0 < B){
			 return B;
		 }else{
			 B = 0;
			 return B;
		 }
	 }else{
		 B=2.375;
		 return B;
	 }
 }
 
 public double getC(){
	 double C = (touchdowns/attempts)*20;
	 if (C < 2.375){
		 if (0 < C){
			 return C;
		 }else{
			 C = 0;
			 return C;
		 }
	 }else{
		 C = 2.375;
		 return C;
	 }
 }
 
 public double getD(){
	 double D = 2.375 - (interceptions/attempts*25);
	 if (D < 2.375){
		 if (0 < D){
			 return D;
		 }else{
			 D = 0;
			 return D;
		 }
	 }else{
		 D = 2.375;
		 return D;
	 }
 }
<<<<<<< HEAD
 
 public double getQrating (double A, double B, double C, double D) {
	double rating = ((A+B+C+D)/6)*100;
	return rating;
=======
 public double getRating(){
	 return((getA()+getB()+getC()+getD())/6)*100;
 }
>>>>>>> 81a196cf7cb6d359e42b6c995a5737d9316d9597
 }
}


