package main.java.annotations;

@MyAnnotation
public class BasicAnnotation {

    @MyAnnotation
    private String NAME = "My Name";

    @MyAnnotation
    public BasicAnnotation(String string) {
        this.NAME = string;
    }

    @MyAnnotation
    public void myAnnotationMethod(@MyAnnotation String name) {
        @MyAnnotation String localVar = "Some Text";
    }

    public static void main(@MyAnnotation String[] args) {

    }

}
