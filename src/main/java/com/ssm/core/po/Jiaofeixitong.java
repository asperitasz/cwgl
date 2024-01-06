package com.ssm.core.po;

/**
 * @author
 */
public class Jiaofeixitong {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String jiaofeixiangmu;

    public String getJiaofeixiangmu() {
        return jiaofeixiangmu;
    }

    public void setJiaofeixiangmu(String jiaofeixiangmu) {
        this.jiaofeixiangmu = jiaofeixiangmu;
    }

    private String beizhu;

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    private int yonghuid;

    public int getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(int yonghuid) {
        this.yonghuid = yonghuid;
    }

    private String jiaofeijine;

    public String getJiaofeijine() {
        return jiaofeijine;
    }

    public void setJiaofeijine(String jiaofeijine) {
        this.jiaofeijine = jiaofeijine;
    }

    private String zhuangtai;

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jiaofeixitong(int id, String jiaofeixiangmu, String beizhu, int yonghuid, String jiaofeijine, String zhuangtai) {
        super();
        this.id = id;
        this.jiaofeixiangmu = jiaofeixiangmu;
        this.beizhu = beizhu;
        this.yonghuid = yonghuid;
        this.jiaofeijine = jiaofeijine;
        this.zhuangtai = zhuangtai;

    }

    public Jiaofeixitong() {
        super();
        // TODO Auto-generated constructor stub
    }
}
