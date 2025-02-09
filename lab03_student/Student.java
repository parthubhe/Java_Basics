class Student {
    private String name;
    private long prn;

    // Constructor with parameters to initialize name and prn
    public Student(String name, long prn) {
        this.name = name;
        this.prn = prn;
    }

    // Getter and setter methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPRN(long prn) {
        this.prn = prn;
    }

    public long getPRN() {
        return prn;
    }

    public void display() {
        System.out.println("Name: " + getName() + " PRN: " + getPRN());
    }
}
