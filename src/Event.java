public class Event {
    private int eventNumber;
    private int numberOfGuests;
    private double pricePerGuest;
    private double totalPrice;
    private String phoneNumber;
    private int eventType;

    // Array holding event types
    private static final String[] EVENT_TYPES = {"Wedding", "Baptism", "Birthday", "Corporate", "Other"};

    public Event(int eventNumber, int numberOfGuests, double pricePerGuest, String phoneNumber) {
        this.eventNumber = eventNumber;
        this.numberOfGuests = numberOfGuests;
        this.pricePerGuest = pricePerGuest;
        this.phoneNumber = phoneNumber;
        this.totalPrice = numberOfGuests * pricePerGuest;
    }

    public int getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(int eventNumber) {
        this.eventNumber = eventNumber;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
        calculateTotalPrice();
    }

    public double getPricePerGuest() {
        return pricePerGuest;
    }

    public void setPricePerGuest(double pricePerGuest) {
        this.pricePerGuest = pricePerGuest;
        calculateTotalPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        if (eventType < 0 || eventType >= EVENT_TYPES.length) {
            this.eventType = EVENT_TYPES.length - 1; // Set to "Other"
        } else {
            this.eventType = eventType;
        }
    }

    public String getEventTypeString() {
        return EVENT_TYPES[eventType];
    }

    private void calculateTotalPrice() {
        this.totalPrice = numberOfGuests * pricePerGuest;
    }
}
