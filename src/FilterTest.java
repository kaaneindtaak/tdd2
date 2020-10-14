import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {
    @Test
    public void allEmpty() {
        Filter filter = new Filter(null, null, null);
        assertNull(filter.getMinNrOfPersonsForQuery());
        assertNull(filter.getMaxNrOfPersonsForQuery());
        assertNull(filter.getSizeForFeedback());
    }
    @Test
    public void onlyMinFilled() {
        Filter filter = new Filter(null, 0, null);
        assertEquals(0, filter.getMinNrOfPersonsForQuery());
        assertNull(filter.getMaxNrOfPersonsForQuery());
    }
    @Test
    public void onlyMaxFilled() {
        Filter filter = new Filter(null, null, 100);
        assertNull(filter.getMinNrOfPersonsForQuery());
        assertEquals(100, filter.getMaxNrOfPersonsForQuery());
    }
    @Test
    public void onlySizeFilled_S() {
        Filter filter = new Filter("S", null, null);
        assertEquals(0, filter.getMinNrOfPersonsForQuery());
        assertEquals(200, filter.getMaxNrOfPersonsForQuery());
    }
    @Test
    public void onlySizeFilled_M() {
        Filter filter = new Filter("M", null, null);
        assertEquals(200, filter.getMinNrOfPersonsForQuery());
        assertEquals(600, filter.getMaxNrOfPersonsForQuery());
    }
    @Test
    public void onlySizeFilled_XL() {
        Filter filter = new Filter("XL", null, null);
        assertEquals(1500, filter.getMinNrOfPersonsForQuery());
        assertNull( filter.getMaxNrOfPersonsForQuery());
    }
    @Test
    public void minAndMaxFilled() {
        Filter filter = new Filter(null, 125, 500);
        assertEquals(125, filter.getMinNrOfPersonsForQuery());
        assertEquals(500, filter.getMaxNrOfPersonsForQuery());
    }
    @Test
    public void allFilled() {
        Filter filter = new Filter("S", 125, 500);
        assertEquals(125, filter.getMinNrOfPersonsForQuery());
        assertEquals(500, filter.getMaxNrOfPersonsForQuery());
    }

    @Test
    public void sizeForFeedback_onlySizeWasGiven() {
        Filter filter = new Filter("S", null, null);
        assertEquals("S", filter.getSizeForFeedback());
    }
    @Test
    public void sizeForFeedback_sizeWasGiven_andMinToo() {
        Filter filter = new Filter("S", 125, null);
        assertNull( filter.getSizeForFeedback());
    }
    @Test
    public void sizeForFeedback_sizeWasGiven_andMaxToo() {
        Filter filter = new Filter("S", null, 750);
        assertNull( filter.getSizeForFeedback());
    }
    @Test
    public void sizeForFeedback_noSizeFoundForMinAndMax() {
        Filter filter = new Filter(null, 125, 500);
        assertNull(filter.getSizeForFeedback());
    }
    @Test
    public void sizeForFeedback_sizeFoundForMinAndMax() {
        Filter filter = new Filter(null, 200, 600);
        assertEquals("M", filter.getSizeForFeedback());
    }
}