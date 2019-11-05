package com.rohit26.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name="exchange_value")
public class ExchangeValue {

        @Id
        private Long id;
        private String frm;
        private String to;
        @Column(name = "conversion_multiple")
        private BigDecimal conversionMultiple;
        private int port;
        public ExchangeValue() {

        }

        public ExchangeValue(Long id, String frm, String to, BigDecimal conversionMultiple) {
            this.id = id;
            this.frm = frm;
            this.to = to;
            this.conversionMultiple = conversionMultiple;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFrm() {
            return frm;
        }

        public void setFrm(String frm) {
            this.frm = frm;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public BigDecimal getConversionMultiple() {
            return conversionMultiple;
        }

        public void setConversionMultiple(BigDecimal conversionMultiple) {
            this.conversionMultiple = conversionMultiple;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }


    }

