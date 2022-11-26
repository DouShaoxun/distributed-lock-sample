package cn.cruder.dousx.dls;

import cn.cruder.dousx.dls.dto.ModifyParam;
import cn.cruder.dousx.dls.enums.GoodsEnum;
import cn.cruder.dousx.dls.repository.InventoryRepository;
import cn.cruder.dousx.dls.service.InventoryService;
import cn.cruder.dousx.rdl.annotation.EnableRdl;
import cn.cruder.dousx.rdl.service.DistributedLockService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
@EnableRdl
class ApplicationTests {
    @Autowired
    DistributedLockService distributedLockService;
    @Autowired
    InventoryService inventoryService;
    @Autowired
    InventoryRepository inventoryRepository;

    @Test
    void contextLoads() {


        String goodsId = GoodsEnum.POTATO.getGoodsId();
        inventoryService.placeOrder(new ModifyParam(-5, goodsId));
        inventoryService.placeOrder(new ModifyParam(-4, goodsId));
        inventoryService.placeOrder(new ModifyParam(-2, goodsId));

    }

}
