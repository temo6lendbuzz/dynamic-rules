package com.lendbuzz;

import com.lendbuzz.GreetingsModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;

@org.springframework.stereotype.Component("greetings")
public class GreetingsProcess extends org.kie.kogito.process.impl.AbstractProcess<com.lendbuzz.GreetingsModel> {

    @org.springframework.beans.factory.annotation.Autowired()
    public GreetingsProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public GreetingsProcess() {
    }

    @Override()
    public com.lendbuzz.GreetingsProcessInstance createInstance(com.lendbuzz.GreetingsModel value) {
        return new com.lendbuzz.GreetingsProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.lendbuzz.GreetingsProcessInstance createInstance(java.lang.String businessKey, com.lendbuzz.GreetingsModel value) {
        return new com.lendbuzz.GreetingsProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.lendbuzz.GreetingsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.lendbuzz.GreetingsModel value) {
        return new com.lendbuzz.GreetingsProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.lendbuzz.GreetingsModel createModel() {
        return new com.lendbuzz.GreetingsModel();
    }

    public com.lendbuzz.GreetingsProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.lendbuzz.GreetingsModel) value);
    }

    public com.lendbuzz.GreetingsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.lendbuzz.GreetingsModel) value);
    }

    public com.lendbuzz.GreetingsProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.lendbuzz.GreetingsProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.lendbuzz.GreetingsProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.lendbuzz.GreetingsProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("greetings", true);
        factory.name("greetings");
        factory.packageName("com.lendbuzz");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode1 = factory.startNode(1);
        startNode1.name("Start");
        startNode1.interrupting(false);
        startNode1.metaData("UniqueId", "_A731B2E1-1652-4365-9A7D-926E0D711288");
        startNode1.metaData("x", 104);
        startNode1.metaData("width", 56);
        startNode1.metaData("y", 198);
        startNode1.metaData("height", 56);
        startNode1.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode2 = factory.endNode(2);
        endNode2.name("End");
        endNode2.terminate(false);
        endNode2.metaData("UniqueId", "_F0A6DD51-1C3F-4A4A-B51D-199A5BEE6252");
        endNode2.metaData("x", 894);
        endNode2.metaData("width", 56);
        endNode2.metaData("y", 198);
        endNode2.metaData("height", 56);
        endNode2.done();
        factory.connection(1, 2, "_6CB9E722-AB69-4849-A494-5D38A9BC05F0");
        factory.validate();
        return factory.getProcess();
    }
}
