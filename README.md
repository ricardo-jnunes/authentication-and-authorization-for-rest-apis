# authentication-for-rest-apis
Case study for authentication and authorization for REST APIs.

### Estudos implementados

##### Tecnologias
- SpringBoot

#### OAuth 2.0
-  Password-based Authentication - Without JWT

#### SAML
- Under construction

### Definições do ponto de vista dos implementadores
A autenticação é um processo para determinar o indivíduo (= identificador exclusivo) de um usuário final. Há muitas maneiras de determinar o assunto. ID e senha, impressões digitais, reconhecimento de íris, etc.

A autorização é um processo para associar o indivíduo às permissões solicitadas e ao aplicativo cliente que solicitou as permissões. Um token de acesso representa a associação.

### Métodos de Autenticação

1. Senha (Password-based Authentication)
	* Descrição: Método tradicional de autenticação onde o usuário deve fornecer um nome de usuário e uma senha para acessar um sistema.
	* Como funciona: O usuário insere suas credenciais (nome de usuário e senha) e o sistema verifica se elas correspondem às registradas. Se as credenciais forem válidas, o acesso é concedido.
	* Casos de uso: Aplicações web e móveis. Sistemas corporativos e de gerenciamento de contas pessoais.
	
2. Autenticação de Dois Fatores (2FA)
	* Descrição: Método que combina dois fatores distintos para autenticar um usuário: algo que ele sabe (senha) e algo que ele tem (como um código enviado por SMS ou um aplicativo autenticador).
	* Como funciona: O usuário insere a senha (primeiro fator), depois fornece um código temporário gerado por um aplicativo de autenticação ou enviado via SMS (segundo fator).
	* Casos de uso: Bancos e serviços financeiros online. Contas de e-mail e redes sociais (como Google, Facebook, etc.).
	
3. Autenticação de Múltiplos Fatores (MFA)
	* Descrição: Semelhante ao 2FA, mas envolve mais de dois fatores para garantir uma camada adicional de segurança.
	* Como funciona: O processo inclui uma combinação de três fatores ou mais, como: algo que o usuário sabe (senha), algo que o usuário tem (token de segurança) e algo que o usuário é (biometria).
	* Casos de uso: Acesso a sistemas críticos ou sensíveis (ex. sistemas de saúde, governamentais). Empresas com requisitos rigorosos de segurança.

4. Autenticação por Biometria (Fingerprint, Face ID, etc.)
	* Descrição: Usa características físicas únicas do usuário, como impressões digitais, reconhecimento facial ou íris para autenticação.
	* Como funciona: O usuário fornece uma característica biométrica (como impressões digitais ou reconhecimento facial) e o sistema verifica se corresponde aos dados cadastrados.
	* Casos de uso: Smartphones (Face ID, Fingerprint). Acesso físico a instalações de segurança.

5. Token de Segurança (Security Tokens)
	* Descrição:Um token gerado por um dispositivo físico ou aplicativo, que serve como uma chave temporária para autenticação.
	* Como funciona: O usuário recebe um código gerado por um token (físico ou digital) e o insere no sistema para autenticar sua identidade.
	* Casos de uso: Acesso a sistemas corporativos. Bancos e plataformas financeiras.

6. Autenticação via Certificados Digitais
	* Descrição: Utiliza um certificado digital, que é um arquivo criptografado que contém a identidade de um usuário ou dispositivo, para autenticar um sistema.
	* Como funciona: O certificado digital é apresentado ao servidor durante o processo de autenticação e, por meio de criptografia, o sistema valida a identidade do usuário ou dispositivo.
	* Casos de uso: Comunicações seguras via HTTPS (SSL/TLS). Acesso a sistemas de e-government ou plataformas corporativas.
	
7. Autenticação por SMS (One-Time Password - OTP)
	* Descrição: O OTP é um código de autenticação temporário enviado por SMS ou gerado por um aplicativo, usado para autenticar o usuário em um único acesso.
	* Como funciona: O usuário insere seu nome de usuário e senha e, em seguida, um código de uso único (gerado aleatoriamente) é enviado via SMS ou aplicativo. O usuário insere esse código para completar a autenticação.
	* Casos de uso: Bancos e serviços financeiros. Plataformas de e-commerce e serviços online.

8. Autenticação via Provedor de Identidade (Single Sign-On - SSO)
	* Descrição: Permite que o usuário faça login uma única vez em um provedor de identidade e, em seguida, acesse vários sistemas ou aplicativos sem precisar se autenticar novamente.
	* Como funciona: O usuário se autentica em um sistema central (provedor de identidade), e um token de autenticação é usado para autorizar o acesso a outros serviços vinculados.
Casos de uso: Aplicações corporativas que exigem o acesso a vários sistemas (ex. Google, Microsoft).Redes sociais que permitem login único para múltiplos serviços.

### Protocolos Autorização

Em aplicações, o uso de protocolos de autorização é fundamental para garantir que apenas usuários autorizados possam acessar recursos específicos de um sistema. Abaixo estão alguns dos principais protocolos de autorização que podem ser usados:

1. OAuth 2.0
	* Descrição: O OAuth 2.0 é o protocolo de autorização mais comum e amplamente utilizado. Ele permite que um usuário conceda a um aplicativo de terceiros acesso limitado aos seus recursos em um servidor sem precisar compartilhar suas credenciais (como senha).
	* Como funciona: O OAuth 2.0 usa tokens de acesso para conceder permissão. O processo envolve três principais componentes: o cliente (aplicação), o servidor de autorização e o servidor de recursos.
	* Casos de uso: Usado amplamente em integrações de aplicativos web e móveis, como login com Google, Facebook, GitHub, etc.
	
2. OpenID Connect (OIDC)
	* Descrição: OpenID Connect é uma camada de identidade sobre o OAuth 2.0. Ele proporciona autenticação e autorização de usuários, permitindo que o aplicativo verifique a identidade do usuário com base na autenticação realizada por um provedor de identidade.
	* Como funciona: Após o OAuth 2.0 realizar a autorização, o OpenID Connect fornece informações sobre o usuário, como seu nome e e-mail, através de um ID token.
	* Casos de uso: Amplamente utilizado em sistemas que exigem tanto autenticação quanto autorização, como plataformas de login único (SSO).

3. SAML (Security Assertion Markup Language)
	* Descrição: SAML é um protocolo de autenticação e autorização baseado em XML. Ele é usado principalmente para a troca de informações de autenticação entre uma parte confiável (provedor de identidade) e uma aplicação (provedor de serviço).
	* Como funciona: O SAML permite a autenticação e autorização via "assertions", que são mensagens que confirmam a identidade do usuário.
	* Casos de uso: É comum em sistemas corporativos e em aplicações de login único (SSO) em grandes organizações.

4. LDAP (Lightweight Directory Access Protocol)
	* Descrição: O LDAP é um protocolo que permite o acesso e a manutenção de diretórios de informação, como os diretórios de usuários e grupos. Ele pode ser usado para gerenciar a autorização de acesso a recursos em uma rede corporativa.
	* Como funciona: O LDAP autentica usuários e fornece informações sobre permissões e grupos aos sistemas.
	* Casos de uso: Utilizado em sistemas corporativos, especialmente em soluções de gerenciamento de identidade.

5. API Keys
	* Descrição: A autenticação por API Key é um método simples em que um código (geralmente uma chave secreta) é usado para identificar e autorizar uma aplicação ou um usuário a acessar uma API.
	* Como funciona: A chave é enviada com a solicitação, permitindo que o sistema verifique a identidade do solicitante e autorize o acesso.
	* Casos de uso: Usado em muitas APIs públicas e privadas, como Google Maps, Twilio, etc. Embora simples, é menos seguro do que os protocolos baseados em tokens.

6. JWT (JSON Web Tokens)
	* Descrição: JWT é um formato compacto e auto-contido para representar informações de autorização e autenticação. É frequentemente usado em combinação com o OAuth 2.0.
	* Como funciona: O JWT armazena as informações de autorização dentro de um token criptografado que pode ser verificado e validado.
	* Casos de uso: Usado para autenticação em aplicações web e móveis, além de ser uma opção popular para APIs.

7. Bearer Token
	* Descrição: Um Bearer Token é um tipo de token de autenticação utilizado em sistemas de autorização para acessar recursos protegidos. Qualquer entidade que possua o token tem permissão para acessar os recursos autorizados.
	* Como funciona: Após a autenticação, o servidor emite um Bearer Token para o cliente, que o utiliza em requisições subsequentes. O token é incluído no cabeçalho HTTP da requisição, e o servidor valida sua autenticidade e permissões para fornecer acesso ao recurso solicitado.
	* Casos de uso: APIs RESTful, onde clientes precisam acessar recursos protegidos. Aplicações que exigem um método de autenticação sem a necessidade de senha em cada requisição.

8. X.509 Certificates
	* Descrição: X.509 é um padrão para certificados digitais que pode ser usado para autenticar usuários e dispositivos.
	* Como funciona: O certificado digital contém uma chave pública e é usado para autenticar e autorizar um usuário, sendo geralmente combinado com TLS/SSL para proteger a comunicação.
	* Casos de uso: Usado em sistemas de comunicação segura, como em VPNs e conexões HTTPS.
	
