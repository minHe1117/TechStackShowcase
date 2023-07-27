package Builder.Phone.demo1;

public class PhoneSimple {
    private String cpu;
    private String screen;
    private String memory;
    private String board;

    public PhoneSimple(String cpu, String screen, String memory, String board) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.board = board;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "PhoneSimple{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", board='" + board + '\'' +
                '}';
    }

    public static void main(String[] args) {
        PhoneSimple phoneSimple = new PhoneSimple("samsung","LGD","12GB","samsung");
        System.out.println(phoneSimple);
    }
}
