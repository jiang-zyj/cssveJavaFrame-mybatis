package com.zyj.bean;

/**
 * @ClassName Menu
 * @Auther: YaJun
 * @Date: 2021 - 05 - 26 - 11:04
 * @Description: com.zyj.bean
 * @version: 1.0
 */
public class Menu {

    private Integer mid;
    private String mName;
    private String mDesc;

    @Override
    public String toString() {
        return "Menu{" +
                "mid=" + mid +
                ", mName='" + mName + '\'' +
                ", mDesc='" + mDesc + '\'' +
                '}';
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }
}
