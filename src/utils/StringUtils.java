package utils;

import java.util.List;

public class StringUtils {
    public static boolean isNullOrEmpty(Object cnt) {
        return null == cnt || "".equals(cnt);
    }

    public static String concatString(List<String> list) {
        String rst = "";
        int size = 0;
        if (isNullOrEmpty(list))
            return null;
        size = list.size();
        for (int i = 0; i < size; i++) {
            rst += list.get(i).toString();
            if (i != size - 1)
                rst += ",";
        }
        return rst;
    }
}
