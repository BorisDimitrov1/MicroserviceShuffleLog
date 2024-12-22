package com.app.controller;

import com.app.service.ShuffleService;
import com.app.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shuffle")
public class ShuffleController {

    @Autowired
    private ShuffleService shuffleService;

    @Autowired
    private LogService logService;

    @PostMapping
    public int[] shuffleNumbers(@RequestParam int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Number must be between 1 and 1000");
        }

        // Generate shuffled array
        int[] shuffledArray = shuffleService.generateShuffledArray(number);

        // Asynchronously log the request
        logService.sendLog(number, shuffledArray);

        // Return the shuffled array
        return shuffledArray;
    }
}