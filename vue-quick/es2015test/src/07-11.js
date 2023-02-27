var p = new Promise(function (resolve, reject) {

    setTimeout(function () {
        var num = Math.round(Math.random() * 20);
        var isValid = num % 2;
        if (isValid) {
            resolve(num);
        } else {
            reject(num);
        }
    }, 2000);
});

p.then(function (num) {
    console.log("홀 수 : " + num);
}).catch(function (num) {
    console.log("짝 수 : " + num);
});

console.log("20까지의 난 수 중 홀 수 /짝 수 ?");
console.log("결 과 는 2초후에 나 옵 니 다 .!!");