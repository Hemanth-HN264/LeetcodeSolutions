# Write your MySQL query statement below
select e.name, b.bonus
from Employee e left outer join Bonus b
on e.empId=b.empId
where b.bonus is null OR b.bonus<1000;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna