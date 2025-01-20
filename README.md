# authentication-for-rest-apis
Case study for authentication and authorization for REST APIs.

### Protocolos de Autenticação e Autorização

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
	