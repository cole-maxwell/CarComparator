# CarComparator
---- Program Description ----<br />

This program takes advantage of the java.util.Comparator class by implementing four<br />
comparator classes for the Car object - YearComparator, PriceComparator, MileageComparator,<br />
and ParetoComparator (which ranks a car based on both price and mileage metrics).<br />

---- Compile & Run ----<br />

Clone the repo, **_cd_** to **_/CarComparator_** and type **_ant -f build.xml_**.<br />

---- Prerequisite Steps & Environment Setup ----<br />

1. Install Ant from http://ant.apache.org/.
2. Configure your _ANT_HOME_ environment variable to reference the topmost directory of the Ant distribution.
3. Configure your _PATH_ environment variable to reference _ANT_HOME_ in a relative manner, by including _PATH=%ANT_HOME%\bin;_ for Windows or _PATH=$(ANT_HOME)/bin:_ for Linux.
4. Download the JUnit 5 JAR files from https://junit.org/junit5/.
5. Configure your _JUNIT_ environment variable to point to the directory containing those JAR files.

JUnit API JAR files:
* junit-jupitar-api.jar
* junit-jupitar-engine.jar
* junit-jupitar-params.jar
* apiguardian.jar
* opentest4j.jar

JUnit Platform JAR files:
* junit-platform-commons.jar
* junit-platform-engine.jar
* junit-platform.launcher.jar
* junit-platform-runner.jar:
* junit-platform-suite-api.jar
