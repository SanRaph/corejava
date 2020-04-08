public class StudentTest{
        public static void main(String[] args){
        

        Student studentObj = new Student();
        studentObj.setFirstName("Fola");
        studentObj.setLastName("Wemi");
        studentObj.setLevel(1);
        studentObj.setGrade(4.0);
   
        System.out.printf("%s %s %d %d", studentObj.getFirstName(), studentObj.getLastName(), studentObj.promotionGrade(), studentObj.getGrade() );

        }


}