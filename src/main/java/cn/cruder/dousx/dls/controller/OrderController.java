package cn.cruder.dousx.dls.controller;

import cn.cruder.dousx.dls.dto.ModifyParam;
import cn.cruder.dousx.dls.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author dousx
 */
@RestController
@RequestMapping("/Order")
@AllArgsConstructor
public class OrderController {
    private final InventoryService inventoryService;

    /**
     * 用get为了方便测试
     * <p>
     * <br/>
     * curl --location --request GET 'http://localhost:7900/Order/placeOrder?num=-1&goodsId=01'
     * <p>
     * <p>
     * ab压测
     * <br/>
     * <p>
     * ab -n 200 -c 20 http://192.168.111.1:7900/Order/placeOrder\?num\=-1\&goodsId\=01
     * </p>
     *
     * @param num     num
     * @param goodsId goodsId
     */
    @GetMapping("/placeOrder")
    public String placeOrder(@RequestParam("num") Integer num, @RequestParam("goodsId") String goodsId) {
        inventoryService.placeOrder(new ModifyParam(num, goodsId));
        return "done...";
    }

}
