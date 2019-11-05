package com.rohit26.RepoSitory;

import com.rohit26.entity.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

    ExchangeValue findByFrmAndTo(String frm, String to);

}
