package com.lionel.retrofit2p;

import java.util.List;

public class CouponListResult {

    private int status;
    private String errorNo;
    private String message;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrorNo() {
        return errorNo;
    }

    public void setErrorNo(String errorNo) {
        this.errorNo = errorNo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String name;
        private String code;
        private int valueAmount;
        private int orderLimitPrice;
        private String validDateFrom;
        private String validDateTo;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getValueAmount() {
            return valueAmount;
        }

        public void setValueAmount(int valueAmount) {
            this.valueAmount = valueAmount;
        }

        public int getOrderLimitPrice() {
            return orderLimitPrice;
        }

        public void setOrderLimitPrice(int orderLimitPrice) {
            this.orderLimitPrice = orderLimitPrice;
        }

        public String getValidDateFrom() {
            return validDateFrom;
        }

        public void setValidDateFrom(String validDateFrom) {
            this.validDateFrom = validDateFrom;
        }

        public String getValidDateTo() {
            return validDateTo;
        }

        public void setValidDateTo(String validDateTo) {
            this.validDateTo = validDateTo;
        }
    }
}
