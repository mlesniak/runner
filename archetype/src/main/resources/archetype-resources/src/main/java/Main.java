package $package;

import com.mlesniak.runner.BaseRunner;

public class Main extends BaseRunner {
    public static void main(String[] args) throws Exception {
        BaseRunner.initRunner(Configuration.class, "application", args);
        new Main().run();
    }

    private void run() throws Exception {
        info("Hello, world");
    }
}
