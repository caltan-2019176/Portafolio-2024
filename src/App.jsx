import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)
  //const [count2, setCount2] = useState(100)


 /* function aumentar(){
    setCount2((count2)=> count2+ 100)
  }*/
  function aumentarEn8(){
    if(count < 200){
      setCount((count)=> count+ 8)
    }
  }
  function validar200Menos(){
    if(count < -200){
      setCount((count)=> count+ 8)
    }
  }
  function restarEn8(){
    if(count > -200){
      setCount((count)=> count- 8)
    } 
    validar200Menos()
    
  }
  return (
    <>
      <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div className="card">
        <div className='container'>
        <button onClick={() => restarEn8() }>
          restar de 8
        </button>
        <button onClick={() => setCount((count) => count - 1)}>
          restar
        </button>
        <h3>count is {count}</h3>
        <button onClick={() => setCount((count) => count + 1)}>
          sumar
        </button>
        <button onClick={() => aumentarEn8()}>
          sumar en 8
        </button>
        </div>
        {/*<p>Segundo Contador:
            {count2}
        </p>
        <button onClick={()=> aumentar()}>Aumenta el contador</button>*/ }
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  )
}

export default App
