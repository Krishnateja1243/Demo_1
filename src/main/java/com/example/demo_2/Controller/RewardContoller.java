package com.example.demo_2.Controller;
 import com.example.rewardprogram.service.RewardService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.Restcontroller;

 @RestController
 public class RewardContoller {

     @Autowired
     Private RewardService
     rewardService;

     @Getapping("/reward/points/monthly")
     public int getMonthlyRewardPoints(
             @RequestParam Long customerId,
             @RequestParam String startDate,
             @RequestParam String endDate) {
         return rewardService.getMonthlyRewardPoints(customerID, startDate, endDate);

     }

     @GetMapping("/reward/points/total")
     public int gettotalRewardPoints(@RequestParam Long customerId)
    return rewardService.getTotalRewardPoints(customerId);
 }

}
