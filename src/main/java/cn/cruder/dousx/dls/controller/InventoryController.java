package cn.cruder.dousx.dls.controller;

import cn.cruder.dousx.dls.dto.ModifyParam;
import cn.cruder.dousx.dls.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author dousx
 */
@RestController
@RequestMapping("/Inventory")
@AllArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    /**
     * curl --location --request PUT 'http://localhost:7900/Inventory/modify?num=2'
     *
     * @param num num
     */
    @PutMapping("/modify")
    public void modifyInventory(@RequestParam("num") Integer num) {
        inventoryService.modifyInventory(new ModifyParam(num, UUID.randomUUID().toString()));
    }

}
