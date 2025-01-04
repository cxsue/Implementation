public class Manager {
    public static void main(String[] args) {
        // Initialize the Log
        Log log = Log.getInstance();

        // Create some sample parcels
        ParcelMap parcelMap = new ParcelMap();
        parcelMap.addParcel(new Parcel("123", 10, 5, 5, 2.0, 3));
        parcelMap.addParcel(new Parcel("456", 15, 10, 7, 5.0, 2));

        // Create some sample customers
        QueueOfCustomers queue = new QueueOfCustomers();
        queue.addCustomer(new Customer(1, "John Doe", "123"));
        queue.addCustomer(new Customer(2, "Jane Smith", "456"));

        // Process customers with a worker
        Worker worker = new Worker();
        while (!queue.isEmpty()) {
            Customer customer = queue.removeCustomer();
            worker.processCustomer(customer, parcelMap);
        }

        // Print the log of events
        log.printLog();
    }
}
