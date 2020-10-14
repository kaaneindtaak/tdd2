
import java.util.HashMap;

public class Filter {
    private FilterData data;
    static final FilterData[] predefinedFilters = new FilterData[]{
            new FilterData("S", 0, 200),
            new FilterData("M", 200, 600),
            new FilterData("L", 600, 1500),
            new FilterData("XL", 1500, null),
    };

    static private class FilterData {
        public String size;
        public Integer minNrOfPersons;
        public Integer maxNrOfPersons;

        public FilterData(String size, Integer minNrOfPersons, Integer maxNrOfPersons) {
            this.size = size;
            this.minNrOfPersons = minNrOfPersons;
            this.maxNrOfPersons = maxNrOfPersons;
        }
    }

    public Filter(String size, Integer minNrOfPersons, Integer maxNrOfPersons) {
        this.data = new FilterData(size, minNrOfPersons, maxNrOfPersons);
    }

    public String getSize() {
        return data.size;
    }

    public void setSize(String size) {
        this.data.size = size;
    }

    public Integer getMinNrOfPersons() {
        return data.minNrOfPersons;
    }

    public void setMinNrOfPersons(Integer minNrOfPersons) {
        this.data.minNrOfPersons = minNrOfPersons;
    }

    public Integer getMaxNrOfPersons() {
        return data.maxNrOfPersons;
    }

    public void setMaxNrOfPersons(Integer maxNrOfPersons) {
        this.data.maxNrOfPersons = maxNrOfPersons;
    }

    public Integer getMinNrOfPersonsForQuery() {
        if (data.minNrOfPersons != null) return data.minNrOfPersons;
        for (FilterData f : predefinedFilters) {
            if (f.size.equals(data.size)) return f.minNrOfPersons;
        }
        return null;
    }

    public Integer getMaxNrOfPersonsForQuery() {
        if (data.maxNrOfPersons != null) return data.maxNrOfPersons;
        for (FilterData f : predefinedFilters) {
            if (f.size.equals(data.size)) return f.maxNrOfPersons;
        }
        return null;
    }

    public String getSizeForFeedback() {
        if (data.minNrOfPersons == null && data.maxNrOfPersons == null) return data.size;
        for (FilterData f : predefinedFilters) {
            if (f.minNrOfPersons.equals(data.minNrOfPersons) && f.maxNrOfPersons.equals(data.maxNrOfPersons)) return f.size;
        }
        return null;
    }
}
