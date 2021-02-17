const objectOne = {
    name: 'Object number 1',
    weight: {
        width: 50,
        height: 50
    },
    changeWeight: function (width, height) {
        this.weight.width = width
        this.weight.height = height
    }
}

console.log(`Weight object # 1 :  ${objectOne.weight.width} * ${objectOne.weight.height}`);
objectOne.changeWeight(100, 70)
console.log(`Weight object # 1 :  ${objectOne.weight.width} * ${objectOne.weight.height}`);
