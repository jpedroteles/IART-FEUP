package Domain;

import java.util.ArrayList;

/**
 * Created by danma on 12/05/2017.
 */
public class Student {

    private int id;
    private String name;
    private int currentYear;
    private ArrayList<Exam> exams;

    public Student(int id, String name, int currentYear){
        this.id = id;
        this.name = name;
        this.currentYear = currentYear;
        this.exams = new ArrayList<Exam>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void addExame(Exam e){
        this.exams.add(e);
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }
    
    public double calculateExamsInDay(){
    	double percentage=0;
    	for (Exam e: exams){
    		if(e.getYear()==this.currentYear){
    			percentage++;
    		}
    	}
    	percentage=percentage/this.exams.size();
    	return percentage;
    }
}
