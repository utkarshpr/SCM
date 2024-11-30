console.log("Script loaded");

// change theme work
let currentTheme = getTheme();
changeTheme();


//TODO:
function changeTheme() {
    // set to webpage
    document.querySelector('html').classList.add(currentTheme);

    // set the listner to change 
    const changethemeButoon= document.querySelector('#theme_change_button')
    changethemeButoon.querySelector('span').textContent = currentTheme=='dark' ?'light':'dark'     
    changethemeButoon.addEventListener("click",(event)=>{

        const oldTheme=currentTheme
        console.log("button clicked");
        if (currentTheme === "dark"){
            currentTheme="light"
        }else{
            currentTheme="dark"
        }

        // local storage update
        setTheme(currentTheme);
        document.querySelector('html').classList.remove(oldTheme);
       
        document.querySelector('html').classList.add(currentTheme);  
        // change text of button 
        changethemeButoon.querySelector('span').textContent = currentTheme=='dark' ?'light':'dark'     
    })
  
}

//set theme to localstorage
function setTheme(theme){
    localStorage.setItem("theme",theme)
}

//get theme from localstorage
function getTheme(){
    let theme = localStorage.getItem("theme");
    return theme? theme :"light";
}

//change current page theme
