package excercises.temperature;

/**
 * Created by joschinc on 10/31/16.
 */
public class Temperature {

    private int[] temperature;

    public Temperature(){

        this.temperature = new int[15];
    }
    public int[] getTemperature(){

        return this.temperature;
    }
    public int getHighestTemperature(int[] temperature){
        int highest = temperature[0];
        for(int i = 0; i < temperature.length; i++){
            if(temperature[i] > highest){
                highest = temperature[i];
            }
        }
        System.out.println("Highhest: " + highest);
        return highest;
    }

    public float getAverageTemperature(int[] temperature){
        int sumElements = 0;
        for(int i =0; i < temperature.length; i++){
            sumElements += temperature[i];
        }
        System.out.println("Avergage: " + sumElements / temperature.length);
        return sumElements / temperature.length;
    }

}
