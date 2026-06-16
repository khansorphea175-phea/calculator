@echo off
set "JAVAFX_LIB=%~dp0javafx-sdk\lib"
java --module-path "%JAVAFX_LIB%" --add-modules javafx.controls,javafx.fxml Main
