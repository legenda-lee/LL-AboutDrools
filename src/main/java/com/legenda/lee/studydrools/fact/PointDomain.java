package com.legenda.lee.studydrools.fact;

import lombok.Data;

/**
 * 接下来进入Drools的运行阶段。首先需要说明Drools中一个比较重要的概念：fact对象。
 *
 * 在Drools 当中是通过向WorkingMemory中插入Fact对象的方式来实现规则引擎与业务数据的交互，
 * 对于Fact对象就是普通的具有若干个属性及其对应的getter与setter方法的JavaBean对象。
 * Drools除了可以接受用户在外部向WorkingMemory当中插入现成的Fact对象，
 * 还允许用户在规则文件当中定义一个新的Fact 对象, 在规则文件当中定义Fact 对象要以declare 关键字开头，
 * 以end 关键字结尾，中间部分就是该Fact 对象的属性名及其类型等信息的声明。
 *
 * 我们定义此例中的fact对象：PointDomain.java
 *
 * @author Legenda-Lee
 * @date 2019-12-26 16:47
 * @description 积分计算对象
 * @since 1.0.0
 */
@Data
public class PointDomain {
    // 用户名
    private String userName;

    // 是否当日生日
    private boolean birthDay;

    // 增加积分数目
    private long point;

    // 当月购物次数
    private int buyNums;

    // 当月退货次数
    private int backNums;

    // 当月购物总金额
    private double buyMoney;

    // 当月退货总金额
    private double backMondy;

    // 当月信用卡还款次数
    private int billThisMonth;



    /**
     * 记录积分发送流水，防止重复发放
     * @param userName 用户名
     * @param type 积分发放类型
     */
    public void recordPointLog(String userName, String type){
        System.out.println("增加对"+userName+"的类型为"+type+"的积分操作记录.");
    }


}
