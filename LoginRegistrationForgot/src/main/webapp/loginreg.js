var mylogin = document.getElementById('login'); //form id for login page
var myRegister = document.getElementById('register'); //form id for register page
var mybtn = document.getElementById('btn'); //btn id to perform toggle option


login = () => {
  mylogin.style.left = '50px';
  myRegister.style.left = '500px';
  mybtn.style.left = '0px';
}

register = () => {
  mylogin.style.left = '-450px';
  myRegister.style.left = '50px';
  mybtn.style.left = '110px';
}