package com.enviro.assessment.grad001.lwandonodume.backend.services.Impl;

import com.enviro.assessment.grad001.lwandonodume.backend.models.WithdrawalNotice;
import com.enviro.assessment.grad001.lwandonodume.backend.repository.WithdrawalNoticeRepository;
import com.enviro.assessment.grad001.lwandonodume.backend.services.WithdrawalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WithdrawalNoticeServiceImpl implements WithdrawalService {

    @Autowired
    WithdrawalNoticeRepository withdrawalNoticeRepository;

//    @Autowired
//    ProductService productService;
//
//    @Autowired
//    InvestorService investorService;
    @Override
    public WithdrawalNotice save(WithdrawalNotice withdrawalNotice) {

        return withdrawalNoticeRepository.save(withdrawalNotice);
    }

    @Override
    public WithdrawalNotice findById(Long id) {
        return withdrawalNoticeRepository.findById(id).orElse(null);
    }

    @Override
    public List<WithdrawalNotice> findAllWithdrawalNotice() {
        return withdrawalNoticeRepository.findAll();
    }
}
