/**
 * 
 */
package system;

import java.util.List;
import java.util.Set;

import system.invoice.Invoice;
import system.invoice.Invoice.INVOICE_STATE;
import system.truck.Truck;
import system.truck.Truck.TRUCK_STATE;
import system.warehouse.Warehouse;

public interface DatabaseSupport
{
    /** Iteration 1 **/
    public boolean putTruck(Truck t);

    public Truck getTruck(int truckID);

    public List<Truck> getTrucks(TRUCK_STATE state);

    public boolean putInvoice(Invoice i);

    public Invoice getInvoice(int invoiceID);

    public List<Invoice> getInvoiceByName(String customerName);

    public boolean putWareHouse(Warehouse w);

    public Warehouse getWareHouse(int warehouseID);

    public boolean putPackage(SystemPackage p);

    public SystemPackage getPackage(int packageID);

    /**
     * Gets the next ID that should be assigned to the corresponding id type.
     * 
     * @param idType
     *            <br> 'i' for invoice
     *            <br> 't' for truck
     *            <br> 'w' for warehouse
     *            <br> 'p' for package
     * @return
     *         the id that the next object should be created with
     */
    public int getNextID(char idType);

    /** Iteration 2 **/

    /**
     * Selects all invoices from invoice table and returns a set of
     * invoices matching the state filter.
     */
    public Set<Invoice> getInvoiceByState(INVOICE_STATE state);

    public Set<SystemPackage> getAllPackages();

    public Set<Warehouse> getAllWarehouse();
}
