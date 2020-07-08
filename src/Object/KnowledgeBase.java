/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.util.ArrayList;

/**
 *
 * @author Welcome
 */
public class KnowledgeBase {
    private ArrayList<String> condition;
    private String rule;

    public KnowledgeBase(ArrayList<String> condition, String rule) {
        this.condition = condition;
        this.rule = rule;
    }

    public KnowledgeBase() {
    }

    public ArrayList<String> getCondition() {
        return condition;
    }

    public void setCondition(ArrayList<String> condition) {
        this.condition = condition;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "KnowledgeBase{" + "condition=" + condition.toString() + ", rule=" + rule + '}';
    }
    
}
