package com.lewis.string;

import com.lewis.string.classes.SubString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LewisYoung
 * @created 2021/1/29
 */
public class StringUtils {

    /**
     * 枚举类型单例模式，避免多次创建，同时避免多线程情况下可能出现的问题
     */

    private StringUtils(){}

    private static enum StringUtilsEnum{

        INSTANCE;

        private StringUtils instance;

        private StringUtilsEnum(){
            instance = new StringUtils();
        }

        public StringUtils getInstance(){
            return instance;
        }

    }

    public static StringUtils getInstance(){
        return StringUtilsEnum.INSTANCE.getInstance();
    }

    /**
     * 使用滑动窗口查找当前最长不重复子串
     */
    public static SubString findLongestSubString(String origin){
        // 将origin进行复制
        SubString subString = new SubString(new String(origin.toCharArray()));
        // 滑动窗口
        String s = subString.getOrigin();
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            int len = Math.max(ans, end - start + 1);
            if(len > ans){
                subString.setStart(start);
                subString.setEnd(end);
            }
            ans = len;
            map.put(s.charAt(end), end + 1);
        }
        return subString;
    }
}
