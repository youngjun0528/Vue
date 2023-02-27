function addContact(name, mobile,
                    home = " 없 음 ",
                    address = " 없 음 ",
                    email = " 없 음 ") {
    var str = `name=${name}/ mobile=${mobile}, home=${home}, address=${address}, email=${email}`;
    console.log(str);
}

addContact("홍 길 동 ", "010-222-3331")
addContact("이 몽 룡 ", "010-222-3331", "02-3422-9900", "서 울 시 ");

function foodReport(name, age, ...favoriteFoods) {
    console.log(name + ", " + age);
    console.log(favoriteFoods);
}

foodReport("이 몽 룡 ", 20, "짜 장 면 ", "냉 면 ", "불 고 기 ");
foodReport("홍 길 동 ", 16, "초 밥 ");