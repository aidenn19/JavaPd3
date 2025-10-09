
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
  
   double gpa(double gpaValue) {
    if (gpaValue >= 90){
        return gpaValue * 1.1;
    }
     else{
        return gpaValue;
    }


  String isGraduating(int gradelevel && int credits ){
    if(gradelevel = 12 && credits >= 44){
    return "true";
    }
    else{
        return "false";
    }
  }


}
 double bmi(double weight, double height){
    double bmi = (weight / (height * height)) * 703;
    if (bmi <= 18.4) {
        return "Underweight";
    }
    else if (bmi >= 18.5 && bmi <= 24.9){
        return "Normal";
    }
    else if (bmi >= 25.0 && bmi <= 39.9){
        return "Overweight";
    }
    else {
        return "Obese";
    }
	double shipping cost(double weight, double height){
    double bmi = (weight / (height * height)) * 703;
    if (bmi <= 18.4) {
        return "Underweight";
    }
    else if (bmi >= 18.5 && bmi <= 24.9){
        return "Normal";
    }
    else if (bmi >= 25.0 && bmi <= 39.9){
        return "Overweight";
    }
    else {
        return "Obese";
    }
}



  }

 
  
}