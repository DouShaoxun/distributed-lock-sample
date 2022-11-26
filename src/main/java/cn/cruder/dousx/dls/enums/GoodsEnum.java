package cn.cruder.dousx.dls.enums;

/**
 * @author dousx
 */
@SuppressWarnings("all")
public enum GoodsEnum {
    TOMATO("01", "番茄"),

    POTATO("02", "土豆");;
    private String goodsId;
    private String goodsName;

    GoodsEnum(String goodsId, String goodsName) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }


    public final static GoodsEnum fromId(String goodsId) {
        for (GoodsEnum at : GoodsEnum.values()) {
            if (at.getGoodsId().equals(goodsId)) {
                return at;
            }
        }
        throw new IllegalArgumentException(goodsId);
    }
}
