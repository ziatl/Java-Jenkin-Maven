package fr.zizoa.apprendre.architecture;

import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

public class ArchitectureTest extends ArchitectureTestConfig {

    @Test
    void cycleCheckOk() {
        slices().matching("fr.zizoa.apprendre(*)..")
                .should().beFreeOfCycles();
    }

}
