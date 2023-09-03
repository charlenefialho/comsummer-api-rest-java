import { BrowserRouter, Route, Routes } from 'react-router-dom'
import FormProduto from "./components/FormProduto"
import ListaProduto from "./components/ListaProduto"

function App() {

  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<ListaProduto />} />
        <Route path='/incluir' element={<FormProduto />} />
        <Route path='/editar/:id' element={<FormProduto />} />
      </Routes>
    </BrowserRouter>
  )
}

export default App
