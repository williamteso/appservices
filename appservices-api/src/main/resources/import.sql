--Client
--INSERT INTO SERV_OAUTH_CLIENT_DETAILS (client_id, client_secret, scope, authorized_grant_types, authorities, access_token_validity, refresh_token_validity) VALUES ('JAinIArE7062UXAW23FWSL4bY1rio1Mw', '$2a$10$syCvG4oGFCPPhqEBNmoUXeXxImL3LUJ5PzfVSlZDbJnL/At8Jr072', 'read,write,trust', 'password,refresh_token,client_credentials', 'ROLE_CLIENT,ROLE_TRUSTED_CLIENT', 3000, 3000);
--
--/* Creamos algunos usuarios con sus roles */
--INSERT INTO SERV_USUARIOS (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$e4z31RNfa0hAor1B6PTsg.ebK/jcrBX8Wzk0sx0bJ.FQJoLQjLXaa',true,'admin','admin','savia@gmail.com');
--
--INSERT INTO SERV_ROLES (nombre) VALUES ('ROLE_USER');
--INSERT INTO SERV_ROLES (nombre) VALUES ('ROLE_ADMIN');
--
--INSERT INTO SERV_USUARIOS_ROLES (usuario_id, role_id) VALUES (1, 1);
--INSERT INTO SERV_USUARIOS_ROLES (usuario_id, role_id) VALUES (2, 2);
--INSERT INTO SERV_USUARIOS_ROLES (usuario_id, role_id) VALUES (2, 1);