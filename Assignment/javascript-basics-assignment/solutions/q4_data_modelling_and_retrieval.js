// Create a list of fruits with their properties (name, color, pricePerKg)
// and convert it into a format so that for a given fruit name
// retrieval of its color and pricePerKg value is fast

const fruitData = {};
fruits.forEach(fruit => {
    fruitData[fruit.name] = {
        color: fruit.color,
        pricePerKg: fruit.pricePerKg
    };
});


const fruitName = "apple";
if (fruitData.hasOwnProperty(fruitName)) {
    const color = fruitData[fruitName].color;
    const pricePerKg = fruitData[fruitName].pricePerKg;
    console.log(`${fruitName} is ${color} and costs $${pricePerKg.toFixed(2)} per kg.`);
} else {
    console.log(`Fruit '${fruitName}' not found.`);
}
// Write your code here

