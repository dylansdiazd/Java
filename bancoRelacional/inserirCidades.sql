INSERT INTO cidades(nome, area, estado_id)
VALUES('Caruaru', 920.6, (select id from estados where sigla = 'PE' ));
