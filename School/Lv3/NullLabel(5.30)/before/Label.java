package nullLabal.before;

public class Label {
    private String lavel;

    public Label(String lavel) {
        this.lavel = lavel;
    }

    public void display() {
        System.out.println("display : " + lavel);
    }

    @Override
    public String toString() {
        return "\"" + lavel + "\"";
    }
}
