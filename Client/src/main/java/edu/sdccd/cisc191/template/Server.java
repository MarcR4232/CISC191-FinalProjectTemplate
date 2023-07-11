package edu.sdccd.cisc191.template;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Vbox;
import javafx.stage.Stage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;


public class Server  extends  Application{
    private HashMap<String, User> userMap;
    private ArrayList<User> userList;
    private int[][] twoDimArray;
    private scanner scanner;
    public Server(){
        userMap = newHashMap<>();
        userList = new ArrayList<>();
        twoDimArray = new int[10][10];
        scanner = new Scanner(System.in);
    }

    public void createConsoleMenu() {
        System.out.println("Welcome to Console Menu");
        System.out.println("Set index value");
        System.out.println("Implement index value")
        System.out.println("Seek index of the value");
        System.out.println("Print values");
        System.out.println("Delete value at index");
        System.out.println("Expand the array");
        System.out.println("Reduce array size");
        System.out.println("FIN");
    }
    public void consoleInput(int decision)
    {
        switch (decision) {
            case 1:
                getValueAtIndex();
                break;

            case 2:
                setIndexValue();
                break;

            case 3:
                locateIndexofValue();

            case 4:
                printAllValues();
                break;

            case 5:
                deleteIndexValue();
                break;

            case 6:
                expandArray();
                break;
            case 7:
                shrinkArray();
                break;

            case 0:
                System.exit( int status:0);
                break;

            default:
                System.out.println("Not an option, return and retry please.");
                break;
        }
    }
    private void getValueAtIndex(){
        System.out.print("Enter row of index");
        int rows = scanner.nextInt();
        System.out.print("Enter column index"
        int columns = scanner.nextInt();
        if (isValidIndex(rows, columns)){
            int value = twoDimArray[rows][columns];
            System.out.println("The value at the index is (" + rows +", " +columns + "): " +value);
        }
        else{
            System.out.println("The input is invalid, sorry.")'
        }
    }
    private void setIndexValue(){
        System.out.print("Input row index");
        int rows = scanner.nextInt();
        System.out.print("Input column index");
        int columns = scanner.nextInt();
        if (isValidIndex(rows,columns))
        {
            twoDimArray[rows][columns] = value;
            System.out.println("The value at the set index (" + rows +", " +columns +").");
        }
        else
        {
            System.out.println("The input is not valid");
        }}
    private void locateIndexofValue(){
        System.out.print("Enter the value you are seeking");
        int value = scanner.nextInt();
        boolean found = false
        for(int rows = 0; rows < twoDimArray.length; rows++)
        {
            for (int columns = 0; columns < twoDimArray[rows].length;columns++)
            {if(twoDimArray[rows][columns] == value){
                System.out.println("The value " +value + "has been found at index(" + rows + ", " +columns + ").");
                found = true;
            }
            }
        }
        if(!found){
            System.out.println("The value could not be located");
        }}
    private void printAllValues(){
        System.out.println("Welcome to Array Values");
        for (int rows = 0; rows< twoDimArray.length;rows++)
        {
            for(int columns = 0 ; columns <twoDimArray[rows].length;columns++)
            {
                System.out.print(twoDimArray[rows][columns] + " ");
            }
            System.out.println();
        }}

    private void deleteIndexValue(){
        System.out.print("Enter the row index please");
        int rows = scanner.nextInt();
        System.out.print("Enter the column index please");
        int columns = scanner.nextInt();
        if (isValidIndex(rows,columns))
        {
            twoDimArray[rows][columns] = 0;
            System.out.println("The value was deleted at index (" + rows + ", " +columns + ").");
        }
        else
        {
            System.out.println("Not a valid input, please retry.");}}

    private void expandArray(){
        int[][] newArray = new int[twoDimArray.length +1][twoDimArray[0].length + 1];
        for (int rows = 0; rows < twoDimArray.length; rows ++)
        {
            for (int columns = 0; columns < twoDimArray[rows].length; columns++){
                newArray[rows][columns] = twoDimArray[rows][columns];
            }}
        twoDimArray = newArray;
        System.out.println("The Array has been expanded.");}
    private void shrinkArray(){
        if (twoDimArray.length > 1 && twoDimArray[0].length > 1){
            int[][] newArray = new int[twoDimArray.length -1][twoDimArray[0].length -1];
            for(int rows = 0; rows < newArray.length; rows++){
                for (int columns = 0; columns < newArray[rows].length;columns++){
                    newArray[rows][columns] = twoDimArray[rows][columns]; }}
            twoDimArray = newArray;
            System.out.println("The Array has been shrunk");}
        else{
            System.out.println("Array has been shrunk to maximum size.");
        }}

    private boolean isValidIndex(int rows, int columns){
        return rows >= 0&& rows < twoDimArray.length && columns < twoDimArray[rows].length;}

    public static void main(String[] args) {
        {
            System.out.print("Input ur choice: ");
            int decision = server.scanner.nextInt();
            server.handleConsoleInput(decision);}
        launch(args);
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Welcome to the Console Menu");
        Vbox vbox = new Vbox();
        vbox.setSpacing(15);
        vbox.setPadding(new Insets(topRightBottomLeft:35));
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: White");

        label titleLabel= new Label(text: "Console Menu");
        titleLabel.setStyle("-fx-font: 100px Impact; -fx-font-size: 100px; -fx-font-weight: bold;");
        vbox.getChildren().add(titleLabel);
        vbox.setAlignment(Pos,Top_Center);

        Button getValueAtIndexBtn = new Button(text:"get the value at the index");
        getValueAtIndexBtn.setOnAction(e -> getValueAtIndexGUI());
        vbox.getChildren().add(getValueAtIndexBtn);
        getValueAtIndexBtn.setStyle("-fx-padding: 15px; -fx-border-color:gold; -fx-border-width: 1px; " + "-fx-background-color: white; -fx-text-fill: black; -fx-font:35px Impact;")

        Button setValueBtn = new Button(text:"set the value at the index");
        setValueBtn.setOnAction(e -> setValueAtIndexGUI());
        vbox.getChildren().add(getValueBtn);
        setValueBtn.setStyle("-fx-padding: 15px; -fx-border-color:gold; -fx-border-width: 1px; " + "-fx-background-color: white; -fx-text-fill: black; -fx-font:35px Impact;");

        Button locateIndexBtn = new Button(text: "Locate Value at Index");
        locateIndexBtn.setOnAction(e -> locateIndexOfValueGUI());
        vbox.getChildren().add(locateIndexBtn);
        locateIndexBtn.setStyle("-fx-padding: 15px; -fx-border-color: gold; fx-border-width:1[x;" +
                "-fx-background-color: white; fx-text-fill: black -fx-font:35px Impact;");

        Button printAllBtn = new Button( text: "Print all values");
        printAllBtn.setOnAction(e -> printAllValuesGUI());
        vbox.getChildren().add(printAllBtn);
        printAllBtn.setStyle("-fx-padding: 15px; -fx-border-color: gold; fx-border-width:1[x;" +
                "-fx-background-color: white; fx-text-fill: black -fx-font:35px Impact;");

        Button deleteValueBtn = new Button(text: "Delete the value at Index");
        deleteValueBtn.setOnAction(e -> deleteIndexValueGUI());
        vbox.getChildren().add(deleteValueBtn);
        deleteValueBtn.setStyle("-fx-padding: 15px; -fx-border-color: gold; fx-border-width:1[x;" +
                "-fx-background-color: white; fx-text-fill: black -fx-font:35px Impact;");
        Button expandArrayBtn = new Button( text: "Expand the Array")
        expandArrayBtn.setOnAction( e -> expandArrayGUI());
        vbox.getChildren().add(expandArrayBtn);
        expandArrayBtn.setStyle("-fx-padding: 15px; -fx-border-color: gold; fx-border-width:1[x;" +
                "-fx-background-color: white; fx-text-fill: black -fx-font:35px Impact;");

        Button shrinkArrayBtn = new Button(text: "Shrink the array");
        shrinkArrayBtn.setOnAction( e -> shrinkArrayGUI());
        vbox.getChildren().add(shrinkArrayBtn);
        shrinkArrayBtn.setStyle("-fx-padding: 15px; -fx-border-color: gold; fx-border-width:1[x;" +
                "-fx-background-color: white; fx-text-fill: black -fx-font:35px Impact;");

        Scene scene = new Scene(vbox, width: 1800, height: 1200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void getValueAtIndexGUI(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Recieve Value");
        dialog.setHeaderText("Enter your Indexes");
        dialog.setContentText("Row:");
        Optional<String> rowResult =dialog.showAndWait();
        if(rowResult.isPresent()){
            dialog.setContentText("Column:");
            Optional<String> colResult = dialog.showAndWait();
            if( colResult.isPresent()){
                int rows = Integer.ParseInt(rowResult.get());
                int columns = Integer.parseInt(colResult.get());
                if (isValidIndex(rows,columns)){
                    int value = twoDimArray[rows][columns];
                    showAlert("Value at Index (" + rows + ", " + columns +"): " + value);
                }
                else{
                    showAlert("Invalid, please retry.");
                }}}}

    private void setValueAtIndexGUI(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Set Value");
        dialog.setHeaderText("Enter your Indexes");
        dialog.setContentText("Row:");
        Optional<String> rowResult =dialog.showAndWait();
        if(rowResult.isPresent()){
            dialog.setContentText("Column:");
            Optional<String> colResult = dialog.showAndWait();
            if( colResult.isPresent()){
                int rows = Integer.ParseInt(rowResult.get());
                int columns = Integer.parseInt(colResult.get());
                if (isValidIndex(rows,columns)){
                    int value = twoDimArray[rows][columns];
                    showAlert("Value set at Index:(" + rows + ", " + columns +"): " + value);
                }
                else{
                    showAlert("Invalid, please retry.");
                }}}
    }

    private void locateIndexOfValueGUI(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Locate the Index")
        dialog.setHeaderText("Enter your Indexes");
        dialog.setContentText("Value:")
        Optional<String> valueResult =dialog.showAndWait();
        if(valueResult.isPresent()){
            int value = Integer.parseInt(valueResult.get());
            boolean found = false;
            for (int rows = 0; rows < twoDimArray.length; rows ++)
            {
                for (int columns = 0; columns <twoDimArray[rows].length; columns++){
                    if (twoDimArray[rows][columns] == value) {
                        showAlert("The Value " + value + " has been found at index (" +rows + ", " + columns + ").");
                        found = true;
                    }}}
            if (!found){
                showAlert("Value could not be located");}}}

    private void printAllValuesGUI() {
        StringBuilder build = new StringBuilder();
        build.append("Array Values \n");
        for ( int rows = 0; rows < twoDimArray.length; rows++)
        {
            for (int columns =0; columns < twoDimArray[rows].length; columns++)
            {
                build.append((twoDimArray[rows][columns]).append(" ");
            }
            build.append("\n");
        }
        showAlert(build.toString());
    }
    private void deleteIndexValueGUI() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Delete Current Value");
        dialog.setHeaderText("Enter Index");
        dialog.setContentText("Row: ");
        Optional<String> rowResult = dialog.showAndWait();
        if (rowResult.isPresent())
        {
            dialog.setContentText("Column: ");
            Optional<String> colResult = dialog.showAndWait();
            if (colResult.isPresent())
            {
                int rows = Integer.parseInt(rowResult.get());
                int columns = Integer.parseInt(colResult.get());
                if (isValidIndex(rows,columns))
                {
                    twoDimArray[rows][columns] = 0
                    showAlert("The value deleted at index (" +rows + ", " + columns + ").");
                }
                else
                {
                    showAlert("The Input in invalid");
                }
            }}}

    private void expandArrayGUI() {
        int[] new Array = new int[twoDimArray.length + 1][twoDimArray[0].length + 1];
        for (int rows = 0; rows < twoDimArray.length; rows++)
        {
            for ( int columns = 0; columns < twoDimArray[rows].length; columns++)
            {
                newArrary[rows][columns] = twoDimArray[rows][columns]'
            }}
        twoDimArray = new Array;
        showAlert("Array has been expanded");
    }

    private void shrinkArrayGUI()
    {
        if (twoDimArray.length > 1 && twoDimArray[0].length > 1)
        {
            int[][] newArray = new int[twoDimArray.length -1][twoDimArray[0].length -1];
            for (int rows = 0; rows < newArray.length; rows++)
            {
                for (int columns = 0; columns < newArray[rows].length; columns++)
                {
                    newArray[rows][columns]= twoDimArray[rows][columns];
                }}
            twoDimArray = newArray;
            showAlert("Array has been shrunk");
        }
        else
        {
            showAlert("Array cannot be shrunk");
        }}

    private void showAlert(String mesage)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }}

class User implements Serializable
{
    private String name;
    public User(String name)
    { this.name = name;}
    public String getName() { return name;}}