package src.entities;

public class Instructor {
    private int id;
    private String instructorName;
    private String mail;

    public Instructor() {
    }

    public Instructor(int id, String instructorName, String mail) {
        this.id = id;
        this.instructorName = instructorName;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
