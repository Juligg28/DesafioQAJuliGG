Feature: Preencher Automobile Insurance

  Scenario:


    Given   que o usuario acessa ao site "http://sampleapp.tricentis.com/101/app.php"
    When  ele clica na opcao Automobile no menu superior esquerdo
    And  ele preenche o formulario da aba dados do veiculo "Enter Vehicle Data" e clica no botao next
    And  preenche o formulario da aba dados do item segurado "Enter Insurant Data" e clica no botao next
    And  preenche o formulario da aba dados do seguro "Enter Product Data" e clica no botao next
    And  seleciona o preco na aba selecione o valor do seguro "Select Price Option" e clica no botao next
    And preenche o formulario da aba envia questionario "Send Quote" e pressione o botao Send
    Then  o sistema deve emitir a mensagem "Sending e-mail success!" na tela