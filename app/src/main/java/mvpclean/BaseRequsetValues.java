package mvpclean;

import java.util.HashMap;

import util.Utils;

/**
 * Created by rinfon on 2018/4/9.
 */

public class BaseRequsetValues implements UseCase.RequestValues {

    private HashMap<String, String> parmas;

    public BaseRequsetValues(HashMap<String, String> parma) {
        parmas = Utils.checkNotNull(parma, "parmas cannot be null!");
    }

    public HashMap<String, String> getParmas() {
        return parmas;
    }
}
