/**
 * Created by hoang on 7/18/2016.
 */
import java.util.concurrent.atomic.AtomicInteger;

public class pet {

    private static final AtomicInteger COUNTER = new AtomicInteger();

    private final int id;

    private String name;

    private String photoURLS;

    public pet(String name, String photo) {
        this.id = COUNTER.getAndIncrement();
        this.name = name;
        this.photoURLS = photo;
    }

    public pet() {
        this.id = COUNTER.getAndIncrement();
    }

    public String getName() {
        return name;
    }

    public String getPhotoURLS() {
        return photoURLS;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhotoURLS(String origin) {
        this.photoURLS = origin;
    }
}