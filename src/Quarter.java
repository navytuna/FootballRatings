
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
	 if(((completions/attempts-0.3)*5)<2.375){
		 if(((completions/attempts-0.3)*5)>0)
	 return((completions/attempts-0.3)*5);
		 else
			 return 0.0;
	 }
	 else
		 return 2.375;
 }
 public double getB(){
	 if(((completions/attempts-0.3)*5)<2.375){
		 if(((completions/attempts-0.3)*5)>0)
	 return((completions/attempts-0.3)*5);
		 else
			 return 0.0;
	 }
	 else
		 return 2.375;
 }
 public double getC(){
	 if(((completions/attempts-0.3)*5)<2.375){
		 if(((completions/attempts-0.3)*5)>0)
	 return((completions/attempts-0.3)*5);
		 else
			 return 0.0;
	 }
	 else
		 return 2.375;
 }
 public double getD(){
	 if(((completions/attempts-0.3)*5)<2.375){
		 if(((completions/attempts-0.3)*5)>0)
	 return((completions/attempts-0.3)*5);
		 else
			 return 0.0;
	 }
	 else
		 return 2.375;
 }
 public double getRating(){
	 return((getA()+getB()+getC()+getD())/6)*100;
 }
 }


