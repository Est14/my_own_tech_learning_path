class MyArray {

    constructor(){
        this.length = 0;
        this.data = [];
    }
    get(idx){
        return this.data[idx]
    }

    push(data1){
        this.data[this.length] = data1;
        this.length++;
        return this.data;
    }

    pop(){
        if (this.length === 0)
            return undefined;
        const lastItem = this.data[this.length - 1]
        this.data.splice(this.data.length - 1, 1);
        this.length--;
        return lastItem;
    }

    delete(idx){
        console.log('entre')
        if (!this.data.indexOf(idx)){
            return undefined;
        }
        for (var i = 0; i < this.length; i++){
            if (i >= idx){
                this.data[i] = this.data[i+1];
            }
        }
        this.data.pop()
        this.length--;

        // this.data.splice(idx, 1);
        // this.length--;
    }
}

let arr = new MyArray()
arr.push('Esteban');
arr.push(30);
arr.push('Ivan');
console.log(arr.push('12'));
console.log(arr.get(1));
console.log(arr.length)
console.log(arr.pop());
console.log(arr)
arr.delete(0)
console.log(arr)
console.log(arr.get(1));