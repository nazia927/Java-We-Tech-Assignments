const A5bb = (stringToCheck)=>{
    const opening = "({["
    const closing = ")}]"
    const bracketObj = {"}":"{","]":"[",")":"("}
    const stack=[]
    if(stringToCheck.length===0){
        return false
    }
    for(char of stringToCheck){
        if(opening.indexOf(char)!==-1){
            stack.push(char)
        }
        
    
        else if(closing.indexOf(char)!==-1){
            if(stack.length===0){
                return false
            }
            else if((stack[stack.length-1]===bracketObj[char])){
            stack.pop();
            
            }
            else{
                return false
            }
        }
        
        else{
            return false
        }
    }
    // console.log(stack)
    if(stack.length===0){
    return true
    }
    else{
        return false
    }
}

console.log(A5bb("{[()]}"));//true
console.log(A5bb("{[{]}"));//false
console.log(A5bb("{()}"));//true
console.log(A5bb("{][]}"));//false
