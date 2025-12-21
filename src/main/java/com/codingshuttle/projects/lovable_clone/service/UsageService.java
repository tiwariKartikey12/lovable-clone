package com.codingshuttle.projects.lovable_clone.service;

import com.codingshuttle.projects.lovable_clone.dto.subscription.PlanLimitResponse;
import com.codingshuttle.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import org.springframework.stereotype.Service;

@Service
public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
