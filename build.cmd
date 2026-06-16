@echo off
set "JAVAFX_LIB=%~dp0javafx-sdk\lib"
javac --module-path "%JAVAFX_LIB%" --add-modules javafx.controls,javafx.fxml Main.java

