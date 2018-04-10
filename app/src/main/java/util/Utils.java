package util;

import android.support.annotation.Nullable;

/**
 * Created by rinfon on 2018/4/9.
 */

public class Utils {

    public static <T> T checkNotNull(T reference, @Nullable Object errorMessage) {
        if (reference == null) {
            throw new NullPointerException(String.valueOf(errorMessage));
        } else {
            return reference;
        }
    }
}
