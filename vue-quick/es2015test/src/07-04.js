let arr = [10, 20, 30, 40];
let [a1, a2, a3] = arr;
console.log(a1, a2, a3);

let p1 = {name: "홍 길 동 ", age: 20, gender: "M"};
let {name: n, age: a, gender} = p1;
console.log(n, a, gender);

function addContact({name, phone, email = "이메일 없 음 ", age = 0}) {
    console.log("이 름 : " + name);
    console.log("전 번 : " + phone);
    console.log("이 메 일 :" + email);
    console.log("나 이 :" + age);
}

addContact({
    name: "이 몽 룡 ",
    phone: "010-3434-8989"
})