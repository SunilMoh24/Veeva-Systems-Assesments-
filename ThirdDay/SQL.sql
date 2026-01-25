--1--
CREATE TABLE Accounts(
  Acc_No varchar(10) PRIMARY KEY,
  Acc_Type varchar(5),
  Cust_Name varchar(16) not null,
  Branch varchar(16),
  Balance number(15,2)
);


INSERT INTO Accounts VALUES ('A-101', 'SB', 'John', 'Bhimavaram', 50000);
INSERT INTO Accounts VALUES ('A-102', 'CA', 'David', 'Vijayawada', 23450);
INSERT INTO Accounts VALUES ('A-103', 'SB', 'John', 'Bhimavaram', 34000);
INSERT INTO Accounts VALUES ('A-104', 'SB', 'Sailesh', 'Vizag', 70000);
INSERT INTO Accounts VALUES ('A-105', 'CA', 'Pranav', 'Bhimavaram', 90000);
INSERT INTO Accounts VALUES ('A-106', 'SB', 'Mary', 'Vizag', 17000);
INSERT INTO Accounts VALUES ('A-107', 'CA', 'David', 'Vijayawada', 56000);
INSERT INTO Accounts VALUES ('A-108', 'RD', 'Shabir', 'Bhimavaram', 28000);

SELECT * FROM Accounts;


CREATE TABLE Loans (
    L_No VARCHAR(10) PRIMARY KEY,
    L_Type VARCHAR(5),
    Cust_Name VARCHAR(50),
    Branch VARCHAR(30),
    Amount INT
);


INSERT INTO Loans VALUES ('L-101', 'PL', 'David', 'Bhimavaram', 500000);
INSERT INTO Loans VALUES ('L-102', 'JL', 'Sailesh', 'Vijayawada', 90000);
INSERT INTO Loans VALUES ('L-103', 'ML', 'David', 'Bhimavaram', 1500000);
INSERT INTO Loans VALUES ('L-104', 'JL', 'Sailesh', 'Vizag', 70000);
INSERT INTO Loans VALUES ('L-105', 'CL', 'Pranav', 'Bhimavaram', 90000);
INSERT INTO Loans VALUES ('L-106', 'ML', 'Shabir', 'Vizag', 170000);
INSERT INTO Loans VALUES ('L-107', 'CL', 'Mary', 'Vijayawada', 56000);
INSERT INTO Loans VALUES ('L-108', 'PL', 'Shabir', 'Vijayawada', 400000);

Select * FROM Loans;


--2--
CREATE TABLE Employee (
    Emp_ID NUMBER PRIMARY KEY,
    Emp_Name VARCHAR(20) NOT NULL,
    Salary NUMBER NOT NULL
);


INSERT INTO Employee VALUES (1, 'Mohan', 30000);   
INSERT INTO Employee VALUES (1, 'Sai', 40000);   -- Error
INSERT INTO Employee VALUES (2, NULL, 25000);     --Error

SELECT * FROM Employee;


--3--

SELECT Acc_No, Acc_Type FROM Accounts WHERE Cust_Name = 'John';

--4--

SELECT Branch,Acc_Type,SUM(Balance)
FROM Accounts
WHERE Acc_Type IN('SB','CA')
GROUP BY Branch,Acc_Type;

--5--

SELECT Cust_Name,Branch
FROM Accounts
GROUP BY Cust_Name, Branch
HAVING COUNT(Acc_No) >= 2;

--6--

SELECT MAX(Balance)
FROM Accounts
WHERE Acc_Type = 'SB';

--7--

SELECT DISTINCT a.Cust_Name
FROM Accounts a
JOIN Loans l
ON a.Cust_Name = l.Cust_Name;

--8--

SELECT Cust_Name
FROM Accounts
GROUP BY Cust_Name
HAVING COUNT(Acc_Type) >= 2;

--9--

SELECT L_Type
FROM Loans
GROUP BY L_Type
HAVING SUM(Amount) <= ALL (
    SELECT SUM(Amount)
    FROM Loans
    GROUP BY L_Type
);

--10--

SELECT Branch
FROM Accounts
GROUP BY Branch
HAVING COUNT(*) > (
    SELECT COUNT(*) 
    FROM Loans l
    WHERE l.Branch = Accounts.Branch
);

--11--

CREATE OR REPLACE TRIGGER SB_Withdrawal_Limit
BEFORE UPDATE ON Accounts
FOR EACH ROW
BEGIN
    IF :OLD.Acc_Type = 'SB' THEN
        IF (:OLD.Balance - :NEW.Balance) > 15000 THEN
            RAISE_APPLICATION_ERROR(-20001, 'SB withdrawal cannot exceed Rs.15000');
        END IF;
    END IF;
END;
/

--12--

CREATE OR REPLACE PROCEDURE Deposit_Amount (
    p_acc_no IN VARCHAR,
    p_amount IN NUMBER
)
AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE Acc_No = p_acc_no; 
    COMMIT;
END;













