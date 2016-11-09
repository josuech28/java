package exercises.innerclass.nestedstaticclass;

import exercises.innerclass.hospitalinterface.Doctor;
import exercises.innerclass.hospitalinterface.HealthStatus;
import exercises.innerclass.hospitalinterface.IDoctor;
import exercises.innerclass.hospitalinterface.Person;

/**
 * Created by joschinc on 11/8/16.
 */
public class Hospital {

    private String name;
    private Person patient;

    public  Hospital(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }

    public static class General implements IDoctor {

        @Override
        public void check() {
            doUltrasonid();
        }

        private void doUltrasonid() {
            System.out.println("Doing Ultrasonid");
        }
    }
}
