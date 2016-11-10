package exercises.enums.citizens;

/**
 * Created by joschinc on 11/10/16.
 */
public class IndiaCitizen {

    private int age;
    private String name;
    private Citizens citizens;

    public IndiaCitizen(int age, String name) {
        this.age = age;
        this.name = name;
        setCitizens();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCitizens(){
        if(this.age > 0 && this.age <= 18){
            this.citizens = citizens.CHILD;
        } else {
            if(this.age > 18 && this.age <= 60){
                this.citizens = citizens.ADULT;
            } else {
                if(this.age > 60){
                    this.citizens = citizens.SENIOR;
                }
            }
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.citizens;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + name.hashCode();
        return result;
    }
}
