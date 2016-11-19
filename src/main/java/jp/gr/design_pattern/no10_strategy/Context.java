package jp.gr.design_pattern.no10_strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        setStrategy(strategy);
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public String contextMeshod() {
        return strategy.strategyMethod();
    }
}
