package duanzu.entity;

import java.util.ArrayList;
import java.util.List;

public class HouseBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseBaseInfoExample() {
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

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdIsNull() {
            addCriterion("host_family_id is null");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdIsNotNull() {
            addCriterion("host_family_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdEqualTo(String value) {
            addCriterion("host_family_id =", value, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdNotEqualTo(String value) {
            addCriterion("host_family_id <>", value, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdGreaterThan(String value) {
            addCriterion("host_family_id >", value, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdGreaterThanOrEqualTo(String value) {
            addCriterion("host_family_id >=", value, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdLessThan(String value) {
            addCriterion("host_family_id <", value, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdLessThanOrEqualTo(String value) {
            addCriterion("host_family_id <=", value, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdLike(String value) {
            addCriterion("host_family_id like", value, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdNotLike(String value) {
            addCriterion("host_family_id not like", value, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdIn(List<String> values) {
            addCriterion("host_family_id in", values, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdNotIn(List<String> values) {
            addCriterion("host_family_id not in", values, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdBetween(String value1, String value2) {
            addCriterion("host_family_id between", value1, value2, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHostFamilyIdNotBetween(String value1, String value2) {
            addCriterion("host_family_id not between", value1, value2, "hostFamilyId");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNull() {
            addCriterion("house_name is null");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNotNull() {
            addCriterion("house_name is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNameEqualTo(String value) {
            addCriterion("house_name =", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotEqualTo(String value) {
            addCriterion("house_name <>", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThan(String value) {
            addCriterion("house_name >", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("house_name >=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThan(String value) {
            addCriterion("house_name <", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThanOrEqualTo(String value) {
            addCriterion("house_name <=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLike(String value) {
            addCriterion("house_name like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotLike(String value) {
            addCriterion("house_name not like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameIn(List<String> values) {
            addCriterion("house_name in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotIn(List<String> values) {
            addCriterion("house_name not in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameBetween(String value1, String value2) {
            addCriterion("house_name between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotBetween(String value1, String value2) {
            addCriterion("house_name not between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeIsNull() {
            addCriterion("rent_out_type is null");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeIsNotNull() {
            addCriterion("rent_out_type is not null");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeEqualTo(String value) {
            addCriterion("rent_out_type =", value, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeNotEqualTo(String value) {
            addCriterion("rent_out_type <>", value, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeGreaterThan(String value) {
            addCriterion("rent_out_type >", value, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rent_out_type >=", value, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeLessThan(String value) {
            addCriterion("rent_out_type <", value, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeLessThanOrEqualTo(String value) {
            addCriterion("rent_out_type <=", value, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeLike(String value) {
            addCriterion("rent_out_type like", value, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeNotLike(String value) {
            addCriterion("rent_out_type not like", value, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeIn(List<String> values) {
            addCriterion("rent_out_type in", values, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeNotIn(List<String> values) {
            addCriterion("rent_out_type not in", values, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeBetween(String value1, String value2) {
            addCriterion("rent_out_type between", value1, value2, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andRentOutTypeNotBetween(String value1, String value2) {
            addCriterion("rent_out_type not between", value1, value2, "rentOutType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("house_type like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("house_type not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeIsNull() {
            addCriterion("home_type is null");
            return (Criteria) this;
        }

        public Criteria andHomeTypeIsNotNull() {
            addCriterion("home_type is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTypeEqualTo(String value) {
            addCriterion("home_type =", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeNotEqualTo(String value) {
            addCriterion("home_type <>", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeGreaterThan(String value) {
            addCriterion("home_type >", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("home_type >=", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeLessThan(String value) {
            addCriterion("home_type <", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeLessThanOrEqualTo(String value) {
            addCriterion("home_type <=", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeLike(String value) {
            addCriterion("home_type like", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeNotLike(String value) {
            addCriterion("home_type not like", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeIn(List<String> values) {
            addCriterion("home_type in", values, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeNotIn(List<String> values) {
            addCriterion("home_type not in", values, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeBetween(String value1, String value2) {
            addCriterion("home_type between", value1, value2, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeNotBetween(String value1, String value2) {
            addCriterion("home_type not between", value1, value2, "homeType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFacilityIsNull() {
            addCriterion("facility is null");
            return (Criteria) this;
        }

        public Criteria andFacilityIsNotNull() {
            addCriterion("facility is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityEqualTo(String value) {
            addCriterion("facility =", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityNotEqualTo(String value) {
            addCriterion("facility <>", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityGreaterThan(String value) {
            addCriterion("facility >", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityGreaterThanOrEqualTo(String value) {
            addCriterion("facility >=", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityLessThan(String value) {
            addCriterion("facility <", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityLessThanOrEqualTo(String value) {
            addCriterion("facility <=", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityLike(String value) {
            addCriterion("facility like", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityNotLike(String value) {
            addCriterion("facility not like", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityIn(List<String> values) {
            addCriterion("facility in", values, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityNotIn(List<String> values) {
            addCriterion("facility not in", values, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityBetween(String value1, String value2) {
            addCriterion("facility between", value1, value2, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityNotBetween(String value1, String value2) {
            addCriterion("facility not between", value1, value2, "facility");
            return (Criteria) this;
        }

        public Criteria andHouseDescIsNull() {
            addCriterion("house_desc is null");
            return (Criteria) this;
        }

        public Criteria andHouseDescIsNotNull() {
            addCriterion("house_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDescEqualTo(String value) {
            addCriterion("house_desc =", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescNotEqualTo(String value) {
            addCriterion("house_desc <>", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescGreaterThan(String value) {
            addCriterion("house_desc >", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescGreaterThanOrEqualTo(String value) {
            addCriterion("house_desc >=", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescLessThan(String value) {
            addCriterion("house_desc <", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescLessThanOrEqualTo(String value) {
            addCriterion("house_desc <=", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescLike(String value) {
            addCriterion("house_desc like", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescNotLike(String value) {
            addCriterion("house_desc not like", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescIn(List<String> values) {
            addCriterion("house_desc in", values, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescNotIn(List<String> values) {
            addCriterion("house_desc not in", values, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescBetween(String value1, String value2) {
            addCriterion("house_desc between", value1, value2, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescNotBetween(String value1, String value2) {
            addCriterion("house_desc not between", value1, value2, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNull() {
            addCriterion("traffic is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNotNull() {
            addCriterion("traffic is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficEqualTo(String value) {
            addCriterion("traffic =", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotEqualTo(String value) {
            addCriterion("traffic <>", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThan(String value) {
            addCriterion("traffic >", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("traffic >=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThan(String value) {
            addCriterion("traffic <", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThanOrEqualTo(String value) {
            addCriterion("traffic <=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLike(String value) {
            addCriterion("traffic like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotLike(String value) {
            addCriterion("traffic not like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficIn(List<String> values) {
            addCriterion("traffic in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotIn(List<String> values) {
            addCriterion("traffic not in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficBetween(String value1, String value2) {
            addCriterion("traffic between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotBetween(String value1, String value2) {
            addCriterion("traffic not between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andRimDescIsNull() {
            addCriterion("rim_desc is null");
            return (Criteria) this;
        }

        public Criteria andRimDescIsNotNull() {
            addCriterion("rim_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRimDescEqualTo(String value) {
            addCriterion("rim_desc =", value, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescNotEqualTo(String value) {
            addCriterion("rim_desc <>", value, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescGreaterThan(String value) {
            addCriterion("rim_desc >", value, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescGreaterThanOrEqualTo(String value) {
            addCriterion("rim_desc >=", value, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescLessThan(String value) {
            addCriterion("rim_desc <", value, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescLessThanOrEqualTo(String value) {
            addCriterion("rim_desc <=", value, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescLike(String value) {
            addCriterion("rim_desc like", value, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescNotLike(String value) {
            addCriterion("rim_desc not like", value, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescIn(List<String> values) {
            addCriterion("rim_desc in", values, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescNotIn(List<String> values) {
            addCriterion("rim_desc not in", values, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescBetween(String value1, String value2) {
            addCriterion("rim_desc between", value1, value2, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andRimDescNotBetween(String value1, String value2) {
            addCriterion("rim_desc not between", value1, value2, "rimDesc");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andHotLevelIsNull() {
            addCriterion("hot_level is null");
            return (Criteria) this;
        }

        public Criteria andHotLevelIsNotNull() {
            addCriterion("hot_level is not null");
            return (Criteria) this;
        }

        public Criteria andHotLevelEqualTo(String value) {
            addCriterion("hot_level =", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelNotEqualTo(String value) {
            addCriterion("hot_level <>", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelGreaterThan(String value) {
            addCriterion("hot_level >", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelGreaterThanOrEqualTo(String value) {
            addCriterion("hot_level >=", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelLessThan(String value) {
            addCriterion("hot_level <", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelLessThanOrEqualTo(String value) {
            addCriterion("hot_level <=", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelLike(String value) {
            addCriterion("hot_level like", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelNotLike(String value) {
            addCriterion("hot_level not like", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelIn(List<String> values) {
            addCriterion("hot_level in", values, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelNotIn(List<String> values) {
            addCriterion("hot_level not in", values, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelBetween(String value1, String value2) {
            addCriterion("hot_level between", value1, value2, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelNotBetween(String value1, String value2) {
            addCriterion("hot_level not between", value1, value2, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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