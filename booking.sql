Create DATABASE CARBOOKINGSYSTEM;
use CARBOOKINGSYSTEM;

CREATE TABLE IF NOT EXISTS Bookings (
	BookingID int NOT NULL AUTO_INCREMENT,
	CustID int NOT NULL,
	HireDate DATE NOT NULL,
	ReturnDate DATE NOT NULL,
	CarID int NOT NULL,
	PRIMARY KEY (BookingID)
);

INSERT INTO Bookings (BookingID,CustID, HireDate, ReturnDate, CarID)
VALUES (1, 001, '2018-12-09', '2018-12-09',  1), 
       (2, 002, '2018-12-09', '2018-12-09', 2), 
	   (3, 003, '2018-12-09', '2018-12-09', 3),
	   (4, 004, '2018-12-09', '2018-12-09', 4),
	   (5, 005, '2018-12-09', '2018-12-09', 5),
	   (6, 006, '2018-12-09', '2018-12-09', 6),
	   (7, 007, '2018-12-09', '2018-12-09', 7),
	   (8, 008, '2018-12-09', '2018-12-09', 8),
	   (9, 009, '2018-12-09', '2018-12-09', 9),
	   (10, 010,'2018-12-09', '2018-12-09', 10);