Que nacionalidades hay?

select a.nationality AS Nationality, count(a.author_id) As N_authors
from authors as a 
join books as b 
on b.author_id = a.author_id
where nationality is not null
and nationality not in('RUS')
group by (a.nationality)
order by N_authors desc, nationality;  -- En este caso ptimero orde por el primer parametro and so on.,

SELECT DISTINCT nationality from authors ORDER BY nationality;