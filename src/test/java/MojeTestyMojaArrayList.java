import Clollections.MojaArrayList;

import java.util.List;

public class MojeTestyMojaArrayList extends Testy {
    @Override
    List<Object> utworzObiektDoTestu() {
        return new MojaArrayList();
    }
}
