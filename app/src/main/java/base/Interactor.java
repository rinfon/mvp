package base;

/**
 * Created by rinfon on 2018/4/9.
 */

public interface Interactor {
    /**
     * This is the main method that starts an interactor. It will make sure that the interactor operation is done on a
     * background thread.
     */
    void execute();

    void cancel();
}
