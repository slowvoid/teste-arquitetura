import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class ArchitectureTest {
    @Test
    public void ControllerAccessModels() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("controllers", "models", "views");

        ArchRule rule = classes().that().haveNameMatching(".*Model")
                        .should().onlyHaveDependentClassesThat()
                        .resideInAPackage("controllers");

        rule.check(importedClasses);
    }

    @Test
    public void ControllersShouldBeInControllerPackage() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("controllers", "models", "views");

        ArchRule rule = classes().that().haveNameMatching(".*Controller")
                .should().resideInAPackage("controllers");

        rule.check(importedClasses);
    }
}
