package com.legenda.lee.studydrools.service;

import com.legenda.lee.studydrools.fact.PointDomain;

/**
 * 接下来定义一个定义积分规则接口，里面包含了初始化RuleBase、workingMemory以及执行规则的方法。
 * <p>
 * PointRuleEngine.java
 *
 * @author Legenda-Lee
 * @date 2019-12-26 16:56
 * @description
 * @since 1.0.0
 */
public interface PointRuleEngine {

    /**
     * 初始化规则引擎
     */
    void initEngine();

    /**
     * 刷新规则引擎中的规则
     */
    void refreshEngineRule();

    /**
     * 执行规则引擎
     *
     * @param pointDomain 积分Fact
     */
    void executeRuleEngine(final PointDomain pointDomain);

}
