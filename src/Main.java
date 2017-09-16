
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
                String startDateString = "11/12/2232";
DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
Date startDate =null;
try {
    startDate = df.parse(startDateString);
} catch (ParseException e) {
    e.printStackTrace();
}
                Student std = new Student(123,"one",startDate,43.3);
                Student std1 = new Student(123,"two",startDate,43.3);
                Student std2 = new Student(123,"three",startDate,43.3);
                Student std3 = new Student(123,"4",startDate,43.3);
                Student std4 = new Student(123,"one",startDate,44.3);
                Student [] cse = {std1,std2,std3,std4};
                StudentGroup cseb = new StudentGroup(4);
                cseb.setStudents(cse);
                System.out.println(cseb.len);
                cseb.addFirst(std);
                System.out.println(cseb.len);
                cseb.removeFromIndex(1);
                System.out.println(cseb.len);
                
	}

}
