# DigiBP Camunda Boot Archetype

## Summary
These archetypes can be used to create a fresh Camunda Spring Boot project.  

## Creating a new Project
Create a new project using the archetype published here: https://digibp.github.io/digibp-archetype-camunda-boot

### Creating a Project in Maven
```text
mvn archetype:generate -DarchetypeCatalog=https://digibp.github.io/digibp-archetype-camunda-boot/archetype-catalog.xml
```
> Note: There is an [issue](https://issues.apache.org/jira/browse/ARCHETYPE-519) with the `maven-archetype-plugin` version `3.0.0` which affects the current version of IntelliJ as well. To avoid this issue the following command can be used: 
```text
mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate -DarchetypeCatalog=https://digibp.github.io/digibp-archetype-camunda-boot/archetype-catalog.xml
```

### Creating a Project in Eclipse

#### Add a Remote Archetype Catalog 
- Open `Window > Preferences`
- Go to `Maven > Archetypes` and select `Add Remote Catalog...`
- Set `Catalog File` to `https://digibp.github.io/digibp-archetype-camunda-boot/archetype-catalog.xml`
- Click `OK` so the Archetype catalog is added to the list

#### Creating a Project in Eclipse using the Catalog
- Create new project `File > New > Maven Project`
- Make sure `Create a simple project` option is not selected
- Click `Next` to navigate to `Select an Archetype` screen
- Select the `Remote https://digibp...` catalog from the `Catalog` dropdown 
- Select the latest archetype `digibp-archetype-camunda-boot` from the appearing list
- Click `Next` and create the project

### Creating a Project in IntelliJ
> Note: There is an [issue](https://issues.apache.org/jira/browse/ARCHETYPE-519) with the `maven-archetype-plugin` version `3.0.0` which affects the current version of IntelliJ. Please [creating a project in maven](#creating-a-project-in-maven).
- Create new project `File > New > Project`
- Click Maven on the left hand side of the new project dialog
- Check `Create from archetype`
- Note: If you are using the IntelliJ [Maven Archetype Catalogs](https://plugins.jetbrains.com/plugin/7965-maven-archetype-catalogs) plugin and adding the `Catalog File` `https://digibp.github.io/digibp-archetype-camunda-boot/archetype-catalog.xml`, the following steps can be avoided: 
    - Click the `Add Archetype` button
        - Set `Group Id` to `ch.fhnw.digibp.archetype`
        - Set `Artifact Id` to `digibp-archetype-camunda-boot`
        - Set `Version` to `<the latest release version>`
        - Set `Repository` to `https://digibp.github.io/digibp-archetype-camunda-boot`
- Select the latest archetype `digibp-archetype-camunda-boot` from the appearing list
- Click next and create the project

## Releases

### 1.0.3

Fixing the Maven issue

### 1.0.2

Fixing the Eclipse issue

### 1.0.1

Fixing the basic package

### 1.0.0

Initial version

## Maintainer
- [Andreas Martin](https://github.com/andreasmartin)

## License

- [Apache License, Version 2.0](https://github.com/DigiBP/digibp-archetype-camunda-boot/blob/master/LICENSE)
