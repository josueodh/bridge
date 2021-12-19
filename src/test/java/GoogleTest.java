import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoogleTest {
    @Test
    void shouldBeReturnTotalGoogleAndBasicSearch(){
        Search search = new BasicSearch();
        Google google = new Google(150f);
        google.setSearch(search);
        assertEquals(150f, google.calcTotal(), 0.1f);
    }

    @Test
    void shouldBeReturnTotalGoogleAndPremiumSearch(){
        Search search = new PremiumSearch();
        Google google = new Google(150f);
        google.setSearch(search);
        assertEquals(150f, google.calcTotal(), 0.4f);
    }
}