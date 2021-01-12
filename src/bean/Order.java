package bean;

import java.sql.Date;

public class Order {
    private String id;//没有业务意义
    private float jpjg;//机票价格
    private float airportTax;//机场税
    private float ryf;//燃油费
    private float hkzhx;//航空综合险
    private float jptgx;//机票退改险
    private float yhj;//优惠券
    private float hszj;//含税总价

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJpjg() {
        return jpjg;
    }

    public void setJpjg(float jpjg) {
        this.jpjg = jpjg;
    }

    public float getAirportTax() {
        return airportTax;
    }

    public void setAirportTax(float airportTax) {
        this.airportTax = airportTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhj() {
        return yhj;
    }

    public void setYhj(float yhj) {
        this.yhj = yhj;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }


}
