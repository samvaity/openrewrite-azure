# Azure Code Migration with OpenRewrite
This repository showcases the integration of OpenRewrite with Maven for code migration purposes.
The migration recipe is defined to transition from `azure-core` to `azure-core-v2` libraries.

## Setup

The migration recipe is defined in the `openrewrite-core` module as detailed below:
You can find the recipe configuration in the `rewrite.yml` file [here](https://github.com/samvaity/openrewrite-azure/blob/main/openrewrite-core/src/main/resources/META-INF/rewrite/rewrite.yml).

```yaml
### Recipe Configuration for OpenRewrite
type: specs.openrewrite.org/v1beta/recipe
name: com.azure.tools.openrewrite.core
displayName: Transition from azure-core to azure-core-v2
recipeList:
- org.openrewrite.java.ChangePackage:
    oldPackageName: com.azure
    newPackageName: io.clientcore
    recursive: true
```

## Usage
### Maven Plugin Configuration
The OpenRewrite Maven plugin is configured in the `openrewrite-core` module to run the migration recipe on the sample project
as follows:
```xml
<plugin>
    <groupId>org.openrewrite.maven</groupId>
    <artifactId>rewrite-maven-plugin</artifactId>
    <version>5.7.1</version>
    <configuration>
        <activeRecipes>
            <recipe>com.azure.tools.openrewrite.core</recipe>
        </activeRecipes>
    </configuration>
    <dependencies>
        <dependency>
            <groupId>com.azure.tools</groupId>
            <artifactId>openrewrite-core</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>
</plugin>
```
The plugin configuration is defined in the `pom.xml` file [here](https://github.com/samvaity/openrewrite-azure/blob/main/openrewrite-sample/pom.xml#L22).

## Execution
The `openrewrite-samples` module is configured to use the `openrewrite-maven-plugin` to run the OpenRewrite recipe on the sample project.
```xml
<configuration>
    <activeRecipes>
        <recipe>com.azure.tools.openrewrite.core</recipe>
    </activeRecipes>
</configuration>
```
### Dry Run
To run the OpenRewrite recipe in dry-run mode, execute the following command:
```shell
mvn rewrite:dryRun
```
This will generate a file `rewrite.patch` in `target/rewrite` directory.

### Run (apply changes)
To actually apply the changes to the sample project, execute the following command:
```shell
mvn rewrite:run
```

## Testing
Refer to [Recipe Testing](https://docs.openrewrite.org/authoring-recipes/recipe-testing) for information on testing the recipe with unit tests.

## Openrewrite Reference
- [Rewrite Recipe Starter](https://github.com/moderneinc/rewrite-recipe-starter):  Template for building your own recipe JARs
- [Best practices for writing recipes](https://docs.openrewrite.org/recipes/recipes/openrewritebestpractices)
- [Collaboration Proposal](https://github.com/openrewrite/collaboration-proposals/issues/new/choose): collaboration with OpenRewrite




