package Model;

public class Sale {

    Integer id;
    Integer item;
        Integer idSale;
        Integer idClient;
        Integer idEmployee;
        Integer idProduct;
        String serialNumber;
        String description;
        String date;
        Double price;
        Integer quantity; //кількість
        Double subtotal; //проміжний підсумок
        Double amount; // сума
        String state;

    public Sale() {
    }

    public Sale(Integer id, Integer item, Integer idSale, Integer idClient, Integer idEmployee, Integer idProduct, String serialNumber, String description, String date, Double price, Integer quantity, Double subtotal, Double amount, String state) {
        this.id = id;
        this.item = item;
        this.idSale = idSale;
        this.idClient = idClient;
        this.idEmployee = idEmployee;
        this.idProduct = idProduct;
        this.serialNumber = serialNumber;
        this.description = description;
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.amount = amount;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdSale() {
        return idSale;
    }

    public void setIdSale(Integer idSale) {
        this.idSale = idSale;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
