package exercises.annotations.authorannotation;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.lang.annotation.*;

/**
 * Created by joschinc on 11/10/16.
 */

public class AuthorAnnotation {

    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AnnotationExample {
        String name();
        String email();
        String employeeType() default "permanent";

    }


    public static void main(String[] args) throws Throwable{
        Employee test = new Employee();

        AnnotationExample example = test.getClass().getMethod("toString").getAnnotation(AnnotationExample.class);
        System.out.println(example.name());
    }

    @WebMethod
    public String hola(String name) {
        return "Hola " + name + "!!!";
    }
}
