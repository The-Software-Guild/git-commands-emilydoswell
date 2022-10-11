function anagramChecker(word_one, word_two) {
  let first_length = word_one.length;
  let second_length = word_two.length;
  if(first_length !== second_length){
     console.log('These words are not the same length');
     return
  }
  let string_one = word_one.split('').sort().join('');
  let string_two = word_two.split('').sort().join('');
  if(string_one === string_two){
     console.log("True");
  } else { 
     console.log("False");
  }
}
