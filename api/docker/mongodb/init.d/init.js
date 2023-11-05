console.log("Initiating MongoDB...");
db = db.getSiblingDB("study-manager");
db.createUser({user: "study-manager", pwd: "study-manager", roles: [{role:"readWrite",db: "study-manager"}]})
console.log("MongoDB initiated.");