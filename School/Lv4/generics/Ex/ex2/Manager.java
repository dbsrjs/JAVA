package generics.Ex.ex2;

public class Manager <U extends User, P extends Product> {

    public U user;
    public P product;

    public Manager(U user, P product) {
        this.user = user;
        this.product = product;
    }

    private U getUser() {
        return user;
    }

    private P getProduct() {
        return product;
    }

    public void displayInfo() {
        System.out.println("User: " + user.getName());
        System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
    }
}
