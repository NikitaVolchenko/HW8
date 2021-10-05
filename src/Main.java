public class Main {

    public static void main(String[] args) {

        class Inner1 implements Writable {

            @Override
            public void write() {
                System.out.println("Hello world!");
            }
        }

        class Inner2 implements Writable {

            @Override
            public void write() {
                System.out.println("Привет мир!");
            }
        }

        class Inner3 implements Writable {

            @Override
            public void write() {
                System.out.println("こんにちは。");
            }
        }

        Writer<Inner1> writer1 = new Writer<>();
        writer1.write(new Inner1());

        Writer<Inner2> writer2 = new Writer<>();
        writer2.write(new Inner2());

        Writer<Inner3> writer3 = new Writer<>();
        writer3.write(new Inner3());

    }

}
