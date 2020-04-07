# desafio-codenation
Desafio realizado para garantir a entrada no programa AceleraDev realizado pela Codenation.

O desafio consistia em 4 etapas:
1. Realizar uma requisição HTTP na API disponibilizada.
2. Com os dados recebidos através da requisição, decifrar o texto utilizando a Criptografia de Cesar.
3. Gerar um resumo criptográfico utilizando SHA-1
4. Submeter o arquivo através de um POST para a API disponibilizada.

A última parte foi realizada num HTML puro =] com o seguinte código:
<!DOCTYPE html>

<html>
<body>

<form action="https://api.codenation.dev/v1/challenge/dev-ps/submit-solution?token=33dc16b111a0afe59541a1cf0468b09c406a0f64
" method="post" enctype="multipart/form-data">
    <p><input type="file" name="answer" id="answer"></p>
    <p><input type="submit" value="Enviar" name="submit"></p>
</form>

</body>
</html>

Todo o resto foi devidamente realizado no projeto.

Obs: Nem todas as importações foram utilizadas no projeto, alguns comentários restantes e redundâncias no código irão ficar por enquanto, o repositório tem o único intuito de salvar 
o projeto e os resultados obtidos por ele:

{
   "numero_casas":2,
   "token":"33dc16b111a0afe59541a1cf0468b09c406a0f64",
   "cifrado":"aqw owuv jcxg ejcqu kp aqwt uqwn vq ikxg dktvj vq c fcpekpi uvct. htkgftkej pkgvbuejg",
   "decifrado":"you must have chaos in your soul to give birth to a dancing star.friedrich nietzsche",
   "resumo_criptografico":"9f21a27ad5440a1354d7a612ec6737d83e8b91d7"
}


##Lembrar:
1. O método de criptografia SHA-1 está errado e precisa ser atualizado.
2. Atualizar as dependências.
3. Atualizar os imports.
4. Atualizar os trechos não usados/redudantes no código.
