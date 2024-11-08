import sys
from io import StringIO
from antlr4 import *
from MiniPyCodeLexer import MiniPyCodeLexer
from MiniPyCodeParser import MiniPyCodeParser
from antlr4.tree.Trees import Trees

filepath = "./project_deliverable_1.py"

"""
Recursively prints the parse tree in a detailed hierarchical format.

Parameters:
- node: The current node in the parse tree.
- indent: The string used for indentation.
- show_terminal: Boolean indicating whether to show terminal nodes.
"""
def print_tree(node, indent="", show_terminal=True):
    # Filter out unnecessary node types for better clarity
    if isinstance(node, TerminalNode):
        if show_terminal:
            print(f"{indent}Terminal: {node.getText()}")
        return

    # Print the current node with type and text
    node_info = f"{indent}{type(node).__name__}: {node.getText()}"
    print(node_info)

    # Recursively print children
    for child in Trees.getChildren(node):
        print_tree(child, indent + "    ", show_terminal)  # Increase indentation for children

def main():
	#code = ""
	#s = InputStream(code)
    # OR you can use a FileStream
    s = FileStream(filepath)
    
    lexer = MiniPyCodeLexer(s)
    stream = CommonTokenStream(lexer)
    parser = MiniPyCodeParser(stream)
	
    tree = parser.prog()
	
    if parser.getNumberOfSyntaxErrors() > 0:
        print("failed")
    else:
		#print(Trees.toStringTree(tree, ruleNames=parser.ruleNames))
        print_tree(tree)

main()


# Code to parse.
"""assign1 = "20"
assign2 = 123
assign3 = 1.23
assign4 = assign1

arith_op1 = 1 + 2
arith_op2 = 13 - 3
arith_op3 = 10 / arith_op1
arith_op4 = 4.2 * 10
arith_op5 = arith_op1 % arith_op2

arith_op1 += arith_op2
arith_op2 -= arith_op3
arith_op3 *= arith_op4
arith_op4 /= arith_op5

array1 = [1, 2, 3, 4, 5]
array3 = [1.6, 2.7, 3.8, 4.9, 5.0]

var1 = 10
var2 = var1/2 + 5
var3 = var2 % 2
var4 = 1

flag = True"""

