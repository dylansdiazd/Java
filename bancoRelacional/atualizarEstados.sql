update
    estados
set
    nome = 'PARANÁ',
    populacao = 11.32
where
    sigla = 'PR'

select nome from estados.populacao where sigla = 'PR'