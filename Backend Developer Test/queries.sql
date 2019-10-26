-- a. Get all buses for “Concessionaire 1”.
SELECT 
B.*
FROM Bus
Inner join Concessionaire C on C.id = B.concessionaireid
WHERE C.id = '1';
-- b. Get all NVR devices for buses with type equal to “Bi-articulado”.
SELECT 
D.*
FROM Device D
INNER JOIN DeviceType DT on DT.id =D.deviceTypeId
JOIN Bus B on B.id = D.busid
WHERE 
DT.name = 'NVR' AND
B.type = 'Bi-articulado”';

-- c. Summarize the quantity of devices by status (Active / Inactive) and bus motor (Diesel / Gas / Electric / Hybrid).
SELECT 
COUNT(D.id), D.status, B.motor
FROM Device D, Bus B
WHERE D.busId = B.id 
GROUP BY D.status, B.motor;


