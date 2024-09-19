public class Rental {
    private int contractNumber;
    private double price;
    private int equipmentType;

    // Array holding equipment types
    private static final String[] EQUIPMENT_TYPES = {"Personal Watercraft", "Pontoon Boat", "Rowboat", "Canoe", "Kayak", "Beach Chair", "Umbrella", "Other"};

    public Rental(int contractNumber, double price) {
        this.contractNumber = contractNumber;
        this.price = price;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(int equipmentType) {
        if (equipmentType < 0 || equipmentType >= EQUIPMENT_TYPES.length) {
            this.equipmentType = EQUIPMENT_TYPES.length - 1; // Set to "Other"
        } else {
            this.equipmentType = equipmentType;
        }
    }

    public String getEquipmentTypeString() {
        return EQUIPMENT_TYPES[equipmentType];
    }
}
