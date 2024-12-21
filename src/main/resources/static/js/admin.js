console.log("ADMIN")

document
.querySelector("#image_file_input")
.addEventListener("change",function(event){
    console.log(event.target.files[0])
    let file =event.target.files[0]
    console.log(file)
    let reader= new FileReader();
    reader.onload =function(){
        document
        .querySelector("#uploadImage")
        .setAttribute("src",reader.result);
        console.log(reader.result)
    };
    reader.readAsDataURL(file);
})