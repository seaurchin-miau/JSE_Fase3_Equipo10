package Postwork.FinalProject.exception;

public class NotFoundException extends RuntimeException{

    private String name;

    public NotFoundException(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
