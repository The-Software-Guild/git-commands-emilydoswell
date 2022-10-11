console.log("Hello from src/index.js!");

const list = document.querySelector("#players .active");
console.log(list);

list.insertAdjacentHTML("beforeend", "<li>Emily</li>");