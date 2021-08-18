public class Main {

    private final String programName;

    public Main(String programname) {
        this.programName = programname;
    }

    private String tester(int i) {
        return this.programName + "_" + Integer.toString(i);
    }
    public static void main(String[] args) {
        Main test = new Main("Test");
        System.out.println(test.tester(4));
    }
}
