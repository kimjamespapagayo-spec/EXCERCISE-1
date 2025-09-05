let users = [
  { id: 1, name: "Kristian" },
  { id: 2, name: "Malingin" }
];

let names = users.map(user => user.name);
console.log(names); 

let people = [
  { name: "Kristian", age: 16 },
  { name: "Malingin", age: 18 },
  { name: "Spike", age: 22 }
];

let adults = people.filter(person => person.age >= 18);
console.log(adults); 
let people = [
  { name: "Kristian", age: 25 },
  { name: "Malingin", age: 32 },
  { name: "Charlie", age: 29 }
];

let oldestPerson = people.reduce((oldest, person) => {
  return person.age > oldest.age ? person : oldest;
}, people[0]);

console.log(oldestPerson); 


