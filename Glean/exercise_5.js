let array = ["6'2", "5'7", "6'1", "5'11"];

let replaced_array = [];

for (let i = 0; i < array.length; i ++) {
  replaced_array.push(array[i].replace(`'`, '')) 
}

let int_array = [];

for (let i = 0; i < replaced_array.length; i ++) {
  int_array.push(parseInt(replaced_array[i], 10));
}

console.log(int_array.sort());