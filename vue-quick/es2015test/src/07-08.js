var s1 = new Set();
s1.add("사과");
s1.add("배");
s1.add("사과");
s1.add("포도");
//실 행 결 과
console.log(s1);

var john = new Set(["사과", "포도", "배"]);
var susan = new Set(["파인애플", "키위", "배"]);

//합 집 합
var union = new Set([...john.values(), ...susan.values()]);
console.log(union);

//교 집 합
var intersection = new Set([...john.values()].filter(e => susan.has(e)));
console.log(intersection);

//차 집 합
var diff = new Set([...john.values()].filter(e => !susan.has(e)));
console.log(diff);


let teams = new Map();
teams.set('LG', '트윈스');
teams.set('삼성', '라이온스');
teams.set('NC', '다이노스');
teams.set('기아', '타이거스');
teams.set('한화', '이글즈');
teams.set('롯데', '자이언츠');

console.log(teams.has("SK"));
console.log(teams.get("LG"));