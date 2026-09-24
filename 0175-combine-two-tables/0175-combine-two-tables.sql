# Write your MySQL query statement below
select firstName,lastName,city,state  from 
Person p left join Address d on d.personId=p.personId ;