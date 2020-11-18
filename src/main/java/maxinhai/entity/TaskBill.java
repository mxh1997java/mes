package maxinhai.entity;

import javax.persistence.*;

/**
 * 功能描述: 传给ERP的派工单
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/18 22:33
 */
@Entity
@Table(name = "TASK_BILL")
public class TaskBill extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_GID")
    private UmppPlanOrder order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_ORDER_GID")
    private UmppWorkOrder workOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_ORDER_GID")
    private UmppTaskOrder taskOrder;

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

    public UmppTaskOrder getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(UmppTaskOrder taskOrder) {
        this.taskOrder = taskOrder;
    }
}
