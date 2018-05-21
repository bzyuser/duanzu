package duanzu.entity;

import java.util.ArrayList;
import java.util.List;

public class HouseDetailInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseDetailInfoExample() {
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

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(String value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(String value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(String value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(String value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(String value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLike(String value) {
            addCriterion("detail_id like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotLike(String value) {
            addCriterion("detail_id not like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<String> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<String> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(String value1, String value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(String value1, String value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdIsNull() {
            addCriterion("hou_house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdIsNotNull() {
            addCriterion("hou_house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdEqualTo(String value) {
            addCriterion("hou_house_id =", value, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdNotEqualTo(String value) {
            addCriterion("hou_house_id <>", value, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdGreaterThan(String value) {
            addCriterion("hou_house_id >", value, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("hou_house_id >=", value, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdLessThan(String value) {
            addCriterion("hou_house_id <", value, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdLessThanOrEqualTo(String value) {
            addCriterion("hou_house_id <=", value, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdLike(String value) {
            addCriterion("hou_house_id like", value, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdNotLike(String value) {
            addCriterion("hou_house_id not like", value, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdIn(List<String> values) {
            addCriterion("hou_house_id in", values, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdNotIn(List<String> values) {
            addCriterion("hou_house_id not in", values, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdBetween(String value1, String value2) {
            addCriterion("hou_house_id between", value1, value2, "houHouseId");
            return (Criteria) this;
        }

        public Criteria andHouHouseIdNotBetween(String value1, String value2) {
            addCriterion("hou_house_id not between", value1, value2, "houHouseId");
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

        public Criteria andHomeNumIsNull() {
            addCriterion("home_num is null");
            return (Criteria) this;
        }

        public Criteria andHomeNumIsNotNull() {
            addCriterion("home_num is not null");
            return (Criteria) this;
        }

        public Criteria andHomeNumEqualTo(String value) {
            addCriterion("home_num =", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotEqualTo(String value) {
            addCriterion("home_num <>", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumGreaterThan(String value) {
            addCriterion("home_num >", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumGreaterThanOrEqualTo(String value) {
            addCriterion("home_num >=", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumLessThan(String value) {
            addCriterion("home_num <", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumLessThanOrEqualTo(String value) {
            addCriterion("home_num <=", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumLike(String value) {
            addCriterion("home_num like", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotLike(String value) {
            addCriterion("home_num not like", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumIn(List<String> values) {
            addCriterion("home_num in", values, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotIn(List<String> values) {
            addCriterion("home_num not in", values, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumBetween(String value1, String value2) {
            addCriterion("home_num between", value1, value2, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotBetween(String value1, String value2) {
            addCriterion("home_num not between", value1, value2, "homeNum");
            return (Criteria) this;
        }

        public Criteria andBedNumIsNull() {
            addCriterion("bed_num is null");
            return (Criteria) this;
        }

        public Criteria andBedNumIsNotNull() {
            addCriterion("bed_num is not null");
            return (Criteria) this;
        }

        public Criteria andBedNumEqualTo(String value) {
            addCriterion("bed_num =", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotEqualTo(String value) {
            addCriterion("bed_num <>", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumGreaterThan(String value) {
            addCriterion("bed_num >", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumGreaterThanOrEqualTo(String value) {
            addCriterion("bed_num >=", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLessThan(String value) {
            addCriterion("bed_num <", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLessThanOrEqualTo(String value) {
            addCriterion("bed_num <=", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLike(String value) {
            addCriterion("bed_num like", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotLike(String value) {
            addCriterion("bed_num not like", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumIn(List<String> values) {
            addCriterion("bed_num in", values, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotIn(List<String> values) {
            addCriterion("bed_num not in", values, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumBetween(String value1, String value2) {
            addCriterion("bed_num between", value1, value2, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotBetween(String value1, String value2) {
            addCriterion("bed_num not between", value1, value2, "bedNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumIsNull() {
            addCriterion("available_people_num is null");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumIsNotNull() {
            addCriterion("available_people_num is not null");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumEqualTo(String value) {
            addCriterion("available_people_num =", value, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumNotEqualTo(String value) {
            addCriterion("available_people_num <>", value, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumGreaterThan(String value) {
            addCriterion("available_people_num >", value, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumGreaterThanOrEqualTo(String value) {
            addCriterion("available_people_num >=", value, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumLessThan(String value) {
            addCriterion("available_people_num <", value, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumLessThanOrEqualTo(String value) {
            addCriterion("available_people_num <=", value, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumLike(String value) {
            addCriterion("available_people_num like", value, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumNotLike(String value) {
            addCriterion("available_people_num not like", value, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumIn(List<String> values) {
            addCriterion("available_people_num in", values, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumNotIn(List<String> values) {
            addCriterion("available_people_num not in", values, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumBetween(String value1, String value2) {
            addCriterion("available_people_num between", value1, value2, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andAvailablePeopleNumNotBetween(String value1, String value2) {
            addCriterion("available_people_num not between", value1, value2, "availablePeopleNum");
            return (Criteria) this;
        }

        public Criteria andBedTypeIsNull() {
            addCriterion("bed_type is null");
            return (Criteria) this;
        }

        public Criteria andBedTypeIsNotNull() {
            addCriterion("bed_type is not null");
            return (Criteria) this;
        }

        public Criteria andBedTypeEqualTo(String value) {
            addCriterion("bed_type =", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeNotEqualTo(String value) {
            addCriterion("bed_type <>", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeGreaterThan(String value) {
            addCriterion("bed_type >", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bed_type >=", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeLessThan(String value) {
            addCriterion("bed_type <", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeLessThanOrEqualTo(String value) {
            addCriterion("bed_type <=", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeLike(String value) {
            addCriterion("bed_type like", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeNotLike(String value) {
            addCriterion("bed_type not like", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeIn(List<String> values) {
            addCriterion("bed_type in", values, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeNotIn(List<String> values) {
            addCriterion("bed_type not in", values, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeBetween(String value1, String value2) {
            addCriterion("bed_type between", value1, value2, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeNotBetween(String value1, String value2) {
            addCriterion("bed_type not between", value1, value2, "bedType");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumIsNull() {
            addCriterion("extra_add_people_num is null");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumIsNotNull() {
            addCriterion("extra_add_people_num is not null");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumEqualTo(String value) {
            addCriterion("extra_add_people_num =", value, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumNotEqualTo(String value) {
            addCriterion("extra_add_people_num <>", value, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumGreaterThan(String value) {
            addCriterion("extra_add_people_num >", value, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumGreaterThanOrEqualTo(String value) {
            addCriterion("extra_add_people_num >=", value, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumLessThan(String value) {
            addCriterion("extra_add_people_num <", value, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumLessThanOrEqualTo(String value) {
            addCriterion("extra_add_people_num <=", value, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumLike(String value) {
            addCriterion("extra_add_people_num like", value, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumNotLike(String value) {
            addCriterion("extra_add_people_num not like", value, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumIn(List<String> values) {
            addCriterion("extra_add_people_num in", values, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumNotIn(List<String> values) {
            addCriterion("extra_add_people_num not in", values, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumBetween(String value1, String value2) {
            addCriterion("extra_add_people_num between", value1, value2, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddPeopleNumNotBetween(String value1, String value2) {
            addCriterion("extra_add_people_num not between", value1, value2, "extraAddPeopleNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumIsNull() {
            addCriterion("toilet_num is null");
            return (Criteria) this;
        }

        public Criteria andToiletNumIsNotNull() {
            addCriterion("toilet_num is not null");
            return (Criteria) this;
        }

        public Criteria andToiletNumEqualTo(String value) {
            addCriterion("toilet_num =", value, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumNotEqualTo(String value) {
            addCriterion("toilet_num <>", value, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumGreaterThan(String value) {
            addCriterion("toilet_num >", value, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumGreaterThanOrEqualTo(String value) {
            addCriterion("toilet_num >=", value, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumLessThan(String value) {
            addCriterion("toilet_num <", value, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumLessThanOrEqualTo(String value) {
            addCriterion("toilet_num <=", value, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumLike(String value) {
            addCriterion("toilet_num like", value, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumNotLike(String value) {
            addCriterion("toilet_num not like", value, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumIn(List<String> values) {
            addCriterion("toilet_num in", values, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumNotIn(List<String> values) {
            addCriterion("toilet_num not in", values, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumBetween(String value1, String value2) {
            addCriterion("toilet_num between", value1, value2, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletNumNotBetween(String value1, String value2) {
            addCriterion("toilet_num not between", value1, value2, "toiletNum");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIsNull() {
            addCriterion("toilet_type is null");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIsNotNull() {
            addCriterion("toilet_type is not null");
            return (Criteria) this;
        }

        public Criteria andToiletTypeEqualTo(String value) {
            addCriterion("toilet_type =", value, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeNotEqualTo(String value) {
            addCriterion("toilet_type <>", value, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeGreaterThan(String value) {
            addCriterion("toilet_type >", value, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeGreaterThanOrEqualTo(String value) {
            addCriterion("toilet_type >=", value, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeLessThan(String value) {
            addCriterion("toilet_type <", value, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeLessThanOrEqualTo(String value) {
            addCriterion("toilet_type <=", value, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeLike(String value) {
            addCriterion("toilet_type like", value, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeNotLike(String value) {
            addCriterion("toilet_type not like", value, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeIn(List<String> values) {
            addCriterion("toilet_type in", values, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeNotIn(List<String> values) {
            addCriterion("toilet_type not in", values, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeBetween(String value1, String value2) {
            addCriterion("toilet_type between", value1, value2, "toiletType");
            return (Criteria) this;
        }

        public Criteria andToiletTypeNotBetween(String value1, String value2) {
            addCriterion("toilet_type not between", value1, value2, "toiletType");
            return (Criteria) this;
        }

        public Criteria andTowerLevelIsNull() {
            addCriterion("tower_level is null");
            return (Criteria) this;
        }

        public Criteria andTowerLevelIsNotNull() {
            addCriterion("tower_level is not null");
            return (Criteria) this;
        }

        public Criteria andTowerLevelEqualTo(String value) {
            addCriterion("tower_level =", value, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelNotEqualTo(String value) {
            addCriterion("tower_level <>", value, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelGreaterThan(String value) {
            addCriterion("tower_level >", value, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("tower_level >=", value, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelLessThan(String value) {
            addCriterion("tower_level <", value, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelLessThanOrEqualTo(String value) {
            addCriterion("tower_level <=", value, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelLike(String value) {
            addCriterion("tower_level like", value, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelNotLike(String value) {
            addCriterion("tower_level not like", value, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelIn(List<String> values) {
            addCriterion("tower_level in", values, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelNotIn(List<String> values) {
            addCriterion("tower_level not in", values, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelBetween(String value1, String value2) {
            addCriterion("tower_level between", value1, value2, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTowerLevelNotBetween(String value1, String value2) {
            addCriterion("tower_level not between", value1, value2, "towerLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelIsNull() {
            addCriterion("total_level is null");
            return (Criteria) this;
        }

        public Criteria andTotalLevelIsNotNull() {
            addCriterion("total_level is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLevelEqualTo(String value) {
            addCriterion("total_level =", value, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelNotEqualTo(String value) {
            addCriterion("total_level <>", value, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelGreaterThan(String value) {
            addCriterion("total_level >", value, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelGreaterThanOrEqualTo(String value) {
            addCriterion("total_level >=", value, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelLessThan(String value) {
            addCriterion("total_level <", value, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelLessThanOrEqualTo(String value) {
            addCriterion("total_level <=", value, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelLike(String value) {
            addCriterion("total_level like", value, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelNotLike(String value) {
            addCriterion("total_level not like", value, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelIn(List<String> values) {
            addCriterion("total_level in", values, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelNotIn(List<String> values) {
            addCriterion("total_level not in", values, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelBetween(String value1, String value2) {
            addCriterion("total_level between", value1, value2, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andTotalLevelNotBetween(String value1, String value2) {
            addCriterion("total_level not between", value1, value2, "totalLevel");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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