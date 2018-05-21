package duanzu.entity;

import java.util.ArrayList;
import java.util.List;

public class PriceAndRequestInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriceAndRequestInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPriceInfoIdIsNull() {
            addCriterion("price_info_id is null");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdIsNotNull() {
            addCriterion("price_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdEqualTo(String value) {
            addCriterion("price_info_id =", value, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdNotEqualTo(String value) {
            addCriterion("price_info_id <>", value, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdGreaterThan(String value) {
            addCriterion("price_info_id >", value, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("price_info_id >=", value, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdLessThan(String value) {
            addCriterion("price_info_id <", value, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdLessThanOrEqualTo(String value) {
            addCriterion("price_info_id <=", value, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdLike(String value) {
            addCriterion("price_info_id like", value, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdNotLike(String value) {
            addCriterion("price_info_id not like", value, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdIn(List<String> values) {
            addCriterion("price_info_id in", values, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdNotIn(List<String> values) {
            addCriterion("price_info_id not in", values, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdBetween(String value1, String value2) {
            addCriterion("price_info_id between", value1, value2, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andPriceInfoIdNotBetween(String value1, String value2) {
            addCriterion("price_info_id not between", value1, value2, "priceInfoId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(String value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(String value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(String value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(String value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(String value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLike(String value) {
            addCriterion("house_id like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotLike(String value) {
            addCriterion("house_id not like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<String> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<String> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(String value1, String value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(String value1, String value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andDayPriceIsNull() {
            addCriterion("day_price is null");
            return (Criteria) this;
        }

        public Criteria andDayPriceIsNotNull() {
            addCriterion("day_price is not null");
            return (Criteria) this;
        }

        public Criteria andDayPriceEqualTo(String value) {
            addCriterion("day_price =", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotEqualTo(String value) {
            addCriterion("day_price <>", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceGreaterThan(String value) {
            addCriterion("day_price >", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceGreaterThanOrEqualTo(String value) {
            addCriterion("day_price >=", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceLessThan(String value) {
            addCriterion("day_price <", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceLessThanOrEqualTo(String value) {
            addCriterion("day_price <=", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceLike(String value) {
            addCriterion("day_price like", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotLike(String value) {
            addCriterion("day_price not like", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceIn(List<String> values) {
            addCriterion("day_price in", values, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotIn(List<String> values) {
            addCriterion("day_price not in", values, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceBetween(String value1, String value2) {
            addCriterion("day_price between", value1, value2, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotBetween(String value1, String value2) {
            addCriterion("day_price not between", value1, value2, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceIsNull() {
            addCriterion("week_price is null");
            return (Criteria) this;
        }

        public Criteria andWeekPriceIsNotNull() {
            addCriterion("week_price is not null");
            return (Criteria) this;
        }

        public Criteria andWeekPriceEqualTo(String value) {
            addCriterion("week_price =", value, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceNotEqualTo(String value) {
            addCriterion("week_price <>", value, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceGreaterThan(String value) {
            addCriterion("week_price >", value, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceGreaterThanOrEqualTo(String value) {
            addCriterion("week_price >=", value, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceLessThan(String value) {
            addCriterion("week_price <", value, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceLessThanOrEqualTo(String value) {
            addCriterion("week_price <=", value, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceLike(String value) {
            addCriterion("week_price like", value, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceNotLike(String value) {
            addCriterion("week_price not like", value, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceIn(List<String> values) {
            addCriterion("week_price in", values, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceNotIn(List<String> values) {
            addCriterion("week_price not in", values, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceBetween(String value1, String value2) {
            addCriterion("week_price between", value1, value2, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andWeekPriceNotBetween(String value1, String value2) {
            addCriterion("week_price not between", value1, value2, "weekPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceIsNull() {
            addCriterion("clean_price is null");
            return (Criteria) this;
        }

        public Criteria andCleanPriceIsNotNull() {
            addCriterion("clean_price is not null");
            return (Criteria) this;
        }

        public Criteria andCleanPriceEqualTo(String value) {
            addCriterion("clean_price =", value, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceNotEqualTo(String value) {
            addCriterion("clean_price <>", value, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceGreaterThan(String value) {
            addCriterion("clean_price >", value, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceGreaterThanOrEqualTo(String value) {
            addCriterion("clean_price >=", value, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceLessThan(String value) {
            addCriterion("clean_price <", value, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceLessThanOrEqualTo(String value) {
            addCriterion("clean_price <=", value, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceLike(String value) {
            addCriterion("clean_price like", value, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceNotLike(String value) {
            addCriterion("clean_price not like", value, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceIn(List<String> values) {
            addCriterion("clean_price in", values, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceNotIn(List<String> values) {
            addCriterion("clean_price not in", values, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceBetween(String value1, String value2) {
            addCriterion("clean_price between", value1, value2, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCleanPriceNotBetween(String value1, String value2) {
            addCriterion("clean_price not between", value1, value2, "cleanPrice");
            return (Criteria) this;
        }

        public Criteria andCashPledgeIsNull() {
            addCriterion("cash_pledge is null");
            return (Criteria) this;
        }

        public Criteria andCashPledgeIsNotNull() {
            addCriterion("cash_pledge is not null");
            return (Criteria) this;
        }

        public Criteria andCashPledgeEqualTo(String value) {
            addCriterion("cash_pledge =", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotEqualTo(String value) {
            addCriterion("cash_pledge <>", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeGreaterThan(String value) {
            addCriterion("cash_pledge >", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeGreaterThanOrEqualTo(String value) {
            addCriterion("cash_pledge >=", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeLessThan(String value) {
            addCriterion("cash_pledge <", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeLessThanOrEqualTo(String value) {
            addCriterion("cash_pledge <=", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeLike(String value) {
            addCriterion("cash_pledge like", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotLike(String value) {
            addCriterion("cash_pledge not like", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeIn(List<String> values) {
            addCriterion("cash_pledge in", values, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotIn(List<String> values) {
            addCriterion("cash_pledge not in", values, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeBetween(String value1, String value2) {
            addCriterion("cash_pledge between", value1, value2, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotBetween(String value1, String value2) {
            addCriterion("cash_pledge not between", value1, value2, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andLessDayIsNull() {
            addCriterion("less_day is null");
            return (Criteria) this;
        }

        public Criteria andLessDayIsNotNull() {
            addCriterion("less_day is not null");
            return (Criteria) this;
        }

        public Criteria andLessDayEqualTo(String value) {
            addCriterion("less_day =", value, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayNotEqualTo(String value) {
            addCriterion("less_day <>", value, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayGreaterThan(String value) {
            addCriterion("less_day >", value, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayGreaterThanOrEqualTo(String value) {
            addCriterion("less_day >=", value, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayLessThan(String value) {
            addCriterion("less_day <", value, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayLessThanOrEqualTo(String value) {
            addCriterion("less_day <=", value, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayLike(String value) {
            addCriterion("less_day like", value, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayNotLike(String value) {
            addCriterion("less_day not like", value, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayIn(List<String> values) {
            addCriterion("less_day in", values, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayNotIn(List<String> values) {
            addCriterion("less_day not in", values, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayBetween(String value1, String value2) {
            addCriterion("less_day between", value1, value2, "lessDay");
            return (Criteria) this;
        }

        public Criteria andLessDayNotBetween(String value1, String value2) {
            addCriterion("less_day not between", value1, value2, "lessDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayIsNull() {
            addCriterion("more_day is null");
            return (Criteria) this;
        }

        public Criteria andMoreDayIsNotNull() {
            addCriterion("more_day is not null");
            return (Criteria) this;
        }

        public Criteria andMoreDayEqualTo(String value) {
            addCriterion("more_day =", value, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayNotEqualTo(String value) {
            addCriterion("more_day <>", value, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayGreaterThan(String value) {
            addCriterion("more_day >", value, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayGreaterThanOrEqualTo(String value) {
            addCriterion("more_day >=", value, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayLessThan(String value) {
            addCriterion("more_day <", value, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayLessThanOrEqualTo(String value) {
            addCriterion("more_day <=", value, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayLike(String value) {
            addCriterion("more_day like", value, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayNotLike(String value) {
            addCriterion("more_day not like", value, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayIn(List<String> values) {
            addCriterion("more_day in", values, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayNotIn(List<String> values) {
            addCriterion("more_day not in", values, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayBetween(String value1, String value2) {
            addCriterion("more_day between", value1, value2, "moreDay");
            return (Criteria) this;
        }

        public Criteria andMoreDayNotBetween(String value1, String value2) {
            addCriterion("more_day not between", value1, value2, "moreDay");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeIsNull() {
            addCriterion("check_in_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeIsNotNull() {
            addCriterion("check_in_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeEqualTo(String value) {
            addCriterion("check_in_start_time =", value, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeNotEqualTo(String value) {
            addCriterion("check_in_start_time <>", value, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeGreaterThan(String value) {
            addCriterion("check_in_start_time >", value, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("check_in_start_time >=", value, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeLessThan(String value) {
            addCriterion("check_in_start_time <", value, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeLessThanOrEqualTo(String value) {
            addCriterion("check_in_start_time <=", value, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeLike(String value) {
            addCriterion("check_in_start_time like", value, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeNotLike(String value) {
            addCriterion("check_in_start_time not like", value, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeIn(List<String> values) {
            addCriterion("check_in_start_time in", values, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeNotIn(List<String> values) {
            addCriterion("check_in_start_time not in", values, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeBetween(String value1, String value2) {
            addCriterion("check_in_start_time between", value1, value2, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStartTimeNotBetween(String value1, String value2) {
            addCriterion("check_in_start_time not between", value1, value2, "checkInStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeIsNull() {
            addCriterion("check_in_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeIsNotNull() {
            addCriterion("check_in_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeEqualTo(String value) {
            addCriterion("check_in_end_time =", value, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeNotEqualTo(String value) {
            addCriterion("check_in_end_time <>", value, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeGreaterThan(String value) {
            addCriterion("check_in_end_time >", value, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("check_in_end_time >=", value, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeLessThan(String value) {
            addCriterion("check_in_end_time <", value, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeLessThanOrEqualTo(String value) {
            addCriterion("check_in_end_time <=", value, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeLike(String value) {
            addCriterion("check_in_end_time like", value, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeNotLike(String value) {
            addCriterion("check_in_end_time not like", value, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeIn(List<String> values) {
            addCriterion("check_in_end_time in", values, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeNotIn(List<String> values) {
            addCriterion("check_in_end_time not in", values, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeBetween(String value1, String value2) {
            addCriterion("check_in_end_time between", value1, value2, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckInEndTimeNotBetween(String value1, String value2) {
            addCriterion("check_in_end_time not between", value1, value2, "checkInEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeIsNull() {
            addCriterion("check_out_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeIsNotNull() {
            addCriterion("check_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeEqualTo(String value) {
            addCriterion("check_out_time =", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeNotEqualTo(String value) {
            addCriterion("check_out_time <>", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeGreaterThan(String value) {
            addCriterion("check_out_time >", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeGreaterThanOrEqualTo(String value) {
            addCriterion("check_out_time >=", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeLessThan(String value) {
            addCriterion("check_out_time <", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeLessThanOrEqualTo(String value) {
            addCriterion("check_out_time <=", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeLike(String value) {
            addCriterion("check_out_time like", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeNotLike(String value) {
            addCriterion("check_out_time not like", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeIn(List<String> values) {
            addCriterion("check_out_time in", values, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeNotIn(List<String> values) {
            addCriterion("check_out_time not in", values, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeBetween(String value1, String value2) {
            addCriterion("check_out_time between", value1, value2, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeNotBetween(String value1, String value2) {
            addCriterion("check_out_time not between", value1, value2, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}