export let var1 = 1000;

export function add(a, b) {
    return a + b;
}

let calc = {
    add(x, y) {
        return x + y;
    },
    multiply(x, y) {
        return x * y;
    }
}
export { calc };