public class studentProfile {
    String fName;
    String lName;
    String declaredMajor;
    double gpa;
    int expectedYearOfGraduation;

    public studentProfile( String fName, String lName, String declaredMajor, double gpa,
                           int expectedYearOfGraduation){
        this.fName = fName;
        this.lName = lName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearOfGraduation = expectedYearOfGraduation;


    }

    public int incrementOfGradYear(){
        return expectedYearOfGraduation = expectedYearOfGraduation +1;
    }

}
