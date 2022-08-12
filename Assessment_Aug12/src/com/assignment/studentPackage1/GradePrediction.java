package com.assignment.studentPackage1;

public class GradePrediction extends Student{
	public void predict() {
		if(perc >= 90)
			super.grade = 'A';
		else if(perc >= 80)
			super.grade = 'B';
		else if(perc >= 70)
			super.grade = 'C';
		else if(perc >= 60)
			super.grade = 'D';
		else if(perc >= 50)
			super.grade = 'E';
		else
			super.grade = 'F';
	}
}
