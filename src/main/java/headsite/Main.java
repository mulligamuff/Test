package headsite;

import io.cucumber.core.cli.Main;

public class Main {
    public static void main(String[] args) {
        // Här kan du starta dina Cucumber-testfall eller annan funktionalitet om det behövs
        // Exempel:
        String[] cucumberArgs = { "--glue", "stepDefs", "path/to/your/feature/file.feature" };
        Main.run(cucumberArgs, Thread.currentThread().getContextClassLoader());
    }
}

