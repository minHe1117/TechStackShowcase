package Builder.Phone.demo2;

public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String board;

    private Phone(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.board = builder.board;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", board='" + board + '\'' +
                '}';
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String board;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
         public Builder screen(String screen){
             this.screen = screen;
             return this;
         }
         public Builder memory(String memory){
             this.memory = memory;
             return this;
         }
         public Builder board(String board){
             this.board = board;
             return this;
         }
         public Phone build(){
            return new Phone(this);
         }


     }
}
