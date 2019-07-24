package webd4201.PatelR;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
A class that provide a Mark  information.
* @author Rahulkumar Patel
* @version 1.0 (2019/1/20)
* @since 1.0
*/
/**
 * @author gopal
 *
 */
public class Mark {
	/**
	 * MINIMUM_GPA set minimum_gpa value in float
	 * MAXIMUM_GPA set maximum_gpaa value in float
	 */
	public final float MINIMUM_GPA = (float) 0.0;
    public final float MAXIMUM_GPA = (float) 5.0;
   
    //Set  Decimal format
    DecimalFormat f = new  DecimalFormat("#.# ");   
    
    /**
     * courseCode set as a private
     * courseName set as a private 
     * both are used in this class 
     */
    private String courseCode;
    private String courseName;
    /**
     * result
     * gpaWeighting
     */
    private int result;
    private float gpaWeighting;
    
 
    /**
    * @return MINIMUM_GPA
    */
    public float getMINIMUM_GPA() {
        return MINIMUM_GPA;
    }
    /**
     * @return MAXIMUM_GPA
     */
    public float getMAXIMUM_GPA() {
        return MAXIMUM_GPA;
    }
    /**
     * @return f
     */

    public DecimalFormat getF() {
        return f;
    }
    /**
     * @return courseCode
     */
    public String getCourseCode() {
        return courseCode;
    }
    /**
     * @return courseName
     */

    public String getCourseName() {
        return courseName;
    }
    /**
     * @return result
     */
    public int getResult() {
        return result;
    }
    /**
     * @return gpaWeighting
     */
    public float getGpaWeighting() {
        return gpaWeighting;
    }
    /**
     * @param f in a decimalFormat
     */
    public void setF(DecimalFormat f) {
        this.f = f;
    }
    
    /**
     * @param courseCode in a decimalFormat
     * set courseCode
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    /**
     * @param courseName in a String format
     * set courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    /**
     * @param result in a int format
     * set result
     */

    public void setResult(int result) {
        this.result = result;
    }
    /**
     * @param gpaWeighting in a float format
     * set gpaWeighting
     */

    public void setGpaWeighting(float gpaWeighting) {
        this.gpaWeighting = gpaWeighting;
    }
    
 
    /**
     * @param courseCode
     * @param courseName
     * @param result
     * @param gpaWeighting
     * set all the parameter in a constructor
     */
    public Mark(String courseCode, String courseName, int result, float gpaWeighting) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setResult(result);
        setGpaWeighting(gpaWeighting);
    }
    
    /**
     * @param key
     * @return StudentDA.result aMArk 
     * get marks from the tables
     */
//    public static Mark result(long key) throws SQLException, NotFoundException
//    {
//    	return StudentDA.result(key);
//    }
//    
    /**
     * toString method to  get display message
     * with Marks and GPA  with courseCode
     * @param 
     * @return output in string
     * 
    **/
     public  String toString()
    { 
        String output = " "+getCourseCode();
        output += " "+String.format("%-35s", getCourseName()); //to set string size
        output += " "+getResult();
        output += " "+f.format(getGpaWeighting()); // to get formated gpa
        
        return output;    
    }
    //4-e ended

       
}
