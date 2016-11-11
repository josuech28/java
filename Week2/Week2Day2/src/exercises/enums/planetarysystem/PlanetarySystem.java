package exercises.enums.planetarysystem;

/**
 * Created by joschinc on 11/11/16.
 */
public enum PlanetarySystem {

    MERCURY(0.0553F,0.0562F),
    Jupiter(317.83F,1.321F),
    SATURN(95.162F,764),
    URANUS(14.536F,63.1F),
    NEPTUNE(17.147F,57.7F),
    EARTH(1,1),
    VENUS(0.815F,0.857F),
    MARS(0.107F,0.151F);

    private float mass;
    private float volume;

    private PlanetarySystem(float mass, float volume){
        this.mass = mass;
        this.volume = volume;
    }

    public float getMass(){
        return this.mass;
    }

    public float getVolume(){
        return this.volume;
    }

    public float getDensity() throws ArithmeticException{
        return (mass / volume);
    }
    //Test than can override toString (NOT EQUALS AND HASCODE OVERRRIDER
    @Override
    public String toString() {
        return "HELLO WORLD";
    }

}
