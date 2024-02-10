 INSERT INTO Dipendente (idDipendente, Nome, Cognome, CF, Email, Password) VALUES
('DIP001', 'Luca', 'Rossi', 'RSSLCU80A01H501K', 'luca.rossi@example.com', 'passwordLuca'),
('DIP002', 'Giulia', 'Bianchi', 'BNCGIU83A01H501J', 'giulia.bianchi@example.com', 'passwordGiulia'),
('DIP003', 'Marco', 'Verdi', 'VRDMRC86A01H501Z', 'marco.verdi@example.com', 'passwordMarco');
INSERT INTO Responsabile (IDResponsabile, Nome, Cognome, CF, Email, Password) VALUES
('RESP001', 'Anna', 'Ferrari', 'FRRANN90A01H501X', 'anna.ferrari@example.com', 'passwordAnna'),
('RESP002', 'Simone', 'Ricci', 'RCCSMN93A01H501V', 'simone.ricci@example.com', 'passwordSimone'),
('RESP003', 'Laura', 'Gallo', 'GLLLRA96A01H501H', 'laura.gallo@example.com', 'passwordLaura');
INSERT INTO Cliente (IDCliente, Nome, Cognome, CF, Email, Password) VALUES
('CLT001', 'Roberto', 'Neri', 'NRIRRT70A01H501M', 'roberto.neri@example.com', 'passwordRoberto'),
('CLT002', 'Sara', 'Moro', 'MROSRA73A01H501B', 'sara.moro@example.com', 'passwordSara'),
('CLT003', 'Francesco', 'Lombardo', 'LMBFRC76A01H501T', 'francesco.lombardo@example.com', 'passwordFrancesco');
INSERT INTO Prenotazioni (IDPrenotazione, IDCliente, IndirizzoDiConsegna, IndirizzoDiRitiro, DataRitiro, DataConsegna, MetodoDiPagamento, ImportodaPagare, StatoPrenotazione) VALUES
('PRN001', 'CLT001', 'Via Roma, 10, Roma', 'Via Milano, 5, Milano', '2023-10-01', '2023-10-02', 'Contanti', 200.00, 'Confermata'),
('PRN002', 'CLT002', 'Via Torino, 15, Torino', 'Via Napoli, 20, Napoli', '2023-11-05', '2023-11-06', 'Carta di Credito', 300.00, 'In Attesa'),
('PRN003', 'CLT003', 'Via Firenze, 25, Firenze', 'Via Bari, 30, Bari', '2023-12-10', '2023-12-11', 'Bonifico', 150.00, 'Completata');
