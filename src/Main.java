
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
                Student std = new Student(123,"asda",startDate,43.3);
                StudentGroup cseb = new StudentGroup(5);
                System.out.println(cseb.len);
                cseb.addLast(std);
                System.out.println(cseb.len);
	}

}
