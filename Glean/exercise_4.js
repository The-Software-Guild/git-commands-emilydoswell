class Shape {
  constructor(height, width){
    this.height = height;
    this.width = width;
  }

  calcAreaSquare() {
    return this.height * this.width;
  }

  calcAreaTriangle() {
    return (this.height * this.width)/2
  }
}

const square = new Shape(10,10);
const triangle = new Shape(10,10);

console.log(square.calcAreaSquare());
console.log(triangle.calcAreaTriangle());
