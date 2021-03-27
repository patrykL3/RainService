package pl.patryklubik.rainTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.patryklubik.rainTask.service.RainService;

/**
 * Create by Patryk Łubik on 27.03.2021.
 */

@RequestMapping("/table")
@RestController
public class RainController {

    private final RainService rainService;

    @Autowired
    public RainController(RainService rainService) {
        this.rainService = rainService;
    }

    @PostMapping
    public int getNumberOfFloodedTableSquares(@RequestBody int[] table) {
        return rainService.getNumberOfFloodedTableSquares(table);
    }
}
