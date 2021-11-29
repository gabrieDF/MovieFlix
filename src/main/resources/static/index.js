function logar(){

  var objeto = {
      "email" : document.getElementById("txtemail").value,
      "senha" : document.getElementById("txtsenha").value
  }

  var cabecalho = {
      method: "POST",
      body: JSON.stringify(objeto),
      headers:{
          "Content-type":"application/json"
      }
  }

  fetch("http://localhost:8080/login", cabecalho)
      .then(res => res.json())
      .then(res => {
          localStorage.setItem("logado",JSON.stringify(res));
        //window.location="index";
    document.getElementById("id").innerText = res.id
    document.getElementById("cpf").innerText = res.cpf
    document.getElementById("cep").innerText = res.cep
    document.getElementById("email").innerText = res.email
    document.getElementById("nome").innerText = res.nome
    document.getElementById("senha").innerText = res.senha
    document.getElementById("telefone").innerText = res.telefone
      })
      .catch(err => {
    console.log(err);
          window.alert("Deu ruim");
      });
  

}

function cadastrar(){
	
	
	if(document.getElementById("txid").value == "" || document.getElementById("txcpf").value == "" || document.getElementById("txcep").value == "" || document.getElementById("txnome").value == "" || document.getElementById("txemail").value == "" || document.getElementById("txsenha").value == "" || document.getElementById("txtelefone").value == ""){
		return;
	}

  var objeto1 = {
	  "id" : document.getElementById("txid").value,
      "cpf" : document.getElementById("txcpf").value,
	  "cep" : document.getElementById("txcep").value,
	  "nome" : document.getElementById("txnome").value,
      "email" : document.getElementById("txemail").value,
      "senha" : document.getElementById("txsenha").value,
      "telefone" : document.getElementById("txtelefone").value
  }

  var cabecalho1 = {
      method: "POST",
      body: JSON.stringify(objeto1),
      headers:{
          "Content-type":"application/json"
      }
  }

  fetch("http://localhost:8080/cadObjeto", cabecalho1)
      .then(res => res.json())
      .then(res => {
          localStorage.setItem("logado",JSON.stringify(res));
        //window.location="index";
 window.alert("Deu bom");
 
      })
     .catch(err => {
    console.log(err);
          window.alert("Deu BOM!!");
      });

}


function deletar(){
	
	
	if(document.getElementById("txid").value == "" || document.getElementById("txcpf").value == "" || document.getElementById("txcep").value == "" || document.getElementById("txnome").value == "" || document.getElementById("txemail").value == "" || document.getElementById("txsenha").value == "" || document.getElementById("txtelefone").value == ""){
		return;
	}

  var objeto1 = {
	  "id" : document.getElementById("txid").value,
      "cpf" : document.getElementById("txcpf").value,
	  "cep" : document.getElementById("txcep").value,
	  "nome" : document.getElementById("txnome").value,
      "email" : document.getElementById("txemail").value,
      "senha" : document.getElementById("txsenha").value,
      "telefone" : document.getElementById("txtelefone").value
  }

  var cabecalho1 = {
      method: "DELETE",
      body: JSON.stringify(objeto1),
      headers:{
          "Content-type":"application/json"
      }
  }

  fetch("http://localhost:8080/delete", cabecalho1)
      .then(res => res.json())
      .then(res => {
          localStorage.setItem("logado",JSON.stringify(res));
        //window.location="index";
 window.alert("Deletou");
 
      })
      .catch(err => {
    console.log(err);
          window.alert("Deu BOM!!");
      });
  

}


function update(){
	
	
	if(document.getElementById("txid").value == "" || document.getElementById("txcpf").value == "" || document.getElementById("txcep").value == "" || document.getElementById("txnome").value == "" || document.getElementById("txemail").value == "" || document.getElementById("txsenha").value == "" || document.getElementById("txtelefone").value == ""){
		return;
	}

  var objeto1 = {
	  "id" : document.getElementById("txid").value,
      "cpf" : document.getElementById("txcpf").value,
	  "cep" : document.getElementById("txcep").value,
	  "nome" : document.getElementById("txnome").value,
      "email" : document.getElementById("txemail").value,
      "senha" : document.getElementById("txsenha").value,
      "telefone" : document.getElementById("txtelefone").value
  }

  var cabecalho1 = {
      method: "PUT",
      body: JSON.stringify(objeto1),
      headers:{
          "Content-type":"application/json"
      }
  }

  fetch("http://localhost:8080/atualiza", cabecalho1)
      .then(res => res.json())
      .then(res => {
          localStorage.setItem("logado",JSON.stringify(res));
        //window.location="index";
 window.alert("Atualizou");
 
      })
      .catch(err => {
    console.log(err);
          window.alert("Deu BOM!!");
      });
  

}