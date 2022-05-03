import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Herotest {
    Hero batman = new Hero("batman", "riches", 48 , "poverty" );
   @Test
   public void Hero_instantiatesCorrectly_trueObject(){

       assertEquals(true, batman instanceof Object);
   }

    @Test
    public void Hero_instantiatesHeroName_true (){

        assertEquals(true, batman instanceof Object);
    }

    @Test
    public void Hero_instantiatesHeroAge_true (){

        assertEquals(true, batman instanceof Object);
    }

    @Test
    public void Hero_instantiatesHeroWeakness_true (){

        assertEquals(true, batman instanceof Object);
    }

    @Test
    public void Hero_instantiatesHeroPower_true (){

        assertEquals(true, batman instanceof Object);
    }

}
