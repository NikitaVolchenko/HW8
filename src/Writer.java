public class Writer<T extends Writable> {

    public void write(T object) {
        object.write();
    }

}
