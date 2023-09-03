import { useEffect, useState } from "react";
import { FaEdit, FaTrash } from "react-icons/fa";
import { Link } from "react-router-dom";
import { DivLista } from "./ListaProduto.styles";

export default function ListaProduto() {

  const [produtos, setProdutos] = useState([])

  useEffect(() => {
    fetch("http://localhost:8080/LojaApp/rest/produto").then((resp) => {
      return resp.json();
    }).then((resp) => {
      setProdutos(resp)
    }).catch((err) => {
      console.log(err)
    })
  }, [])

  const handleDelete = (id) => {
    fetch(`http://localhost:8080/LojaApp/rest/produto/${id}`, {
      method: "delete"
    }).then(() => {
      window.location = "/"
    }).catch((err) => {
      console.log(err)
    })
  }
  return (
    <main>
      <DivLista>
        <h1>Lista produtos</h1>
        <Link to="/incluir">Inserir Produto</Link>
        <table border={1}>
          <thead>
            <tr>
              <th>Título</th>
              <th>Preço</th>
              <th>Quantidade</th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            {produtos.map((produto) => {
              return (
                <tr key={produto.codigo}>
                  <td>{produto.titulo}</td>
                  <td>R$ {produto.preco}</td>
                  <td>{produto.quantidade}</td>
                  <td>
                    <Link to={`/editar/${produto.codigo}`}><FaEdit/></Link>
                    <button onClick={handleDelete.bind(this, produto.codigo)}><FaTrash /></button>
                  </td>
                </tr>
              )
            })}
          </tbody>
          <tfoot><td colSpan='4'> Produtos do servidor</td></tfoot>
        </table>
      </DivLista>
    </main>
  )
}