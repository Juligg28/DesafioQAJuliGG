# DesafioQA
Desafio de QA do Site Tricentis


💻 Tecnologias utilizadas: Cucumber, Selenium Web Driver & Java
IDE: IntelliJ IDEA 2021.3.3 (Community Edition)

Este desafio técnico faz parte do processo seletivo para vaga Test Automation Enginnering na empresa Accenture

O site Tricentis é uma plataforma para cadastro de dados para propostas de seguros de veículos, e solitação de apólice. 

Preencher os formulários da página 'Automobile Insurance'

Casos de teste

Cenário 1:: Acesso no site http://sampleapp.tricentis.com/101/app.php
Cenário 2: Preencher o formulário, aba 'Enter Vehicle Data' e pressionar Next
Cenário 3: Preencher o formulário, aba 'Enter Insurant Data' e pressionar Next
Cenário 4: Preencher o formulário, aba 'Enter Product Data' e pressionar Next
Cenário 5: Preencher o formulário, aba 'Select Price Option' e pressionar Next
Cenário 6: Preencher o formulário, aba 'Send Quote' e pressionar Send
Cenário 7: Verificar a mensagem 'Sending e-email success!' na tela

Pré requisitos


    Instalar JDK 11.0.13
    https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html

    Verificar em variáveis de ambiente se JAVA_HOME está configurado com o caminho indicando para
    C:\Program Files\Java\jdk-11.0.13

    Adicionar em path > variáveis de ambiente > 'Variáveis do sistema' o caminho indicando para
    C:\Program Files\Java\jdk-11.0.13\bin

    Instalação do Eclipse https://www.eclipse.org/downloads/
   
    Instalação do ChromeDrive: https://chromedriver.chromium.org/downloads Observar qual é a versão do seu navegador Google Chrome e escolher o executável com a     mesma versão. 

    Ao abrir o projeto aponte para o chromedriver que está na sua máquina:

    System.setProperty("webdriver.chrome.driver", "caminhoNaSuaMáquina\chromedriver.exe");
