const fishBite = {
    name: "Brown Chub",
    class: "K, Biggibus",
    nickName: "Topsail Drummer",
    conservationStatus: "least concern",
};

// CRUD- create, read, update, delete
console.log(fishBite);
// Create
fishBite.isCool = false;
fishBite['isNotCool'] = true;
console.log(fishBite);
// Read
console.log(fishBite.name);
console.log(fishBite['name']);

// Update
fishBite.name = "Brown Trout";
console.log(fishBite.name);

// Delete
delete fishBite.nickName;
console.log(fishBite);

console.log(fishBite);