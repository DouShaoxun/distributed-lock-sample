package cn.cruder.dousx.dls.service;

import cn.cruder.dousx.dls.dto.ModifyParam;
import cn.cruder.dousx.dls.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author dousx
 */
@Service
@AllArgsConstructor
@Slf4j
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    /**
     * 下单
     */
    public void placeOrder(ModifyParam modify) {
        // 其他业务
        inventoryRepository.modifyInventory(modify);
        log.info("GoodsId:{} Inventory:{}", modify.getGoodsId(), inventoryRepository.getInventory(modify.getGoodsId()));
        // 其他业务
    }


}
