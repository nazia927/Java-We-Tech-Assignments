const Rows = 8;

var tree="";
var x="*";
for(i=0;i<Rows;i++){
    for(j=i;j<Rows;j++){
        tree+=" ";
    }
    for(k=0;k<(2*i)-1;k++){
       tree+=x
       x=0
    }
    tree+="\n"
}
console.log(tree