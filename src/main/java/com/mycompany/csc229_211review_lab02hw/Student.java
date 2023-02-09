package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
	// ToDo 1: Make this class a child of Person
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code
    
    // imliments the constructor of the student class
        private float gpa;
    public Student(String name, short age) {
        super(name, age);
    }
    // impliment the abstract methods of person class
    @Override
    public String getAddress() {
       return address;
    }
    // impliment the abstracts of setaddress in the person class
    @Override
    public void setAddress(String address) {
      this .address=address;
    }
    // this method will return the GPA of a student
    public float getGpa() {
    return gpa;
}
   // this method will initialize the GPA of the student
    public void setGpa(float gpa) {
    this.gpa = gpa;
}
    // This toString method will return all the details of the students
        @Override
    public String toString() {
    return "Student [name=" + getName() + ", address=" + address + ", age=" + getAge() + ", gpa=" + gpa + "]";
}

}       
