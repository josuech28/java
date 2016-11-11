package exercises.enums.planetarysystem;

/**
 * Created by joschinc on 11/11/16.
 */
public class NewSolarsSystemTest {
    private PlanetarySystem planets;

    public void getPlanets(){
        for(PlanetarySystem planet: PlanetarySystem.values()){
            System.out.println(planet.name() +" Density "+ planet.getDensity());
        }
    }
}
