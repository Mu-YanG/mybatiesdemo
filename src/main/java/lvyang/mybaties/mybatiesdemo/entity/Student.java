package lvyang.mybaties.mybatiesdemo.entity;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;

    private String kecheng;

    private Integer fenshu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getKecheng() {
        return kecheng;
    }

    public void setKecheng(String kecheng) {
        this.kecheng = kecheng == null ? null : kecheng.trim();
    }

    public Integer getFenshu() {
        return fenshu;
    }

    public void setFenshu(Integer fenshu) {
        this.fenshu = fenshu;
    }
}
