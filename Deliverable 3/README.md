# CS 4450 Parser Project
## Project Details
### Overview
This project involves implementing a Python parser using ANTLR 4.13.2 and Python 3.x. The parser is designed to generate a parse tree for specific Python language features, as described in the project requirements. The primary goal is to showcase the parsing of Python syntax constructs while adhering to indentation sensitivity.

### Team Members
* Isaiah Shavers
* Kene Maduabum
* Cooper Mathisen
* Sydney Poulsen
* Caleb Harris

## Installation and Setup
### Requirements
* Python 3.x
* ANTLR version 4.13.2

### How to Install (Python Based Installation)
* Make sure you have Python3 installed.
* **Open a terminal or command prompt, and run the following command to install antlr-tools**: *pip install antlr4-tools* (includes ANTLR and automatically installs Java if needed) .
* **Add the directory where the Python scripts are installed to your system's PATH**:
  * **Find out where Python is installed on your system, you can run**: *python -m site --user-base* (Example: C:\Users\madua\AppData\Local\Packages\PythonSoftwareFoundation.Python.3.11_qbz5n2kfra8p0\LocalCache\local-packages)
  * Locate the Scripts Directory. Example: C:\Users\madua\AppData\Local\Packages\PythonSoftwareFoundation.Python.3.11_qbz5n2kfra8p0\LocalCache\local-packages\Python311 (The Scripts folder should be located inside this directory. The antlr4 should be in the Scripts subfolder)
  * **Add the Python Scripts folder to your system's PATH by modifying the PATH variable for your user account**: *setx PATH "%PATH%;C:\Users\madua\AppData\Local\Packages\PythonSoftwareFoundation.Python.3.11_qbz5n2kfra8p0\LocalCache\local-packages\Python311\Scripts"*
* Close the current Command Prompt and open a new one to apply the changes.
* **Run the command**: *antlr4* (This will prompt you to install Java 11 if it’s not already installed. If prompted, allow the automatic installation of Java. Once this is set, you can use the antlr4 and antlr4-parse commands directly from your terminal.)
* **To use the generated Python code from your .g4 files, you will need to install the ANTLR4 Python runtime**:  *pip install antlr4-python3-runtime*

### How to Run
* Download or clone the repository to your system.
* Open a terminal or command prompt.
* **Navigate to the project folder**: *cd path-to-project/deliverable 3*
* **Generate parser files (or skip if you want to use what is provided)**: *antlr4 -Dlanguage=Python3 MiniPyCode.g4*
* **Run the driver code, which parses a python text and prints a tree**: *python Driver.py*
* Compare the output with the parse tree text document provided.
