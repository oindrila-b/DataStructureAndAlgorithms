package main.java.annotations;

import java.lang.annotation.*;

//@Retention(value = RetentionPolicy.CLASS)
//@Target(ElementType.ANNOTATION_TYPE)
//@Inherited
public @interface MyAnnotation {
    String name() default   "Jack";
    int count() default 999;
    String[] values() default {"Sola", "Leo"};
}
