import exercises.cloning.Fruit;
import exercises.cloning.FruitBasket;
import exercises.innerclass.anonymous.Car;
import exercises.innerclass.hospitalinnerclass.Hospital;
import exercises.innerclass.hospitalinterface.GeneralPhysician;
import exercises.innerclass.hospitalinterface.HealthStatus;
import exercises.innerclass.hospitalinterface.IDoctor;
import exercises.innerclass.hospitalinterface.Person;
import exercises.io.file.FilesDirectory;
import exercises.io.file.buffer.KeyWordSearchTest;
import exercises.io.file.charcount.CharCount;
import exercises.io.file.io.file.output.CurrentTime;
import exercises.io.file.io.file.output.CurrentTimeTest;
import exercises.serealization.itemorder.Item;
import exercises.serealization.itemorder.Order;
import exercises.serealization.itemorder.Serialization;

import javax.sound.sampled.AudioInputStream;
import java.io.*;

/**
 * Created by joschinc on 11/8/16.
 */
public class Week2Day1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
            Cloning Objects

        try{
            Fruit f1 = new Fruit("Banana", "Yellow");
            Fruit f2 = f1.clone();
            FruitBasket fb = new FruitBasket();
            fb.addFruit(f1);
            fb.addFruit(f2);
            System.out.println(fb.toString());
            FruitBasket cloningFb = fb.clone();
            System.out.println(fb.getFruits() == cloningFb.getFruits());
            cloningFb.addFruit(new Fruit("Appler","Red"));
            System.out.println(cloningFb.toString());
        } catch (CloneNotSupportedException ex){
            System.out.println(ex);
        }
         */
        /*
            Hospital using interface

            Person person = new Person(1,"Josue", HealthStatus.BAD);
            IDoctor doctor = new GeneralPhysician(person);
            doctor.check();
         */
        /*
            Hospital Using Inner Class

             Hospital hospital = new Hospital("Hospital Mexico City");
            Person patient = new Person(1,"Josue", HealthStatus.BAD);
            hospital.setPatient(patient);

            IDoctor doctor = hospital.new General();
            doctor.check();
         */
        /*
            Anonymous Car

            Car Hybrid = new Car() {
            private int batteryPower = 300;
                @Override
                public int getBatteryPower() {
                    System.out.println("batteryPower: "+batteryPower);
                    return batteryPower;
                }
            @Override
            public void start() {
                System.out.println("start");
                this.batteryPower -= 100;
            }
        };
        Hybrid.start();
        Hybrid.getBatteryPower();
         */
        /*
            Nestle Static Class

             Person person = new Person(1,"Josue", HealthStatus.BAD);
             IDoctor healthChecker = new exercises.innerclass.nestedstaticclass.Hospital.General();
             healthChecker.check();
         */
        /*
            Serializable

        Order order = new Order(1,"Order from CR");
        System.out.println("Description from Order:" + order.getDescription() + " ID " +order.getId() + " HashCode " + order.hashCode() + " " +Order.getSerialVersionUID());
        Serialization serialization = new Serialization();
        serialization.serialize(order);
        Order objectDeserealizable = (Order) serialization.deserealizable();
        System.out.println("Description from Order:" + objectDeserealizable.getDescription() + " ID " +objectDeserealizable.getId() + " HashCode " + objectDeserealizable.hashCode() + " " + Order.getSerialVersionUID());

         */
        /*
            FILES FROM DIRECTORY

        FilesDirectory fd = new FilesDirectory();
        fd.fillDirectory();
        fd.printResult();
        */
        /*

        CharCount

        CharCount count = new CharCount();
        System.out.println(count.getCountChar());


         */
        /*
            Write File

                    CurrentTimeTest ctt = new CurrentTimeTest();
                    ctt.writeFile();
         */
        KeyWordSearchTest findKey = new KeyWordSearchTest();
        findKey.findKey("2016");



        }

}
