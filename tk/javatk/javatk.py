# # # # from ttkwidgets.autocomplete import AutocompleteEntry
# # # # from tkinter import *

# # # # countries = [
# # # #         'Antigua and Barbuda', 'Bahamas','Barbados','Belize', 'Canada',
# # # #         'Costa Rica ', 'Cuba', 'Dominica', 'Dominican Republic', 'El Salvador ',
# # # #         'Grenada', 'Guatemala ', 'Haiti', 'Honduras ', 'Jamaica', 'Mexico',
# # # #         'Nicaragua', 'Saint Kitts and Nevis', 'Panama ', 'Saint Lucia',
# # # #         'Saint Vincent and the Grenadines', 'Trinidad and Tobago', 'United States of America'
# # # #         ]

# # # # ws = Tk()
# # # # ws.title('PythonGuides')
# # # # ws.geometry('400x300')
# # # # ws.config(bg='#f25252')

# # # # frame = Frame(ws, bg='#f25252')
# # # # frame.pack(expand=True)

# # # # Label(
# # # #     frame,
# # # #     bg='#f25252',
# # # #     font = ('Times',21),
# # # #     text='Countries in North America '
# # # #     ).pack()

# # # # entry = AutocompleteEntry(
# # # #     frame,
# # # #     width=30,
# # # #     font=('Times', 18),
# # # #     completevalues=countries
# # # #     )
# # # # entry.pack()

# # # # ws.mainloop()


import os
import io
from tkinter import *
from tkinter.filedialog import askopenfilename, asksaveasfilename
import subprocess
import threading
from turtle import left, right
import time

window = Tk()
window.title('My Custom IDE')

gpath = ''
runThread = threading.Thread()


lboxframe = Frame(window)
lboxframe.pack(side = LEFT, fill = 'y')
lbox = Listbox(lboxframe)
lbox.pack(fill = 'y')

lboxscrollbar = Scrollbar(lboxframe, orient="vertical")
lboxscrollbar.config(command=lbox.yview)
lboxscrollbar.pack(side="right", fill="y")

lbox.config(yscrollcommand=lboxscrollbar.set)
 
# THE ITEMS INSERTED WITH A LOOP
flist = os.listdir()
for item in flist:
    lbox.insert(END, item)
 
 
def showcontent(event):
    x = lbox.curselection()[0]
    file = lbox.get(x)
    gpath = file
    with open(file) as file:
        file = file.read()
    textEditor.delete('1.0', END)
    textEditor.insert(END, file)
 
lbox.bind("<<ListboxSelect>>", showcontent)




def read_from_stdout(buffer,handle):
    try:
        while True:
            buffer.write(handle.read(1))
    except ValueError as e: # when reading from closed file
        pass

def executeThread():
    out_buff = io.StringIO()
    with subprocess.Popen(['java', 'asd.java'],
                        stdin=subprocess.PIPE,stdout=subprocess.PIPE,stderr=subprocess.STDOUT,
                        text=True) as proc:
        thread = threading.Thread(target=read_from_stdout,args=(out_buff,proc.stdout))
        thread.start()
        while proc.poll() is None:
            time.sleep(1)  # wait for stdout to be read

            in_val = input.get("1.0", "end")
            print(in_val)
            out_buff.write(in_val)
            print(out_buff.getvalue())
            # output.delete("1.0", "end")
            input.delete("1.0", "end")
            output.insert("end", out_buff.getvalue())
            proc.stdin.write(in_val)
            proc.stdin.flush()  # required
            time.sleep(1)
            # out_buff = io.StringIO()
    print(out_buff.getvalue()) #out_buff is cumulative
    output.insert('1.0', out_buff.getvalue())


def runMyCode(event):
    global gpath
    print(gpath)
    if gpath == '':
        saveMsg = Toplevel()
        msg = Label(saveMsg, text="Please save the file first")
        msg.pack()
        return
    command = input.get('1.0', 'end')
    if command == 'exit':
        exit()
    print(command)
    # process = subprocess.check_output( [ 'java', 'asd.java' ], input=command.encode())
    # output.delete("1.0", "end")
    # input.delete("1.0", "end")
    # output.insert('1.0', process)
    thread = threading.Thread(target=executeThread)
    thread.start()

    # command = f'java {gpath}'
    # command = f'java asd.java'


def openMyFile():
    path = "asd.java"
    # path = askopenfilename(filetypes=[('Python Files','*.java')])
    with open(path, 'r') as file:
        code = file.read()
        textEditor.delete('1.0', END)
        textEditor.insert('1.0', code)
        global gpath
        gpath = path


def saveMyFileAs(event):
    global gpath
    print("key bound")
    if gpath == '':
        path = asksaveasfilename(filetypes=[('Python Files', '*.py')])
    else:
        path = gpath
        print("path")
    with open(path, 'w') as file:
        code = textEditor.get('1.0', END)
        file.write(code)
        print("wrote")


textEditor = Text()
textEditor.config(bg='#362f2e', fg='#d2ded1', insertbackground='white')
textEditor.pack()

output = Text(height=7)
output.config(bg='#362f2e', fg='#1dd604')
output.pack()

input = Text(height=2)
input.config()
input.pack()

textEditor.bind('<Shift-Return>', runMyCode)
textEditor.bind('<Key>', saveMyFileAs)

menuBar = Menu(window)

fileBar = Menu(menuBar, tearoff=0)
fileBar.add_command(label='Open', command=openMyFile)
fileBar.add_command(label='Save', command=lambda: saveMyFileAs("foo"))
fileBar.add_command(label='SaveAs', command=lambda: saveMyFileAs("foo"))
fileBar.add_command(label='Exit', command=exit)
menuBar.add_cascade(label='File', menu=fileBar)

runBar = Menu(menuBar, tearoff=0)
runBar.add_command(label='Run', command=lambda: runMyCode("foo"))
menuBar.add_cascade(label='Run', menu=runBar)

openMyFile()

window.config(menu=menuBar)
window.mainloop()









# import subprocess
# cmd = 'java asd.java'
# proc = subprocess.Popen(cmd, shell=True)
# outputResult, error = proc.communicate()
# print(outputResult)


# def executeThread(command):
#     process = subprocess.Popen(
#         command, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)

#     outputResult, error = process.communicate()
#     print(outputResult)
#     output.delete("1.0", "end")
#     output.insert('1.0', outputResult)
#     output.insert('1.0', error)