package exercises.innerclass.hospitalinterface;

/**
 * Created by joschinc on 11/8/16.
 */
public class GeneralPhysician extends Doctor {


    private Person patient;

    public GeneralPhysician(Person p){
        this.patient = p;
    }

    @Override
    public void check() {
        if(patient.getHealthStatus() == HealthStatus.BAD){
            ultrasonid(patient);
        } else {
            System.out.println("Person is okay");
        }
    }

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }
}
