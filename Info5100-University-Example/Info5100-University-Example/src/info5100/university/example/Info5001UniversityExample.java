/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    
    /* 1) Create Department make sure to pass the name of the department
       2) Use the person directory to create persons some will play students role, some will play faculty role, etc
       3) Use the Course Catalog to creat some courses
       4) Create a course schedule for a semester (ex: spring 2025
       5) Use the course schedule to create some classes (course offer)
       6) Search for a person by ssn and assign as faculty (faculty profile)
       7) Search for person and assign as student (student profile)
       8) Register student for scheduled classes
    
    
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Department department = new Department("Information Systems");
//        // we need the persondirectory to create persons for the different roles
//        
//        PersonDirectory persondirectory = department.getPersonDirectory();
//        
////      Create course and keep it in the course catalog
//        
//        CourseCatalog coursecatalog = department.getCourseCatalog();        
//        Course course = coursecatalog.newCourse("algorithms", "info 6205", 4);
//        Course course2 = coursecatalog.newCourse("App Engineering", "info 5100", 4);
//
////      now lets schedule class to run for spring 2024        
//        CourseSchedule courseschedule = department.newCourseSchedule("Spring 2024");
//
//        CourseOffer courseoffer = courseschedule.newCourseOffer("info 6205");
//        CourseOffer courseoffer2 = courseschedule.newCourseOffer("info 5100");
//
//        if (courseoffer==null)return; 
//        
//        courseoffer.generatSeats(30); // allow for 30 open seats in the class
//        courseoffer2.generatSeats(50); // allow for 30 open seats in the class
//
////      Create teacher for class
//
//        Person person1 = persondirectory.newPerson("01123022"); //person for teacher role                  
//        Person person2 = persondirectory.newPerson("011230222"); 
//        FacultyDirectory facultydirectory = department.getFacultyDirectory();
//        FacultyProfile teacher = facultydirectory.newFacultyProfile(person1);
//        FacultyProfile teacher2 = facultydirectory.newFacultyProfile(person2);       
//       
//        courseoffer.AssignAsTeacher(teacher);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
//        courseoffer2.AssignAsTeacher(teacher2);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
//       
//    //  Create student     
// 
//        Person person3 = persondirectory.newPerson("0112303");  
//        Person person4 = persondirectory.newPerson("01123034");   
//        
//        StudentDirectory sd = department.getStudentDirectory();
//        StudentProfile student = sd.newStudentProfile(person3); 
//        StudentProfile student2 = sd.newStudentProfile(person4);
//        
//    //  Register student in class for the load of the spring semester     
//        CourseLoad courseload = student.newCourseLoad("Spring 2024"); 
//        CourseLoad courseload2 = student2.newCourseLoad("Spring 2024");        
//        courseload.registerStudentInClass(courseoffer); //register student in class Info 6205
//        courseload.registerStudentInClass(courseoffer2);//same student signed up for 2 classes
//        courseload2.registerStudentInClass(courseoffer2);
//        
//        int total = department.calculateRevenuesBySemester("Spring 2024");
//        System.out.print("Total:  " + total+"    ");
//        
//       for (SeatAssignment sa : courseload.getSeatAssignments()) {
//    if (sa.getSeat().getCourseOffer() == courseoffer) {
//        sa.setGrade(3.7f); // Assign grade for "algorithms"
//    }
//    if (sa.getSeat().getCourseOffer() == courseoffer2) {
//        sa.setGrade(3.5f); // Assign grade for "App Engineering"
//    }
//}
//
//// Find existing seat assignments for student2 and set the grades
//for (SeatAssignment sa : courseload2.getSeatAssignments()) {
//    if (sa.getSeat().getCourseOffer() == courseoffer2) {
//        sa.setGrade(3.9f); // Assign grade for "App Engineering"
//    }
//}
//department.printStudentReport("Spring 2024");
//System.out.println("bbb");
    Department department = new Department("Information Systems");

    // Create a PersonDirectory to hold people
    PersonDirectory personDirectory = department.getPersonDirectory();
    
    // Create the CourseCatalog and add courses (1 core, 5+ electives)
    CourseCatalog courseCatalog = department.getCourseCatalog();
    Course coreCourse = courseCatalog.newCourse("Data Science", "info 6250", 4);
    Course elective1 = courseCatalog.newCourse("Algorithms", "info 6205", 4);
    Course elective2 = courseCatalog.newCourse("App Engineering", "info 5100", 4);
    Course elective3 = courseCatalog.newCourse("Web Design", "info 5101", 3);
    Course elective4 = courseCatalog.newCourse("Database Systems", "info 6200", 3);
    Course elective5 = courseCatalog.newCourse("Cybersecurity", "info 5200", 3);

    // Add courses to the degree program (core + electives)
//    department.addCoreCourse(coreCourse);
//    department.addElectiveCourse(elective1);
//    department.addElectiveCourse(elective2);
//    department.addElectiveCourse(elective3);
//    department.addElectiveCourse(elective4);
//    department.addElectiveCourse(elective5);

    // Create a CourseSchedule for Spring 2024
    CourseSchedule courseSchedule = department.newCourseSchedule("Spring 2024");

    // Create and offer classes for each course
    CourseOffer coreOffer = courseSchedule.newCourseOffer("info 6250");
    coreOffer.generatSeats(30); // Seats for core course
    CourseOffer electiveOffer1 = courseSchedule.newCourseOffer("info 6205");
    electiveOffer1.generatSeats(30);
    CourseOffer electiveOffer2 = courseSchedule.newCourseOffer("info 5100");
    electiveOffer2.generatSeats(30);
    CourseOffer electiveOffer3 = courseSchedule.newCourseOffer("info 5101");
    electiveOffer3.generatSeats(30);
    CourseOffer electiveOffer4 = courseSchedule.newCourseOffer("info 6200");
    electiveOffer4.generatSeats(30);
    CourseOffer electiveOffer5 = courseSchedule.newCourseOffer("info 5200");
    electiveOffer5.generatSeats(30);

    // Create professors and assign them to classes
    FacultyDirectory facultyDirectory = department.getFacultyDirectory();
    for (int i = 1; i <= 6; i++) {
        Person professorPerson = personDirectory.newPerson("prof" + i);
        FacultyProfile professor = facultyDirectory.newFacultyProfile(professorPerson);
        
        switch (i) {
            case 1: coreOffer.AssignAsTeacher(professor); break;
            case 2: electiveOffer1.AssignAsTeacher(professor); break;
            case 3: electiveOffer2.AssignAsTeacher(professor); break;
            case 4: electiveOffer3.AssignAsTeacher(professor); break;
            case 5: electiveOffer4.AssignAsTeacher(professor); break;
            case 6: electiveOffer5.AssignAsTeacher(professor); break;
        }
        
    }

    
    
    // Create 10 students and register them for classes
    StudentDirectory studentDirectory = department.getStudentDirectory();
    
     Person student1 = personDirectory.newPerson("student1");
     StudentProfile studentp1 = studentDirectory.newStudentProfile(student1);

Person student2 = personDirectory.newPerson("student2");
StudentProfile studentp2 = studentDirectory.newStudentProfile(student2);

Person student3 = personDirectory.newPerson("student3");
StudentProfile studentp3 = studentDirectory.newStudentProfile(student3);

Person student4 = personDirectory.newPerson("student4");
StudentProfile studentp4 = studentDirectory.newStudentProfile(student4);

Person student5 = personDirectory.newPerson("student5");
StudentProfile studentp5 = studentDirectory.newStudentProfile(student5);

Person student6 = personDirectory.newPerson("student6");
StudentProfile studentp6 = studentDirectory.newStudentProfile(student6);

Person student7 = personDirectory.newPerson("student7");
StudentProfile studentp7 = studentDirectory.newStudentProfile(student7);

Person student8 = personDirectory.newPerson("student8");
StudentProfile studentp8 = studentDirectory.newStudentProfile(student8);

Person student9 = personDirectory.newPerson("student9");
StudentProfile studentp9 = studentDirectory.newStudentProfile(student9);

Person student10 = personDirectory.newPerson("student10");
StudentProfile studentp10 = studentDirectory.newStudentProfile(student10);
     
     
CourseLoad courseload1 = studentp1.newCourseLoad("Spring 2024");
CourseLoad courseload2 = studentp2.newCourseLoad("Spring 2024");
CourseLoad courseload3 = studentp3.newCourseLoad("Spring 2024");
CourseLoad courseload4 = studentp4.newCourseLoad("Spring 2024");
CourseLoad courseload5 = studentp5.newCourseLoad("Spring 2024");
CourseLoad courseload6 = studentp6.newCourseLoad("Spring 2024");
CourseLoad courseload7 = studentp7.newCourseLoad("Spring 2024");
CourseLoad courseload8 = studentp8.newCourseLoad("Spring 2024");
CourseLoad courseload9 = studentp9.newCourseLoad("Spring 2024");
CourseLoad courseload10 = studentp10.newCourseLoad("Spring 2024");




//    for (int i = 1; i <= 10; i++) {
//        Person studentPerson = personDirectory.newPerson("stu" + i);
//        StudentProfile student = studentDirectory.newStudentProfile(studentPerson);
//        
        // Register each student for at least 3 classes
//        CourseLoad courseLoad = student.newCourseLoad("Spring 2024");
//        courseLoad.registerStudentInClass(coreOffer);
//        courseLoad.registerStudentInClass(electiveOffer1);
//        courseLoad.registerStudentInClass(electiveOffer2);
//        courseLoad.registerStudentInClass(electiveOffer3);
//        courseLoad.registerStudentInClass(electiveOffer4);
//        courseLoad.registerStudentInClass(electiveOffer5);
//    }

 courseload1.registerStudentInClass(coreOffer); // register student in core class
    courseload2.registerStudentInClass(electiveOffer1); // student 2 in Algorithms
    courseload3.registerStudentInClass(electiveOffer2); // student 3 in App Engineering
    courseload3.registerStudentInClass(electiveOffer3); // student 4 in Web Design
    courseload4.registerStudentInClass(electiveOffer3); // student 4 in Web Design
    courseload5.registerStudentInClass(electiveOffer4); // student 5 in Database Systems
    courseload6.registerStudentInClass(electiveOffer5); // student 6 in Cybersecurity
    courseload7.registerStudentInClass(coreOffer); // student 7 in core class
    courseload8.registerStudentInClass(electiveOffer1); // student 8 in Algorithms
    courseload9.registerStudentInClass(electiveOffer2); // student 9 in App Engineering
    courseload10.registerStudentInClass(electiveOffer3); // student 10 in Web Design
    courseload1.registerStudentInClass(electiveOffer4); // student 1 in Database Systems
    courseload2.registerStudentInClass(electiveOffer5); // student 2 in Cybersecurity
    courseload3.registerStudentInClass(coreOffer); // student 3 in core class
    courseload4.registerStudentInClass(electiveOffer1); // student 4 in Algorithms
    courseload5.registerStudentInClass(electiveOffer2); // student 5 in App Engineering
    courseload6.registerStudentInClass(electiveOffer3); // student 6 in Web Design
    courseload7.registerStudentInClass(electiveOffer4); // student 7 in Database Systems
    courseload8.registerStudentInClass(electiveOffer5); // student 8 in Cybersecurity
    courseload8.registerStudentInClass(electiveOffer4);
    courseload9.registerStudentInClass(coreOffer); // student 9 in core class
    courseload10.registerStudentInClass(electiveOffer1); // student 10 in Algorithms
    // Assign grades to each student randomly
    assignGrades(department, "Spring 2024");

    // Calculate revenue and print report
    int totalRevenue = department.calculateRevenuesBySemester("Spring 2024");
    System.out.println("Total Revenue for Spring 2024: $" + totalRevenue);
    
    department.printStudentReport("Spring 2024");
}

private static void assignGrades(Department department, String semester) {
    for (StudentProfile student : department.getStudentDirectory().getStudentlist()) {
        CourseLoad courseLoad = student.getCourseLoadBySemester(semester);
        if (courseLoad == null) continue;

        // Randomly assign grades for each registered class
        for (SeatAssignment seatAssignment : courseLoad.getSeatAssignments()) {
            double randomGrade = 2.5 + (Math.random() * 1.5); // Random grade between 2.5 to 4.0
            seatAssignment.setGrade((float) randomGrade);
        }
    }

    }

}
