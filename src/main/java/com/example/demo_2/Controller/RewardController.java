package com.example.demo_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_2.Service.RewardService;

@RestController
public class RewardController {

    @Autowired
    private RewardService rewardService;

    @GetMapping("/reward/points/monthly")
    public int getMonthlyRewardPoints(
            @RequestParam Long customerId,
            @RequestParam String startDate,
            @RequestParam String endDate) {
        return rewardService.getMonthlyRewardPoints(customerId, startDate, endDate);

    }

    @GetMapping("/reward/points/total")
    public int gettotalRewardPoints(@RequestParam Long customerId){
        return rewardService.getTotalRewardPoints(customerId);
    }

}
