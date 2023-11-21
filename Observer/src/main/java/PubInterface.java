import java.util.ArrayList;

public interface PubInterface {
    ArrayList <PublisherActionListener> getListoner();

    void addListener ( PublisherActionListener listener);

    public void removeListener (PublisherActionListener listener);

    public void removeAllListener ();

    public void notifySubscribers (String message);
}
