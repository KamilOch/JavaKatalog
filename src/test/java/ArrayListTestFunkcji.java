
import Clollections.MojaArrayList;
import Clollections.Obiekt;
import org.junit.Assert;
import org.junit.Test;

public class ArrayListTestFunkcji {


    @Test
    public void shouldHaveZeroElementInMyList(){
        //Given
        MojaArrayList mojaArrayListObiekty = new MojaArrayList();
        //When
        //Then
        Assert.assertEquals(0,mojaArrayListObiekty.size());
        Assert.assertTrue(mojaArrayListObiekty.isEmpty());
    }

    @Test
    public void shouldAddElementToMyList(){
        //Given
        MojaArrayList mojaArrayListObiekty = new MojaArrayList();
        Obiekt o1 = new Obiekt("obiekt1");
        //When
        mojaArrayListObiekty.add(o1);
        //Then
        Assert.assertEquals(1,mojaArrayListObiekty.size());
        Assert.assertFalse(mojaArrayListObiekty.isEmpty());
    }
    @Test
    public void shouldAddTwoElementToMyList(){
        //Given
        MojaArrayList mojaArrayListObiekty = new MojaArrayList();
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        //When
        mojaArrayListObiekty.add(o1);
        mojaArrayListObiekty.add(o2);
        //Then
        Assert.assertEquals(2,mojaArrayListObiekty.size());
        Assert.assertFalse(mojaArrayListObiekty.isEmpty());
    }

    @Test
    public void shouldRemoveElementFromMyList(){
        //Given
        MojaArrayList mojaArrayListObiekty = new MojaArrayList();
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        mojaArrayListObiekty.add(o1);
        mojaArrayListObiekty.add(o2);
        //When
        mojaArrayListObiekty.remove(o1);
        //Then
        Assert.assertEquals(1,mojaArrayListObiekty.size());
        Assert.assertFalse(mojaArrayListObiekty.isEmpty());
    }
    @Test
    public void shouldRemoveElementFromMyList2(){
        //Given
        MojaArrayList mojaArrayListObiekty = new MojaArrayList();
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        mojaArrayListObiekty.add(o1);
        mojaArrayListObiekty.add(o2);
        //When
        mojaArrayListObiekty.remove(o2);
        //Then
        Assert.assertEquals(1,mojaArrayListObiekty.size());
        Assert.assertFalse(mojaArrayListObiekty.isEmpty());
    }
    @Test
    public void shouldRemoveTwoElementFromMyList2(){
        //Given
        MojaArrayList mojaArrayListObiekty = new MojaArrayList();
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        mojaArrayListObiekty.add(o1);
        mojaArrayListObiekty.add(o2);
        //When
        mojaArrayListObiekty.remove(o1);
        mojaArrayListObiekty.remove(o2);
        //Then
        Assert.assertEquals(0,mojaArrayListObiekty.size());
        Assert.assertTrue(mojaArrayListObiekty.isEmpty());
    }
}
