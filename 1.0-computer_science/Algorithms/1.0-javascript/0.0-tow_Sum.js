// # Given an array of intigers, return indices of the two numbers such that they add up
// # to a specific target.
// # You may assume that ech input would have  exaclty one solution.
class Solution{

    indIndex(arr, target){


        for (let i = 0; i < arr.length; i++){
            if(arr.includes(target - arr[i])){
                const idx2 = arr.indexOf(target - arr[i])
                return [i, idx2]
            }
        }

        return []
    }
}


const arr = [1,2,3,5,41,8,10,9,11]
const target = 100
const newOject = new Solution
console.log(newOject.indIndex(arr, target))
