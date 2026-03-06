# Write your MySQL query statement below
SELECT p.firstname, p.lastname, a.city, a.state FROM Person p
LEFT JOIN address a 
on p.personId = a.personId;