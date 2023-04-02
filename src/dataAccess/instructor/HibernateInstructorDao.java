package src.dataAccess.instructor;

import src.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen eklendi! ->" + instructor.getInstructorName());
    }

}
