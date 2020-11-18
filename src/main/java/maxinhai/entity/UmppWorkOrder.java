package maxinhai.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "UMPP_WORK_ORDER")
public class UmppWorkOrder extends BaseEntity {

    /**
     * 功能描述: 工单号
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:47
     */
    private String code;

    /**
     * 功能描述: 对应订单
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:48
     */
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = UmppPlanOrder.class)
    @JoinColumn(name = "ORDER_GID")
    private UmppPlanOrder parentOrder;

    /**
     * 功能描述: 顶层工单
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:48
     */
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = UmppWorkOrder.class)
    @JoinColumn(name = "WORK_ORDER_GID")
    private UmppWorkOrder workOrder;

    /**
     * 功能描述: 对应派工单
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:48
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "work_order", targetEntity = UmppTaskOrder.class)
    private List<UmppTaskOrder> taskOrderList;

    private BigDecimal qty;

    /**
     * 功能描述: 计划开始时间
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:50
     */
    private Date planBeginDate;

    /**
     * 功能描述: 计划结束时间
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:50
     */
    private Date planEndDate;

    /**
     * 功能描述: 顶层工单号
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:50
     */
    private String rootCode;

    /**
     * 功能描述: 产品编码
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:53
     */
    private String productCode;

    /**
     * 功能描述: 产品名称
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:53
     */
    private String productName;

    /**
     * 功能描述: 产品类型
     * 成品、半成品、原料
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:53
     */
    private String productType;

    /**
     * 功能描述: 工单性质
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:53
     */
    private Integer nature;

    /**
     * 功能描述: 物料清单编码
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:53
     */
    private String bomCode;

    /**
     * 功能描述: 物料清单版本
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:53
     */
    private String bomVersion;

    /**
     * 功能描述: 生产状态
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:53
     */
    private Integer produceState;

    /**
     * 功能描述: 项目号
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:55
     */
    private String proNum;

    private Date scheduledBeginDate;// 排程开工时间

    private Date scheduledEndDate;// 排程完工时间

    public Date getScheduledBeginDate() {
        return scheduledBeginDate;
    }

    public void setScheduledBeginDate(Date scheduledBeginDate) {
        this.scheduledBeginDate = scheduledBeginDate;
    }

    public Date getScheduledEndDate() {
        return scheduledEndDate;
    }

    public void setScheduledEndDate(Date scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UmppPlanOrder getParentOrder() {
        return parentOrder;
    }

    public void setParentOrder(UmppPlanOrder parentOrder) {
        this.parentOrder = parentOrder;
    }

    public UmppWorkOrder getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(UmppWorkOrder workOrder) {
        this.workOrder = workOrder;
    }

    public List<UmppTaskOrder> getTaskOrderList() {
        return taskOrderList;
    }

    public void setTaskOrderList(List<UmppTaskOrder> taskOrderList) {
        this.taskOrderList = taskOrderList;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
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

    public String getRootCode() {
        return rootCode;
    }

    public void setRootCode(String rootCode) {
        this.rootCode = rootCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
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

    public Integer getProduceState() {
        return produceState;
    }

    public void setProduceState(Integer produceState) {
        this.produceState = produceState;
    }

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum;
    }
}
