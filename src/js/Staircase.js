
function main() {
    'use strict';
    let n = parseInt(readLine());

    for (let i = 0; i <= n; i += 1) {
        console.log(' '.repeat(n - i) + '#'.repeat(i));
    }
}
