function insertElement(arr, elem, index){
    var arrSize = 0;
    while (arr[arrSize] != undefined) arrSize += 1;
    for (; arrSize >= 0; arrSize--){
        if (arrSize === index){
            arr[arrSize] = elem;
            return;
        }else{
            arr[arrSize] = arr[arrSize - 1];
        }
    }
}

var array = [1, 2, 3, 4, 5];
var elem = 100;
var idx = 4;
console.log(array);
insertElement(array, elem, idx);
console.log(array);
