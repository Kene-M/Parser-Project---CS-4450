import sys
from io import StringIO
from antlr4 import *
from MiniPyCodeLexer import MiniPyCodeLexer
from CustomMiniPyCodeLexer import CustomMiniPyCodeLexer
from MiniPyCodeParser import MiniPyCodeParser
from antlr4.tree.Trees import Trees

filepath = "./project_deliverable_3.py"

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

def dump(node, depth=0, ruleNames=None):
    depthStr = '. ' * depth
    if isinstance(node, TerminalNode):
        print(f'{depthStr}Terminal: {node.getText()}')
    else:
        print(f'{depthStr}{Trees.getNodeText(node, ruleNames)}'+ ':')
        for child in node.children:
            dump(child, depth + 1, ruleNames)

def main():
	#code = ""
	#s = InputStream(code)
    # OR you can use a FileStream
    s = FileStream(filepath)
    
    #lexer = CustomMiniPyCodeLexer(s)
    lexer = MiniPyCodeLexer(s)
    stream = CommonTokenStream(lexer)
    parser = MiniPyCodeParser(stream)
	
    try:
        tree = parser.prog()
        if parser.getNumberOfSyntaxErrors() == 0:
            print("Parse tree:")
            #print_tree(tree)
            dump(tree, ruleNames=parser.ruleNames)
            
    except Exception as e:
        print(f"Parsing failed: {e}")

main()


# Code to parse.
"""assign1 = "20"
assign2 = 123
assign3 = 1.23
assign4 = assign1

arith_op1 = 1 + 2
arith_op2 = 13 - 3
arith_op3 = 10 / arith_op1
# Deliverable 1
arith_op4 = 4.2 * 10
arith_op5 = arith_op1 % arith_op2

arith_op1 += arith_op2
arith_op2 -= arith_op3
arith_op3 *= arith_op4
arith_op4 /= arith_op5

array1 = [1, 2, 3, 4, 5]
array2 = ['a', 'b', 'c']
array3 = [1.6, 2.7, 3.8, 4.9, 5.0]

var1 = 10
var2 = var1/2 + 5
var3 = var2 % 2
var4 = 1

flag = True

assign1 = ""

# Deliverable 2

if var1 > var2:
	arith_op1 = 1 + 2
	assign1 = "text data"

if var1 <= var2 and var3 == var4:
	arith_op1 = 1 + 2
	assign1 = "text data"
else:
	arith_op4 = 4.2 * 10
	arith_op3 *= arith_op4
	
data = 0

if var1 != var2 or var3 >= var4:
	flag = True
elif (not flag) and var3 > 10:
	flag = False
else:
	data = -1

# Deliverable 3

## comment test 1

''' 
	comment test 2
	adding more comments
	and more...
'''

while data > 0 or data != 0:
	data = data - 1
	if True:
		a = "This is the weirdest code I have ever written"

for data in array1:
	if data < 0:
		while(data != 0):
			b = "This code doesn't make any sense"
			data = data + 1
	elif data > 0:
		while(data != 0):
			c = "I feel like I have no purpose..."
			data = data - 1

for i in range(0,5):
	data = data * 2
	data = data - 1

''' I need help, this code shouldn't even exist '''
while True:
	data = 30
	data = data - 1"""

