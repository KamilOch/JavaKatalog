import Clollections.MojaArrayList;
import Clollections.Obiekt;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public abstract class Testy{

    private List jakasKolekcja = utworzObiektDoTestu();

    abstract List<Object> utworzObiektDoTestu();

    @Test
    public void shouldHaveZeroElementInMyList(){
        //Given
        //When
        //Then
        Assert.assertEquals(0,jakasKolekcja.size());
        Assert.assertTrue(jakasKolekcja.isEmpty());
    }
    @Test
    public void shouldAddElementToMyList(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        //When
        jakasKolekcja.add(o1);
        //Then
        Assert.assertEquals(1,jakasKolekcja.size());
        Assert.assertFalse(jakasKolekcja.isEmpty());
    }
    @Test
    public void shouldAddTwoElementToMyList(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        //When
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //Then
        Assert.assertEquals(2,jakasKolekcja.size());
        Assert.assertFalse(jakasKolekcja.isEmpty());
    }
    @Test
    public void shouldRemoveElementFromMyListByObject(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //When
        jakasKolekcja.remove(o1);
        //Then
        Assert.assertEquals(1,jakasKolekcja.size());
        Assert.assertFalse(jakasKolekcja.isEmpty());
        //uzycie get
        Assert.assertEquals(jakasKolekcja.get(0),o2);
    }
    @Test
    public void shouldRemoveElementFromMyListByObject2(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //When
        jakasKolekcja.remove(o2);
        //Then
        Assert.assertEquals(1,jakasKolekcja.size());
        Assert.assertFalse(jakasKolekcja.isEmpty());
        //uzycie get
        //Assert.assertNull(jakasKolekcja.get(1));
        Assert.assertEquals(jakasKolekcja.get(0),o1);
    }
    @Test
    public void shouldRemoveElementFromMyListByObject3(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        Obiekt o3 = new Obiekt("obiekt3");
        Obiekt o4 = new Obiekt("obiekt4");
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //When
        jakasKolekcja.remove(o2);
        jakasKolekcja.add(o3);
        jakasKolekcja.add(o4);
        //Then
        Assert.assertEquals(3,jakasKolekcja.size());
        Assert.assertFalse(jakasKolekcja.isEmpty());
        //uzycie get
        Assert.assertEquals(jakasKolekcja.get(0),o1);
        Assert.assertEquals(jakasKolekcja.get(1),o3);
        Assert.assertEquals(jakasKolekcja.get(2),o4);
    }
    @Test
    public void shouldRemoveTwoElementFromMyListByObject(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //When
        jakasKolekcja.remove(o1);
        jakasKolekcja.remove(o2);
        //Then
        Assert.assertEquals(0,jakasKolekcja.size());
        Assert.assertTrue(jakasKolekcja.isEmpty());
    }
    @Test
    public void shouldContainsElementInMyList1(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        //When
        jakasKolekcja.add(o1);
        //Then
        Assert.assertTrue(jakasKolekcja.contains(o1));
    }
    @Test
    public void shouldContainsElementInMyList2(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        //When
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //Then
        Assert.assertTrue(jakasKolekcja.contains(o1));
    }
    @Test
    public void shouldContainsElementInMyList3(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        //When
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //Then
        Assert.assertTrue(jakasKolekcja.contains(o2));
    }
    @Test
    public void shouldNotContainsElementInMyList(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        //When
        jakasKolekcja.add(o1);

        //Then
        Assert.assertFalse(jakasKolekcja.contains(o2));
    }
    @Test
    public void shouldClearMyList(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o1);
        //When
        jakasKolekcja.clear();
        //Then
        Assert.assertEquals(0,jakasKolekcja.size());
        Assert.assertTrue(jakasKolekcja.isEmpty());
    }
    @Test
    public void shouldGiveObjectFromMyList(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        Obiekt o3 = new Obiekt("obiekt3");
        Obiekt o4 = new Obiekt("obiekt4");
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        jakasKolekcja.add(o3);
        jakasKolekcja.add(o4);
        //When
        Obiekt x= (Obiekt) jakasKolekcja.get(1);
        //Then
        //4 rozne sposoby sprawdzenia
        Assert.assertTrue(x.equals(o2));
        Assert.assertEquals(o2,x);
        Assert.assertSame(x,o2);
        Assert.assertTrue(x ==o2);
    }
    @Test
    public void shouldRemoveElementFromMyListByIndex(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //When
        jakasKolekcja.remove(0);
        //Then
        Assert.assertEquals(1,jakasKolekcja.size());
        Assert.assertFalse(jakasKolekcja.isEmpty());
        //uzycie get
        Assert.assertEquals(jakasKolekcja.get(0),o2);
    }
    @Test
    public void shouldRemoveElementFromMyListByIndex2(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //When
        jakasKolekcja.remove(1);
        //Then
        Assert.assertEquals(1,jakasKolekcja.size());
        Assert.assertFalse(jakasKolekcja.isEmpty());
        //uzycie get
        //Assert.assertNull(jakasKolekcja.get(1));
        Assert.assertEquals(jakasKolekcja.get(0),o1);
    }
    @Test
    public void shouldRemoveElementFromMyListByIndex3(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        Obiekt o3 = new Obiekt("obiekt3");
        Obiekt o4 = new Obiekt("obiekt4");
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //When
        jakasKolekcja.remove(1);
        jakasKolekcja.add(o3);
        jakasKolekcja.add(o4);
        //Then
        Assert.assertEquals(3,jakasKolekcja.size());
        Assert.assertFalse(jakasKolekcja.isEmpty());
        //uzycie get
        Assert.assertEquals(jakasKolekcja.get(0),o1);
        Assert.assertEquals(jakasKolekcja.get(1),o3);
        Assert.assertEquals(jakasKolekcja.get(2),o4);
    }
    @Test
    public void shouldRemoveTwoElementFromMyListByIndex(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        jakasKolekcja.add(o1);
        jakasKolekcja.add(o2);
        //When
        jakasKolekcja.remove(1);
        jakasKolekcja.remove(0);
        //Then
        Assert.assertEquals(0,jakasKolekcja.size());
        Assert.assertTrue(jakasKolekcja.isEmpty());
    }

    @Test
    public void shouldAdd2ElementToMyListIfOnThisIndexEqualsNull(){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        //When
        jakasKolekcja.add(o1);
        jakasKolekcja.add(0,o2);
        //Then
        Assert.assertEquals(jakasKolekcja.get(0),o2);
        Assert.assertEquals(jakasKolekcja.get(1),o1);
    }
    @Test
    public void shouldReturnIndexOfObjectFromMyList (){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        jakasKolekcja.add(o1);
        //When
        jakasKolekcja.indexOf(o1);
        //Then
        Assert.assertEquals(0,jakasKolekcja.indexOf(o1));
    }
    @Test
    public void shouldReturnNumberMinusOneIfNoObjectInMyList (){
        //Given
        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        jakasKolekcja.add(o1);
        //When
        jakasKolekcja.indexOf(o1);
        //Then
        Assert.assertEquals(-1,jakasKolekcja.indexOf(o2));
    }

}


