package com.legenda.lee.studydrools.service;

import org.drools.RuleBase;
import org.drools.SessionConfiguration;
import org.drools.StatefulSession;
import org.drools.StatelessSession;
import org.drools.definition.type.FactType;
import org.drools.event.RuleBaseEventListener;
import org.drools.rule.Package;
import org.drools.runtime.Environment;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.List;

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
public class RuleBaseFactory {

    private static RuleBase ruleBase;


    public static RuleBase getRuleBase(){
        return null != ruleBase ? ruleBase : RuleBaseFactory.newRuleBase();
    }

    public static RuleBase newRuleBase(){
        return new RuleBase() {
            @Override
            public void addEventListener(RuleBaseEventListener ruleBaseEventListener) {

            }

            @Override
            public void removeEventListener(RuleBaseEventListener ruleBaseEventListener) {

            }

            @Override
            public List<RuleBaseEventListener> getRuleBaseEventListeners() {
                return null;
            }

            @Override
            public void writeExternal(ObjectOutput out) throws IOException {

            }

            @Override
            public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

            }

            @Override
            public StatelessSession newStatelessSession() {
                return null;
            }

            @Override
            public StatefulSession newStatefulSession() {
                return null;
            }

            @Override
            public StatefulSession newStatefulSession(boolean b) {
                return null;
            }

            @Override
            public StatefulSession newStatefulSession(InputStream inputStream) {
                return null;
            }

            @Override
            public StatefulSession newStatefulSession(InputStream inputStream, boolean b) {
                return null;
            }

            @Override
            public StatefulSession newStatefulSession(SessionConfiguration sessionConfiguration, Environment environment) {
                return null;
            }

            @Override
            public Package[] getPackages() {
                return new Package[0];
            }

            @Override
            public Package getPackage(String s) {
                return null;
            }

            @Override
            public void addPackages(Package[] packages) {

            }

            @Override
            public void addPackage(Package aPackage) {

            }

            @Override
            public void lock() {

            }

            @Override
            public void unlock() {

            }

            @Override
            public int getAdditionsSinceLock() {
                return 0;
            }

            @Override
            public int getRemovalsSinceLock() {
                return 0;
            }

            @Override
            public void removePackage(String s) {

            }

            @Override
            public void removeRule(String s, String s1) {

            }

            @Override
            public void removeQuery(String s, String s1) {

            }

            @Override
            public void removeFunction(String s, String s1) {

            }

            @Override
            public void removeProcess(String s) {

            }

            @Override
            public StatefulSession[] getStatefulSessions() {
                return new StatefulSession[0];
            }

            @Override
            public FactType getFactType(String s) {
                return null;
            }
        };
    }

}
