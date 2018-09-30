# javaee8-war-archetype
Archetype to create a java EE 8 project.

## Install

To install the archetype on your local repository, run the following command:

    mvn install
  
## Creating a Project

To create a project, go to a folder where you will have the project and run the following command:

    mvn archetype:generate -DarchetypeGroupId=<custom-archetype group id>
           -DarchetypeArtifactId=<custom-archetype artifactid>
           -DarchetypeVersion=<custom-archetype version>
           -DgroupId=<new project Group Id>
           -DartifactId=<new project artifact Id>
