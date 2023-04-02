package src;

import src.business.category.CategoryManager;
import src.business.course.CourseManager;
import src.business.instructor.InstructorManager;
import src.core.logging.DatabaseLogger;
import src.core.logging.ILogger;
import src.core.logging.MailLogger;
import src.dataAccess.category.JdbcCategoryDao;
import src.dataAccess.course.JbdcCourseDao;
import src.dataAccess.instructor.HibernateInstructorDao;
import src.entities.Category;
import src.entities.Course;
import src.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        ILogger[] loggers = { new DatabaseLogger(), new MailLogger() };
        Instructor instructor1 = new Instructor(1, "Eğitmen1", "egitmen1@mail.com");
        Category category1 = new Category(1, "category1");
        Category category2 = new Category(2, "category2");
        Category category3 = new Category(3, "category2"); // aynı kategory adı
        Course course1 = new Course(1, "course1", 100);
        Course course2 = new Course(2, "course2", -200);// 0 dan küçük fiyat
        Course course3 = new Course(3, "course1", 200); // aynı kurs adı

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.addInstructor(instructor1);

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.addCategory(category1);
        categoryManager.addCategory(category2);
        // categoryManager.addCategory(category3); //Expection

        CourseManager courseManager = new CourseManager(new JbdcCourseDao(), loggers);

        courseManager.addCourse(course1);
        // courseManager.addCourse(course2); //Expection
        courseManager.addCourse(course3); //Expection
    }

}