## Getting Started
Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure
The workspace contains two folders by default, where:

src: the folder to maintain sources
lib: the folder to maintain dependencies
Meanwhile, the compiled output files will be generated in the bin folder by default.

If you want to customize the folder structure, open .vscode/settings.json and update the related settings there.

## Dependency Management
The JAVA PROJECTS view allows you to manage your dependencies. More details can be found here.

## Key Differences Between Swing and JavaFX
Import Statements
Swing uses imports from javax.swing.* and java.awt.*.
JavaFX uses imports from javafx.application.*, javafx.scene.*, javafx.scene.control.*, javafx.scene.layout.*, and javafx.stage.*.
Main Class and Entry Point
## Swing uses a main method to set up and display the UI components directly.
### JavaFX requires extending the Application class and overriding the start method. The main method calls launch(args) to start the application.
Creating Components
In Swing, components like JFrame, JLabel, and JButton are instantiated and added to a JPanel.
In JavaFX, components like Label and Button are instantiated and added to a StackPane.
Layout Management
Swing uses layout managers like BorderLayout.
JavaFX uses layout panes like StackPane.
Stage and Scene
JavaFX introduces the concept of a Stage (equivalent to Swing’s JFrame) and a Scene (which holds all the UI elements). The Scene is set on the Stage.
Application Lifecycle

In Swing, the application lifecycle is managed manually within the main method.
In JavaFX, the application lifecycle is managed by the framework, and the start method is the entry point for initializing the UI.
These differences illustrate the different approaches taken by Swing and JavaFX in handling UI components, layouts, and the application lifecycle.

