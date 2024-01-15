# Java CSV to HTML Table Generator

A simple Java utility for converting CSV (Comma Separated Values) files into HTML tables.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)

## Overview

This Java program reads a CSV file and generates an HTML table, making it easy to display and share tabular data on web pages. The generated HTML can be embedded directly into HTML documents or used as a standalone table.

## Features

- Converts CSV to HTML table format.
- Configurable options for table styling and customization.
- Lightweight and easy to integrate into existing projects.
- Command-line interface for simple usage.

## Usage

1. Clone the repository:


2. Compile the Java source files:


3. Run the generator:


## Example

Consider the following CSV file (`data.csv`):

```code
 fileWriter = new FileWriter("assets/index.html"); //the location where html file is created
 Table table = new Table(fileWriter);
 table.writeHead(); //This should always be called
 table.createTableFromCSV("example.csv","Title of the Page");
 table.createTable(15);
 table.writeFooter(); //Run this function to finalize the html page and write the data
 fileWriter.close();
