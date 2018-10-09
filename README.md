# javaee8-war-archetype
Archetype to create a java EE 8 project.

## Install

To install the archetype on your local repository, run the following command:

    mvn install
  
## Creating a Project with your local archetype

To create a project, go to a folder where you will have the project and run the following command:

    mvn archetype:generate -DarchetypeGroupId=net.rhuanrocha -DarchetypeArtifactId=javaee8-war-archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=<new project Group Id> -DartifactId=<new project artifact Id>
    

## Creating a Project with archetype of Maven Central

To create a project, go to a folder where you will have the project and run the following command:

    mvn archetype:generate -DarchetypeGroupId=net.rhuanrocha -DarchetypeArtifactId=javaee8-war-archetype -DarchetypeVersion=1.0.2 -DgroupId=<new project Group Id> -DartifactId=<new project artifact Id>

