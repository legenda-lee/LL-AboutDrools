package com.legenda.lee.studydrools.service;

import org.drools.*;


/**
 * 规则有了，交互的对象也有了，我们需要实现一个workingMemory来装载这些对象进行运算。在Drools5 当中提供了两个对象与规则引擎进行交互：StatefulKnowledgeSession
 *
 * 和StatelessKnowledgeSession。本例中使用了StatefulKnowledgeSession进行交互。
 *
 * 前面说过一个RuleBase可以同时初始化多个Working Memory，而RuleBase是通过Drools中的
 *
 * RuleBaseFactory产生的。我们先定义一个工厂类用于获取单例的RuleBase。
 *
 *
 * @author Legenda-Lee
 * @date 2019-12-26 16:54
 * @description 单实例RuleBase生成工具
 * @since 1.0.0
 */
public class RuleBaseSingleton {

    private RuleBaseSingleton() {

    }

    private static RuleBase ruleBase;


    public static RuleBase getRuleBase(){
        return null != ruleBase ? ruleBase : RuleBaseFactory.newRuleBase();
    }

}
