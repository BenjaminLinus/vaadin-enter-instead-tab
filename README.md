vaadin-enter-instead-tab
========================

Sample implementation of vaadin components, navigable by enter key. 
User can move from one component to the next using the enter key instead of tab. 
read more. Every component extends one of vaadin standard components and focus 
next field (on page) every time the user presses enter. 
Read more: http://alfrescodev.com/vaadin-enter-instead-tab

To compile, execute commands:

1: In project enter-bluring-field:

mvn clean package

2: In base project:

mvn clean install

3: In project enter-bluring-field-show:

mvn clean package
mvn jetty:run
