import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.QUEEN, card.getRank());
    }


    @Test
    public void queenHasValue10(){
        assertEquals(10, card.getValueFromCard());
    }

//    @Test
//    public void suitCanBeMispelled(){
//        card = new Card("Heats");
//        assertEquals("Heats", card.getSuit());
//    }
}
