package com.enviro.assessment.grad001.lwandonodume.backend.repository;

import com.enviro.assessment.grad001.lwandonodume.backend.models.WithdrawalNotice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WithdrawalNoticeRepository extends JpaRepository<WithdrawalNotice, Long> {

}