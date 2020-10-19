import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProblemThree {

    public static void main(String[] args){



        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education", "root", "Debbyryan1");
            Statement mystatement = con.createStatement();
            ResultSet codespeedy=mystatement.executeQuery("SELECT course.name,institution.name,  COUNT(*) AS 'student.course' FROM  course INNER JOIN student ON student.course=course.courseid INNER JOIN institution ON institution.institutionid=course.institution GROUP BY institution.institutionid,institution.name ORDER BY institution.name");

           // ResultSet codespeedy=mystatement.executeQuery("select course.name ,institution.name,student.course from institution,course,student where course.courseid=institution.institutionid ");
           while(codespeedy.next())
            {
               // System.out.println(codespeedy.getString("institution.name")+"  |  "+codespeedy.getString("course.name")+"  |  "+codespeedy.getString("student.course"));
           System.out.println(codespeedy.getString("institution.name")+"  |  "+codespeedy.getString("course.name")+"  |  "+codespeedy.getString("student.course"));

            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}