package stats;

/**
 * Event for when a customer enters a station.
 */
public class CustomerEnterStationEvent implements StatEntry {

    /**
     * The station that the customer entered.
     */
    private final String station;

    /**
     * Create a new CustomerEnterStationEvent.
     */
    public CustomerEnterStationEvent(String station) {
        this.station = station;
    }

    /**
     * Return the station that the customer entered.
     */
    public String getStation() {
        return station;
    }

}
