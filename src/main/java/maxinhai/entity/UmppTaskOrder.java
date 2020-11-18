package maxinhai.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "UMPP_TASK_ORDER")
public class UmppTaskOrder extends BaseEntity {

    /**
     * 功能描述: 项目号
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 22:55
     */
    private String proNum;

    private String code;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_GID")
    private UmppPlanOrder order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_ORDER_GID")
    private UmppWorkOrder workOrder;

    private String workOrderCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RouteOperation_GID")
    private RouteOperation operation;

    private BigDecimal qty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Equipment_GID")
    private Equipment equipment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Team_GID")
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Personnel_GID")
    private Personnel personnel;

    private Integer orderType;

    private String routeLineCode;

    private String opCode;

    private String opName;

    private String isOutsourcing;//是否委外(是,否)

    private String outSourcingSupplier;//委外供应商

    /**
     * 功能描述: 工序所需物料
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 23:05
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materials_GID")
    private Materials materials;

    private String rootCode;//顶层工单号

    private Date assignTime;//下达时间

    private Date lockTime;//锁定时间

    /**
     * 功能描述: 派工单状态
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 23:07
     */
    private Integer taskState;

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

    public UmppPlanOrder getOrder() {
        return order;
    }

    public void setOrder(UmppPlanOrder order) {
        this.order = order;
    }

    public UmppWorkOrder getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(UmppWorkOrder workOrder) {
        this.workOrder = workOrder;
    }

    public String getWorkOrderCode() {
        return workOrderCode;
    }

    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
    }

    public RouteOperation getOperation() {
        return operation;
    }

    public void setOperation(RouteOperation operation) {
        this.operation = operation;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getRouteLineCode() {
        return routeLineCode;
    }

    public void setRouteLineCode(String routeLineCode) {
        this.routeLineCode = routeLineCode;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public String getIsOutsourcing() {
        return isOutsourcing;
    }

    public void setIsOutsourcing(String isOutsourcing) {
        this.isOutsourcing = isOutsourcing;
    }

    public String getOutSourcingSupplier() {
        return outSourcingSupplier;
    }

    public void setOutSourcingSupplier(String outSourcingSupplier) {
        this.outSourcingSupplier = outSourcingSupplier;
    }

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    public String getRootCode() {
        return rootCode;
    }

    public void setRootCode(String rootCode) {
        this.rootCode = rootCode;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }
}
