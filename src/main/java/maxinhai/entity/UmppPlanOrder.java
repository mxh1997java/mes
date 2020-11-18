package maxinhai.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "UMPP_PLAN_ORDER")
public class UmppPlanOrder extends BaseEntity {

    /**
     * 功能描述: 订单编码
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:44
     */
    @Column(name = "CODE", length = 50)
    private String code;

    /**
     * 功能描述: 产品类型
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:44
     */
    private String productType;

    /**
     * 功能描述: 产品编码
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:44
     */
    private String productCode;

    /**
     * 功能描述: 物料清单编码
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:45
     */
    private String bomCode;

    /**
     * 功能描述: bom版本
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:42
     */
    private String bomVersion;

    /**
     * 功能描述: 物料编码
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:42
     */
    private String mrlCode;

    /**
     * 功能描述: 工艺路线编码
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:42
     */
    private String routeLineCode;

    /**
     * 功能描述: 工艺路线id
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:43
     */
    private String routeLineId;

    /**
     * 功能描述: 图纸版本
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:42
     */
    private String drawingVersion;


    /**
     * 功能描述: 产品物料
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:36
     */
    @ManyToOne
    private Materials materials;

    /**
     * 功能描述: 数量
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:36
     */
    private BigDecimal qty;

    /**
     * 功能描述: 工艺路线
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:36
     */
    @ManyToOne
    private ProductRouteLine routeLine;

    /**
     * 功能描述: 物料清单
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:36
     */
    @ManyToOne
    private ProductOrderBom orderBom;

    /**
     * 功能描述: 计划开始时间
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:37
     */
    private Date planBeginDate;

    /**
     * 功能描述: 计划结束时间
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:37
     */
    private Date planEndDate;

    /**
     * 功能描述: 订单性质
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:38
     */
    private Integer nature;

    /**
     * 功能描述: 订单对应的工单
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:39
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", targetEntity = UmppWorkOrder.class)
    private List<UmppWorkOrder> workOrderList;

    /**
     * 功能描述: 订单优先级
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:45
     */
    private Integer priority;

    /**
     * 功能描述: 项目号
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:55
     */
    private String proNum;

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getBomCode() {
        return bomCode;
    }

    public void setBomCode(String bomCode) {
        this.bomCode = bomCode;
    }

    public String getBomVersion() {
        return bomVersion;
    }

    public void setBomVersion(String bomVersion) {
        this.bomVersion = bomVersion;
    }

    public String getMrlCode() {
        return mrlCode;
    }

    public void setMrlCode(String mrlCode) {
        this.mrlCode = mrlCode;
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

    public String getDrawingVersion() {
        return drawingVersion;
    }

    public void setDrawingVersion(String drawingVersion) {
        this.drawingVersion = drawingVersion;
    }

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public ProductRouteLine getRouteLine() {
        return routeLine;
    }

    public void setRouteLine(ProductRouteLine routeLine) {
        this.routeLine = routeLine;
    }

    public ProductOrderBom getOrderBom() {
        return orderBom;
    }

    public void setOrderBom(ProductOrderBom orderBom) {
        this.orderBom = orderBom;
    }

    public Date getPlanBeginDate() {
        return planBeginDate;
    }

    public void setPlanBeginDate(Date planBeginDate) {
        this.planBeginDate = planBeginDate;
    }

    public Date getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Date planEndDate) {
        this.planEndDate = planEndDate;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public List<UmppWorkOrder> getWorkOrderList() {
        return workOrderList;
    }

    public void setWorkOrderList(List<UmppWorkOrder> workOrderList) {
        this.workOrderList = workOrderList;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
