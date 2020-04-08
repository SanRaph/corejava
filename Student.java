/*
*write a code that creates a class student with attributes FirstName, *Lastname, Level and Grade. Write Methods to set and get individual *attributes, write a method to promote the student to the next class *if the grade is above 3.5
*/

public class Student{
       private String firstName;
       private String lastName;
       private int level;

       private double grade = 0;

       public int promotionGrade(){
           if(grade > 3.5 ){
             level += 1;
           }
           
           return level;
       }



       public void setFirstName(String firstName){
        this.firstName = firstName;
       }

       public String getFirstName(){
       return firstName;

       }

       public void setLastName(String lastName){
        this.lastName = lastName;
       }

       public String getLastName(){
       return lastName;

      }
      
      public void setLevel(int level){
       this.level = level;
      }

      public int getLevel(){
       return level;
      }

      public void setGrade(double grade){
       this.grade = grade;

      }

      public double getGrade(){
        return grade;
      }

}