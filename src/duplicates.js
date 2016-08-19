function duplicates() {

    var a = [1,3,4,5,6,2,3,3,4]

    a.sort();

    a.forEach(function(item, i) {
        if(a[i] == a[i+1]) {
            console.log(a[i] + ' is a duplicate');
        }
    })

}
