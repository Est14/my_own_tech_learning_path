class Set{

    constructor(){
        this.top = -1;
        this.storage = [];
    }

    push(value){
        if (this.storage.includes(value))
            return;
        else{
            this.top++;
            this.storage[this.top] = value;
        }
    }

    pop(){
        if (this.top === -1)
            return undefined
        else
            delete this.storage[this.top];
            this.top--;
    }

    peek(){
        return this.storage[this.top]
    }

    size(){
        return this.top + 1;
    }
}

var myStack = new Set();

myStack.push('Rock');
myStack.push('Rock');
console.log(myStack.size());
myStack.push('Classic');
myStack.push('Electronic');
console.log(myStack.size());
myStack.pop()
console.log(myStack.size());
console.log(myStack.peek());
