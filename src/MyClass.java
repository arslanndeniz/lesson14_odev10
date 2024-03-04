public class MyClass {
    private String myField;

    // Alanı yazdıran metod
    public void printField() {
        System.out.println("My field: " + myField);
    }

    // Getter ve Setter metodları (opsiyonel)
    public String getMyField() {
        return myField;
    }

    public void setMyField(String myField) {
        this.myField = myField;
    }
}