import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmazonTest {
    @Test
    void shouldBeReturnTotalAmazonAndBasicSearch(){
        Search search = new BasicSearch();
        Amazon amazon = new Amazon(150f);
        amazon.setSearch(search);
        assertEquals(150f, amazon.calcTotal(), 0.1f);
    }

    @Test
    void shouldBeReturnTotalAmazonAndPremiumSearch(){
        Search search = new PremiumSearch();
        Amazon amazon = new Amazon(150f);
        amazon.setSearch(search);
        assertEquals(150f, amazon.calcTotal(), 0.4f);
    }
}