package com.lewis.string.classes;

/**
 * @author LewisYoung
 * @created 2021/1/29
 */
public class SubString {

    private String origin;

    private Integer start = 0;

    private Integer end = 0;

    public SubString(String origin){
        this.origin = origin;
    }
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

}
