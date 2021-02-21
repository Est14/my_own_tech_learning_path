let setss = new Set([1,2,4,4,true])
console.log(setss);
setss.add(10)
console.log(setss);
console.log(setss.size);
setss.forEach((x) => console.log(x))
setss.delete(true)
for ( x of setss){
    console.log(`Element: ${x}`);
}
// Convierto un set a un arreglo 
let arr = Array.from(setss)