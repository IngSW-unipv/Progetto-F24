-- Inserimento di valori nella tabella Dipendente
INSERT INTO Dipendente (idDipendente, Nome, Cognome, CF, Email, Password)
VALUES
    (1, 'Marco', 'Rossi', 'ABCD1234E', 'marco.rossi@example.com', 'password123'),
    (2, 'Anna', 'Bianchi', 'WXYZ5678U', 'anna.bianchi@example.com', 'password456'),
    (3, 'Luca', 'Verdi', 'LMNO9012P', 'luca.verdi@example.com', 'password789');

-- Inserimento di valori nella tabella MezzoDiTrasporto
INSERT INTO MezzoDiTrasporto (IDMezzo)
VALUES
    (1),
    (2),
    (3);

-- Inserimento di valori nella tabella Responsabile
INSERT INTO Responsabile (IDResponsabile, Nome, Cognome)
VALUES
    (1, 'Giovanni', 'Ferrari'),
    (2, 'Giulia', 'Russo'),
    (3, 'Roberto', 'Esposito');

-- Inserimento di valori nella tabella Cliente
INSERT INTO Cliente (IDCliente, Nome, Cognome, CF, Email, Password)
VALUES
    (1, 'Paolo', 'Neri', 'QRST5678W', 'paolo.neri@example.com', 'password123'),
    (2, 'Giovanna', 'Gialli', 'UVWX1234Y', 'giovanna.gialli@example.com', 'password456'),
    (3, 'Alessia', 'Marroni', 'YZAB5678C', 'alessia.marroni@example.com', 'password789');

-- Inserimento di valori nella tabella Prenotazioni
INSERT INTO Prenotazioni (IDPrenotazione, IDCliente, IndirizzoDiConsegna, DataRitiro, DataConsegna, MetodoDiPagamento, ImportoPagato, StatoPrenotazione)
VALUES
    (1, 1, 'Via Roma 123', '2024-02-10', '2024-02-15', 'Carta di credito', 150.00, 'Confermata'),
    (2, 2, 'Piazza Garibaldi 45', '2024-03-05', '2024-03-10', 'PayPal', 200.00, 'In attesa'),
    (3, 3, 'Corso Vittorio Emanuele 78', '2024-04-20', '2024-04-25', 'Bonifico bancario', 180.00, 'Consegnata');

-- Inserimento di valori nella tabella USER
INSERT INTO USER (CF, Nome, Cognome, Email, Password)
VALUES
    ('ABCD1234E', 'Marco', 'Rossi', 'marco.rossi@example.com', 'password123'),
    ('WXYZ5678U', 'Anna', 'Bianchi', 'anna.bianchi@example.com', 'password456'),
    ('LMNO9012P', 'Luca', 'Verdi', 'luca.verdi@example.com', 'password789');
