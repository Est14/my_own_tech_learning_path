class Stack{
    
    constructor(){
        this.top = -1;
        this.storage = {};
    }

    // Add a value onto the end of the stack
    push(value){
        this.top += 1;
        this.storage[this.top] = value;
    }

    // Remove a value from the end of the stack
    pop(){
        if (this.top === -1){
            return undefined;
        }else{
            delete this.storage[this.top];
            this.top -= 1;
        }
    }

    size(){
        return this.top + 1;
    }

    // Returns the value at the end of the stack
    peek(){
        return this.storage[this.top]
    }
}

var myStack = new Stack();

myStack.push(1);
myStack.push(2);
console.log(myStack.peek());
myStack.pop();
console.log(myStack.peek());
myStack.push('airplane');
console.log(myStack.size());
console.log(myStack.peek());
myStack.pop();
console.log(myStack.peek());

