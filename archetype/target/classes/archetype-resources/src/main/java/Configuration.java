package $package;

import com.mlesniak.runner.RunnerConfiguration;

public class Configuration extends RunnerConfiguration {
    private String example;
    
    public String getExample() {
        return example;
    }

    public static Configuration get() {
        return (Configuration) RunnerConfiguration.get();
    }
}
