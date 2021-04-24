let html = document.querySelector('html')
let checkbox = document.querySelector('#dark')


checkbox.addEventListener('change', ()=>{
  html.classList.add('dark-mode')
    if(checkbox.checked){
    let srcDark = html.getAttribute('src').replace('light', 'dark')
    html.setAttribute('src', srcDark)
  } else {
    let srcLight = html.getAttribute('src').replace('dark', 'light')
    html.setAttribute('src', srcLight)
  }
})