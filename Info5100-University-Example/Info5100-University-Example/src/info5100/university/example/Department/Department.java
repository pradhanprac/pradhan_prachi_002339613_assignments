/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Department {

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    EmployerDirectory employerdirectory;
    Degree degree;

    HashMap<String, CourseSchedule> mastercoursecatalog;

    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();
        facultydirectory = new FacultyDirectory(this);
        degree = new Degree("MSIS");

    }

    public void addCoreCourse(Course c) {
        degree.addCoreCourse(c);

    }

    public void addElectiveCourse(Course c) {
        degree.addElectiveCourse(c);

    }
    public FacultyDirectory getFacultyDirectory() {

        return facultydirectory;

    }
    public PersonDirectory getPersonDirectory() {

        return persondirectory;

    }

    public StudentDirectory getStudentDirectory() {
        return studentdirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }

    public Course newCourse(String n, String nm, int cr) {

        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

  

    public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = mastercoursecatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);

    }
    
public void printStudentReport(String semester) {
    for (StudentProfile student : studentdirectory.getStudentlist()) {
        CourseLoad courseLoad = student.getCourseLoadBySemester(semester);
        if (courseLoad == null) continue;

        System.out.println("Student ID: " + student.getPerson().getPersonId());
        System.out.println("Courses Registered:");

        double totalTuition = 0;
        for (SeatAssignment sa : courseLoad.getSeatAssignments()) {
            CourseOffer courseOffer = sa.getSeat().getCourseOffer();
            String courseName = courseOffer.getCourse().getName();
            FacultyProfile professor = courseOffer.getFacultyProfile();
            String professorName = (professor != null) ? professor.getPerson().getPersonId() : "No Professor Assigned";
            double grade = sa.getGrade();
            double courseFee = courseOffer.getCourse().getCredits() * 1000; // Assuming $1000 per credit

            System.out.println("  Course: " + courseName + 
                               ", Professor: "+ professorName+
                               ", Grade: " + String.format("%.2f", grade) + 
                               ", Course Fee: $" + courseFee);
            totalTuition += courseFee;
        }
        
        double gpa = student.calculateGPA(semester);
        System.out.println("Total Tuition: $" + totalTuition);
        System.out.println("Average GPA: " + gpa);
        System.out.println("------------------------------");
    }
}
}
