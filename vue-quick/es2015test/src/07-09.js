class Person {
    constructor(name, tel, address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
        if (Person.count) {
            Person.count++;
        } else {
            Person.count = 1;
        }
    }

    static getPersonCount() {
        return Person.count;
    }

    toString() {
        return `name=${this.name}, tel=${this.tel}, address=${this.address}`;
    }
}

var p1 = new Person('이몽룡', '010 - 222 - 3332', '경기도');
var p2 = new Person('홍길동', '010 - 222 - 3333', '서울');
console.log(p1.toString());
console.log(Person.getPersonCount());

class Employee extends Person {
    constructor(name, tel, address, empno, dept) {
        super(name, tel, address);
        this.empno = empno;
        this.dept = dept;
    }

    toString() {
        return super.toString() + ` ,empno =${this.empno}, dept =${this.dept}`;
    }

    getEmpInfo() {
        return `${this.empno} :${this.name} 은 ${this.dept} 부 서 입 니 다 .`;
    }
}

let e1 = new Employee("이 몽 룡 ", "010-222-2121", "서 울 시 ", "A12311", "회 계 팀 ");
console.log(e1.getEmpInfo());
console.log(e1.toString());
console.log(Person.getPersonCount());