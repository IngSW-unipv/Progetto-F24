-- Create schema if it does not exist
CREATE SCHEMA IF NOT EXISTS Traslochi;

-- Set the schema to use for subsequent operations
USE Traslochi;

-- Creating the 'Dipendente' table
CREATE TABLE IF NOT EXISTS Dipendente (
    idDipendente VARCHAR(255) PRIMARY KEY,
    Nome VARCHAR(255),
    Cognome VARCHAR(255),
    CF VARCHAR(16) UNIQUE,
    Email VARCHAR(255) UNIQUE,
    Password VARCHAR(255)
);
 

-- Creating the 'Responsabile' table
CREATE TABLE IF NOT EXISTS Responsabile (
    IDResponsabile VARCHAR(255) PRIMARY KEY,
    Nome VARCHAR(255),
    Cognome VARCHAR(255),
	CF VARCHAR(16) UNIQUE,
    Email VARCHAR(255) UNIQUE,
    Password VARCHAR(255)
);

-- Creating the 'Turno' table with corrected foreign key references
CREATE TABLE IF NOT EXISTS Turno (
    OrarioInizio TIME,
     idDipendente VARCHAR(255),  
     IndirizzoLavoro VARCHAR(255),  
    PRIMARY KEY (OrarioInizio, idDipendente),
    FOREIGN KEY (idDipendente) REFERENCES Dipendente(idDipendente)
 );


-- Creating the 'Cliente' table
CREATE TABLE IF NOT EXISTS Cliente (
    IDCliente VARCHAR(255) PRIMARY KEY,
    Nome VARCHAR(255),
    Cognome VARCHAR(255),
    CF VARCHAR(16) UNIQUE,
    Email VARCHAR(255) UNIQUE,
    Password VARCHAR(255)
    -- Include other attributes for the client
);

-- Creating the 'Prenotazioni' table
CREATE TABLE IF NOT EXISTS Prenotazioni (
    IDPrenotazione VARCHAR(255) PRIMARY KEY,
    IDCliente VARCHAR(255), 
    IndirizzoDiConsegna VARCHAR(255),
    IndirizzoDiRitiro VARCHAR(255),
    DataRitiro DATE,
    DataConsegna DATE,
    MetodoDiPagamento VARCHAR(50),
    ImportodaPagare DECIMAL(10, 2),
    StatoPrenotazione VARCHAR(50),
    idResponsabile VARCHAR(255),
    FOREIGN KEY (IDCliente) REFERENCES Cliente(IDCliente)
);
 -- Inserimenti per la tabella Dipendente
INSERT INTO Dipendente (idDipendente, Nome, Cognome, CF, Email, Password) VALUES ('DIP001', 'Mario', 'Rossi', 'RSSMRA85M01H501Z', 'mario.rossi@email.com', 'passwordHash1');
INSERT INTO Dipendente (idDipendente, Nome, Cognome, CF, Email, Password) VALUES ('DIP002', 'Luca', 'Bianchi', 'LCABNC82S18F205J', 'luca.bianchi@email.com', 'passwordHash2');
INSERT INTO Dipendente (idDipendente, Nome, Cognome, CF, Email, Password) VALUES ('DIP003', 'Giulia', 'Verdi', 'GVLGIA88D44A001S', 'giulia.verdi@email.com', 'passwordHash3');

-- Inserimenti per la tabella Responsabile
INSERT INTO Responsabile (IDResponsabile, Nome, Cognome, CF, Email, Password) VALUES ('RESP001', 'Anna', 'Gialli', 'ANNGIA72P65Z404X', 'anna.gialli@email.com', 'passwordHash1');
INSERT INTO Responsabile (IDResponsabile, Nome, Cognome, CF, Email, Password) VALUES ('RESP002', 'Carlo', 'Neri', 'CRLNRI69E07F839K', 'carlo.neri@email.com', 'passwordHash2');
INSERT INTO Responsabile (IDResponsabile, Nome, Cognome, CF, Email, Password) VALUES ('RESP003', 'Sofia', 'Marroni', 'SOFMRR80A41G273H', 'sofia.marroni@email.com', 'passwordHash3');

-- Inserimenti per la tabella Cliente
INSERT INTO Cliente (IDCliente, Nome, Cognome, CF, Email, Password) VALUES ('CLNT001', 'Marco', 'Celeste', 'MCRCST76M04H501P', 'marco.celeste@email.com', 'passwordHash1');
INSERT INTO Cliente (IDCliente, Nome, Cognome, CF, Email, Password) VALUES ('CLNT002', 'Elisa', 'Rosa', 'LSIRSA89B55D969G', 'elisa.rosa@email.com', 'passwordHash2');
INSERT INTO Cliente (IDCliente, Nome, Cognome, CF, Email, Password) VALUES ('CLNT003', 'Federico', 'Viola', 'FDRCVL93M01L219Z', 'federico.viola@email.com', 'passwordHash3');
-- Inserimenti per la tabella Turno
INSERT INTO Turno (OrarioInizio, idDipendente, IndirizzoLavoro) VALUES ('08:00:00', 'DIP001', 'Via Roma 1');
INSERT INTO Turno (OrarioInizio, idDipendente, IndirizzoLavoro) VALUES ('09:00:00', 'DIP002', 'Corso Milano 2');
INSERT INTO Turno (OrarioInizio, idDipendente, IndirizzoLavoro) VALUES ('10:00:00', 'DIP003', 'Piazza Napoli 3');

-- Inserimenti per la tabella Prenotazioni
INSERT INTO Prenotazioni (IDPrenotazione, IDCliente, IndirizzoDiConsegna, IndirizzoDiRitiro, DataRitiro, DataConsegna, MetodoDiPagamento, ImportodaPagare, StatoPrenotazione, idResponsabile) VALUES ('PREN001', 'CLNT001', 'Via Torino 4', 'Via Firenze 5', '2023-03-01', '2023-03-02', 'Carta di Credito', 1500.0, 'Confermata', 'RESP001');
INSERT INTO Prenotazioni (IDPrenotazione, IDCliente, IndirizzoDiConsegna, IndirizzoDiRitiro, DataRitiro, DataConsegna, MetodoDiPagamento, ImportodaPagare, StatoPrenotazione, idResponsabile) VALUES ('PREN002', 'CLNT002', 'Via Genova 6', 'Via Palermo 7', '2023-04-01', '2023-04-02', 'Bonifico Bancario', 2500.0, 'In attesa', 'RESP002');
INSERT INTO Prenotazioni (IDPrenotazione, IDCliente, IndirizzoDiConsegna, IndirizzoDiRitiro, DataRitiro, DataConsegna, MetodoDiPagamento, ImportodaPagare, StatoPrenotazione, idResponsabile) VALUES ('PREN003', 'CLNT003', 'Via Venezia 8', 'Via Bari 9', '2023-05-01', '2023-05-02', 'PayPal', 3500.0, 'Completata', NULL);

