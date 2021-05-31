# -Spring_Boot_Iniciantes_Auth2
# Este repositorio é somente para configuração do Spring OAuth2 Resource Service.
# O Start Resource Service, permite o Spring Receber/Entender TOKENs.
# ###########Existem 3 Starts para Spring Security####################
# 1º OAuth2 Client que é  um client que receberá um TOKEN de outra API
# 2º OAuth2 Resource Service Que é o nosso Caso, onde temos um Servidor JBoss/Keycloak que nos fornece os TOKENs
# 3º Cloud OAuth2 que é um client em nuvem.
# Obs: Esta class receberá TOKEN NÃO será um Authorization Service, que neste caso aqui é KeyCloak
# ################ Usaremos a OAuth2 Resource Service################
# E e sua class de Configuração que extende um interface 
# O Pom.xml e suas configurações para ter acesso ao Servidor Jboss/KeyCloak startado em Docker.
# E Configurar o Application Services
