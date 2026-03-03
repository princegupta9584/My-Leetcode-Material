-- Outer SELECT basically null value ko handle krta hai lekin INNER Select query table me se salary ko order desending ka based par arrange krti hai --
SELECT 
    (SELECT DISTINCT salary
     FROM Employee
     ORDER BY salary DESC
     LIMIT 1,1) AS SecondHighestSalary;