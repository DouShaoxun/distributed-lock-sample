package cn.cruder.dousx.dls.dto;

public class ModifyParam {
    Integer modify;
    private String goodsId;

    public ModifyParam(Integer modify, String goodsId) {
        this.modify = modify;
        this.goodsId = goodsId;
    }

    public Integer getModify() {
        return modify;
    }

    public void setModify(Integer modify) {
        this.modify = modify;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
}
