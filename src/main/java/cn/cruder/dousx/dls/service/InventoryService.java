package cn.cruder.dousx.dls.service;

import cn.cruder.dousx.dls.dto.ModifyParam;
import cn.cruder.dousx.rdl.annotation.DistributedLock;
import org.springframework.stereotype.Service;

/**
 * @author dousx
 */
@Service
public class InventoryService {
    private static Integer COUNT = 10;

    /**
     * 修改库存
     */
    @DistributedLock(lockKey = "#modify.getOrderId()")
    //@DistributedLock(lockKey = "__aa12123")
    public void modifyInventory(ModifyParam modify) {
        COUNT += modify.getModify();
    }
}
