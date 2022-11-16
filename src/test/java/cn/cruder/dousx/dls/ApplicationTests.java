package cn.cruder.dousx.dls;

import cn.cruder.dousx.dls.dto.ModifyParam;
import cn.cruder.dousx.dls.service.InventoryService;
import cn.cruder.dousx.rdl.annotation.EnableRdl;
import cn.cruder.dousx.rdl.service.DistributedLockService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.annotation.AccessType;

import java.util.UUID;

@SpringBootTest
@Slf4j
@EnableRdl
class ApplicationTests {
    @Autowired
    DistributedLockService distributedLockService;
    @Autowired
    InventoryService inventoryService;
    @Test
    void contextLoads() {
        //log.info(String.valueOf(distributedLockService));
        //String key = "kkkk";
        //String value = UUID.randomUUID().toString();
        //boolean lock = distributedLockService.lock(key, value, 120);
        //log.info("{}", lock);
        //lock = distributedLockService.lock(key, value, 120);
        //log.info("{}", lock);
        //boolean unlock = distributedLockService.unlock(key, value + "1");
        //log.info("{}", unlock);
        //unlock = distributedLockService.unlock(key, value);
        //log.info("{}", unlock);


        inventoryService.modifyInventory(new ModifyParam(10, UUID.randomUUID().toString()));
        inventoryService.modifyInventory(new ModifyParam(11, UUID.randomUUID().toString()));
        inventoryService.modifyInventory(new ModifyParam(12, UUID.randomUUID().toString()));
    }

}
