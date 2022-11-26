package cn.cruder.dousx.dls.repository;

import cn.cruder.dousx.dls.dto.ModifyParam;
import cn.cruder.dousx.dls.enums.GoodsEnum;
import cn.cruder.dousx.rdl.annotation.DistributedLock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dousx
 */
@Repository
@Slf4j
public class InventoryRepository {
    private static Map<GoodsEnum, Integer> INVENTORY_NUMBER_MAP = new HashMap<>();

    static {
        INVENTORY_NUMBER_MAP.put(GoodsEnum.TOMATO, 10);
        INVENTORY_NUMBER_MAP.put(GoodsEnum.POTATO, 10);
    }

    @DistributedLock(lockKey = "#modify.getGoodsId()", lockTime = 120)
    public Boolean modifyInventory(ModifyParam modify) {
        GoodsEnum goods = GoodsEnum.fromId(modify.getGoodsId());
        Integer inventory = INVENTORY_NUMBER_MAP.get(goods);
        Integer newInventory = inventory + modify.getModify();
        if (newInventory < 0) {
            log.warn("[修改库存失败]goodsId:{} inventory:{} modify:{}", goods.getGoodsId(), inventory, modify.getModify());
            return false;
        }
        log.info("[修改库存成功]goodsId:{} inventory:{} modify:{} newInventory:{}", goods.getGoodsId(), inventory, modify.getModify(), newInventory);
        INVENTORY_NUMBER_MAP.put(goods, newInventory);
        return true;
    }

    public Integer getInventory(String goodsId) {
        return INVENTORY_NUMBER_MAP.get(GoodsEnum.fromId(goodsId));
    }


}
