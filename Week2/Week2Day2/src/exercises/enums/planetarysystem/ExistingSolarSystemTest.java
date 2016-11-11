package exercises.enums.planetarysystem;

import java.util.EnumSet;

/**
 * Created by joschinc on 11/11/16.
 */
public class ExistingSolarSystemTest {
    private EnumSet<PlanetarySystem> planets = EnumSet.range(PlanetarySystem.MERCURY, PlanetarySystem.MARS);

    public void getPlanets(){
        for(PlanetarySystem planet: planets){
            System.out.println(planet.name() +" Density "+ planet.getDensity());

        }
    }
}
