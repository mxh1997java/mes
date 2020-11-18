package maxinhai.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "MBF_ROUTE_OPERATION")
public class RouteOperation extends BaseEntity {

    /**
     * 功能描述: 工序编码
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:25
     */
    private String code;

    /**
     * 功能描述: 工序名称
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:26
     */
    private String name;

    /**
     * 功能描述: 工序产能
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:19
     */
    private BigDecimal opCapacity;

    /**
     * 功能描述: 工艺路线
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:25
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROUTE_LINE_GID")
    private RouteLine routeLine;

    /**
     * 功能描述: 工序顺序
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:20
     */
    private String opSeq;

    /**
     * 功能描述: 生产节拍
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:25
     */
    private BigDecimal cycleTime;

    /**
     * 功能描述: 提前期
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:25
     */
    private BigDecimal queueTime;

    /**
     * 功能描述: 工序模板
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:23
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEF_OP_GID")
    private MbfDefOperation defOp;

    /**
     * 功能描述: 工时
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:23
     */
    private BigDecimal workTime;

    private Integer controlCode; // 控制码

    /**
     * 功能描述: 是否关键工序
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:25
     */
    private Integer isKeyOp;

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

    public BigDecimal getOpCapacity() {
        return opCapacity;
    }

    public void setOpCapacity(BigDecimal opCapacity) {
        this.opCapacity = opCapacity;
    }

    public RouteLine getRouteLine() {
        return routeLine;
    }

    public void setRouteLine(RouteLine routeLine) {
        this.routeLine = routeLine;
    }

    public String getOpSeq() {
        return opSeq;
    }

    public void setOpSeq(String opSeq) {
        this.opSeq = opSeq;
    }

    public BigDecimal getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(BigDecimal cycleTime) {
        this.cycleTime = cycleTime;
    }

    public BigDecimal getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(BigDecimal queueTime) {
        this.queueTime = queueTime;
    }

    public MbfDefOperation getDefOp() {
        return defOp;
    }

    public void setDefOp(MbfDefOperation defOp) {
        this.defOp = defOp;
    }

    public BigDecimal getWorkTime() {
        return workTime;
    }

    public void setWorkTime(BigDecimal workTime) {
        this.workTime = workTime;
    }

    public Integer getControlCode() {
        return controlCode;
    }

    public void setControlCode(Integer controlCode) {
        this.controlCode = controlCode;
    }

    public Integer getIsKeyOp() {
        return isKeyOp;
    }

    public void setIsKeyOp(Integer isKeyOp) {
        this.isKeyOp = isKeyOp;
    }
}
