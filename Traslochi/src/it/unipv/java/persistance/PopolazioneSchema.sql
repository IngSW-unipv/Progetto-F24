 
 

-- Insert data into 'Dipendente' table
INSERT INTO Dipendente (idDipendente, Nome, Cognome, CF, Email, Password) VALUES
(1, 'Mario', 'Rossi', 'RSSMRA75M01H501P', 'mario.rossi@email.com', 'marioPass123'),
(2, 'Giulia', 'Bianchi', 'BNCGLI75F01H501K', 'giulia.bianchi@email.com', 'giuliaPass123'),
(3, 'Luca', 'Verdi', 'VRDLCA75A01H501S', 'luca.verdi@email.com', 'lucaPass123');

-- Insert data into 'MezzoDiTrasporto' table
-- Note: Additional attributes should be added as per your table schema
INSERT INTO MezzoDiTrasporto (IDMezzo) VALUES
(101),
(102),
(103);

-- Insert data into 'DipTurno' table
-- The 'Orario' is given as an example and should be adjusted according to your actual data
INSERT INTO DipTurno (idDipendente, IDMezzo, Orario) VALUES
(1, 101, '08:00:00'),
(2, 102, '09:00:00'),
(3, 103, '10:00:00');

-- Insert data into 'Turno' table
INSERT INTO Turno (Orario) VALUES
('08:00:00'),
('09:00:00'),
('10:00:00');

-- Insert data into 'Responsabile' table
INSERT INTO Responsabile (IDResponsabile, Nome, Cognome) VALUES
(1, 'Alessandra', 'Amoroso'),
(2, 'Roberto', 'Baggio'),
(3, 'Chiara', 'Ferragni');

-- Insert data into 'Assegna' table
INSERT INTO Assegna (Orario, IDResponsabile) VALUES
('08:00:00', 1),
('09:00:00', 2),
('10:00:00', 3);

-- Insert data into 'Cliente' table
INSERT INTO Cliente (IDCliente, Nome, Cognome, CF, Email, Password) VALUES
(1, 'Sergio', 'Marchionne', 'MCHSRG80A01H501C', 'sergio.marchionne@email.com', 'sergioPass123'),
(2, 'Laura', 'Pausini', 'PSNLRA80A01H501D', 'laura.pausini@email.com', 'lauraPass123'),
(3, 'Andrea', 'Bocelli', 'BCLNDR80A01H501E', 'andrea.bocelli@email.com', 'andreaPass123');

-- Insert data into 'Prenotazioni' table
INSERT INTO Prenotazioni (IDPrenotazione, IDCliente, IndirizzoDiConsegna, DataRitiro, DataConsegna, MetodoDiPagamento, ImportoPagato, StatoPrenotazione) VALUES
(1, 1, 'Via Roma 1, Torino', '2024-04-15', '2024-04-20', 'Carta', 200.00, 'Prenotata'),
(2, 2, 'Corso Milano 2, Milano', '2024-05-10', '2024-05-15', 'Paypal', 150.00, 'Prenotata'),
(3, 3, 'Viale Lazio 3, Firenze', '2024-06-05', '2024-06-10', 'Contanti', 300.00, 'Prenotata');

-- Insert data into 'USER' table
-- Note: The CFs used here must match the CFs used in the 'Dipendente' or 'Cliente' table
INSERT INTO USER (CF, Nome, Cognome, Email, Password) VALUES
('RSSMRA75M01H501P', 'Mario', 'Rossi', 'mario.rossi@email.com', 'marioPass123'),
('BNCGLI75F01H501K', 'Giulia', 'Bianchi', 'giulia.bianchi@email.com', 'giuliaPass123'),
('VRDLCA75A01H501S', 'Luca', 'Verdi', 'luca.verdi@email.com', 'lucaPass123');
