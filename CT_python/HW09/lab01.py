from tkinter import *

def process():
    e3.delete(0,'end')
    price = float(e1.get())
    many = int(e2.get())
    total = price*many
    e3.insert(0, str(total))
    
   
window  = Tk()
l1 = Label(window, text="가격")
l2 = Label(window, text="갯수")
l3 = Label(window, text="총액")
l1.grid(row=0, column=0)
l2.grid(row=1, column=0)
l3.grid(row=2, column=0)
e1 = Entry(window, bg = "yellow")
e2 = Entry(window, bg = "yellow")
e3 = Entry(window, bg = "yellow")
e1.grid(row=0, column=1)
e2.grid(row=1, column=1)
e3.grid(row=2, column=1)
button = Button(window, text="계산", command=process)
button.grid(row=3, column=1)
window.mainloop()

