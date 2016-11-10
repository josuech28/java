package exercises.annotations.authorannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.security.Policy;

/**
 * Created by joschinc on 11/10/16.
 */
public class Employee  {
    private String name;
    private String email;
    private  String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    @AuthorAnnotation.AnnotationExample(
            name = "Josue",
            email = "josuech28@gmail.com",
            employeeType = "temporal"
    )
    public String toString(){
        return null;
    }

}
