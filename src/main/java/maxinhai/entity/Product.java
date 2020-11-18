package maxinhai.entity;

import javax.persistence.ManyToOne;

/**
 * 功能描述: 产品
 * @Param:
 * @Return:
 * @Author: 15735400536
 * @Date: 2020/11/19 0:01
 */
public class Product extends BaseEntity {

    private String code;

    private String name;

    @ManyToOne
    private ProductClass productClass;

    /**
     * 功能描述: 是否冻结
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/19 0:02
     */
    private Integer isFreeze;

    @ManyToOne
    private ProductRouteLine routeLine;

    private String routeLineCode;

    private String routeLineId;

    @ManyToOne
    private OrderBom orderBom;

    private String orderBomCode;

    @ManyToOne
    private Materials materials;

    private String mrlCode;

    @ManyToOne
    private Factory factory;

    private String factoryCode;

    private String productType;

    @ManyToOne
    private MeasureUnit unit;

    public ProductClass getProductClass() {
        return productClass;
    }

    public void setProductClass(ProductClass productClass) {
        this.productClass = productClass;
    }

    public Integer getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(Integer isFreeze) {
        this.isFreeze = isFreeze;
    }

    public ProductRouteLine getRouteLine() {
        return routeLine;
    }

    public void setRouteLine(ProductRouteLine routeLine) {
        this.routeLine = routeLine;
    }

    public String getRouteLineCode() {
        return routeLineCode;
    }

    public void setRouteLineCode(String routeLineCode) {
        this.routeLineCode = routeLineCode;
    }

    public String getRouteLineId() {
        return routeLineId;
    }

    public void setRouteLineId(String routeLineId) {
        this.routeLineId = routeLineId;
    }

    public OrderBom getOrderBom() {
        return orderBom;
    }

    public void setOrderBom(OrderBom orderBom) {
        this.orderBom = orderBom;
    }

    public String getOrderBomCode() {
        return orderBomCode;
    }

    public void setOrderBomCode(String orderBomCode) {
        this.orderBomCode = orderBomCode;
    }

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    public String getMrlCode() {
        return mrlCode;
    }

    public void setMrlCode(String mrlCode) {
        this.mrlCode = mrlCode;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public MeasureUnit getUnit() {
        return unit;
    }

    public void setUnit(MeasureUnit unit) {
        this.unit = unit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
