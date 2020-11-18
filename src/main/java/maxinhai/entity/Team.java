package maxinhai.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 功能描述: 班组
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/17 23:20
 */
@Entity
@Table(name = "TEAM")
public class Team extends BaseEntity {
    private String code;

    private String name;

    @ManyToOne
    private TeamClass teamClass;

    public TeamClass getTeamClass() {
        return teamClass;
    }

    public void setTeamClass(TeamClass teamClass) {
        this.teamClass = teamClass;
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
