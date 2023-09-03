import { styled } from "styled-components";

export const DivLista = styled.div`
width:70%; 
margin: auto; 
font-family:Arial;

a{
text-decoration:none;
padding:10px 15px;
margin-bottom:20px;
background-color:yellowgreen;
color: white;
display:inline-block;
}

table{
width:100%; 
margin: auto;
}

thead tr{
background-color: darkblue; 
color: white;
}

thead tr th{
padding: 10px;
}

tbody tr:nth-child(2n+2){
background-color: #ccc;
}

tbody tr td a{
background-color: none; 
margin-bottom: 5px; 
color: blue
}

tbody tr td button{
  color: red; 
  background-color: transparent;
  &:hover{
    cursor: pointer;
  } border:none;
}

tfoot tr td{
text-align:center;
background-color:#333;
color:white;
}
`