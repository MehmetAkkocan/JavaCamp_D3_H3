package src.business.instructor;

import src.core.logging.ILogger;
import src.dataAccess.instructor.IInstructorDao;
import src.entities.Instructor;

public class InstructorManager implements IInstructorManager {
    private IInstructorDao instructorDao;
    private ILogger[] loggers;

    public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    @Override
    public void addInstructor(Instructor instructor) throws Exception {
        instructorDao.addInstructor(instructor);
        for (ILogger logger : loggers) {
            logger.log(instructor.getInstructorName());
        }
    }

}
