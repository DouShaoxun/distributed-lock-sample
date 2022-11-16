package cn.cruder.dousx.dls.dto;

public class ModifyParam {
    Integer modify;
    private String orderId;

    public ModifyParam(Integer modify, String orderId) {
        this.modify = modify;
        this.orderId = orderId;
    }

    public Integer getModify() {
        return modify;
    }

    public void setModify(Integer modify) {
        this.modify = modify;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
