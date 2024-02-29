-- Create schema if it does not exist
CREATE SCHEMA IF NOT EXISTS Traslochi;

-- Set the schema to use for subsequent operations
USE Traslochi;

-- Creating the 'Dipendente' table
CREATE TABLE IF NOT EXISTS Dipendente (
    IDDipendente VARCHAR(255) PRIMARY KEY,
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
     IDDipendente VARCHAR(255),  
     IndirizzoLavoro VARCHAR(255),  
    PRIMARY KEY (OrarioInizio, IDDipendente),
    FOREIGN KEY (IDDipendente) REFERENCES Dipendente(IDDipendente)
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

-- Creating the 'Prenotazione' table
CREATE TABLE IF NOT EXISTS Prenotazione (
    IDPrenotazione VARCHAR(255) PRIMARY KEY,
    IDCliente VARCHAR(255), 
    IndirizzoDiConsegna VARCHAR(255),
    IndirizzoDiRitiro VARCHAR(255),
    DataRitiro VARCHAR(255),
    DataConsegna VARCHAR(255),
    MetodoDiPagamento VARCHAR(50),
    ImportodaPagare DECIMAL(10, 2),
    StatoPrenotazione VARCHAR(50),
    FOREIGN KEY (IDCliente) REFERENCES Cliente(IDCliente)
);
 -- Inserimenti per la tabella Dipendente
INSERT INTO Dipendente (IDDipendente, Nome, Cognome, CF, Email, Password) VALUES ('DIPN001', 'Adam', 'Moutawakkil', 'RSSMRA85M01H501Z', 'adam.mout@bidons.it', 'lorifiuto');
INSERT INTO Dipendente (IDDipendente, Nome, Cognome, CF, Email, Password) VALUES ('DIPN002', 'Giovanni', 'Campagna', 'LCABNC82S18F205J', 'giovanni.campa@bidons.it', 'nonhostudiato');
INSERT INTO Dipendente (IDDipendente, Nome, Cognome, CF, Email, Password) VALUES ('DIPN003', 'Soufian', 'Sagdal', 'GVLGIA88D44A001S', 'souf.sag@bidons.it', 'esamisangue');

-- Inserimenti per la tabella Responsabile
INSERT INTO Responsabile (IDResponsabile, Nome, Cognome, CF, Email, Password) VALUES ('RESP001', 'Kirols', 'Ibrahim', 'BRHKLS02S09F205V', 'ibra@bidonsResp.it', 'adamgay');
INSERT INTO Responsabile (IDResponsabile, Nome, Cognome, CF, Email, Password) VALUES ('RESP002', 'Nikola', 'Manev', 'MNVNKI69E07F839K', 'niko@bidonsResp.it', 'adamgay');
INSERT INTO Responsabile (IDResponsabile, Nome, Cognome, CF, Email, Password) VALUES ('RESP003', 'Federico', 'Pasciutti', 'PSCTF80A41G2273H', 'richi@bidonsResp.it', 'adamgay');

-- Inserimenti per la tabella Cliente
INSERT INTO Cliente (IDCliente, Nome, Cognome, CF, Email, Password) VALUES ('CLNT001', 'Marco', 'Sordi', 'MCRCST76M04H501P', 'marco.sordi@email.com', 'password123');
INSERT INTO Cliente (IDCliente, Nome, Cognome, CF, Email, Password) VALUES ('CLNT002', 'Elisa', 'Finotti', 'LSIRSA89B55D969G', 'elisa.finotti@email.com', 'password123');
INSERT INTO Cliente (IDCliente, Nome, Cognome, CF, Email, Password) VALUES ('CLNT003', 'Alice', 'Viola', 'FDRCVL93M01L219Z', 'alice.viola@email.com', 'password123');

-- Inserimenti per la tabella Turno
INSERT INTO Turno (OrarioInizio, IDDipendente, IndirizzoLavoro) VALUES ('08:00:00', 'DIPN001', 'Via Roma 1');
INSERT INTO Turno (OrarioInizio, IDDipendente, IndirizzoLavoro) VALUES ('09:00:00', 'DIPN002', 'Corso Milano 2');
INSERT INTO Turno (OrarioInizio, IDDipendente, IndirizzoLavoro) VALUES ('10:00:00', 'DIPN003', 'Piazza Napoli 3');

-- Inserimenti per la tabella Prenotazioni
INSERT INTO Prenotazione (IDPrenotazione, IDCliente, IndirizzoDiConsegna, IndirizzoDiRitiro, DataRitiro, DataConsegna, MetodoDiPagamento, ImportodaPagare, StatoPrenotazione) VALUES ('PREN001', 'CLNT001', 'Via Torino 4', 'Via Firenze 5', '01-03-2023', '02-03-2023', 'Carta di Credito', 1500.0, 'Confermata');
INSERT INTO Prenotazione (IDPrenotazione, IDCliente, IndirizzoDiConsegna, IndirizzoDiRitiro, DataRitiro, DataConsegna, MetodoDiPagamento, ImportodaPagare, StatoPrenotazione) VALUES ('PREN002', 'CLNT002', 'Via Genova 6', 'Via Palermo 7', '01-04-2023', '02-04-2023', 'Carta di Credito', 2500.0, 'In attesa');
INSERT INTO Prenotazione (IDPrenotazione, IDCliente, IndirizzoDiConsegna, IndirizzoDiRitiro, DataRitiro, DataConsegna, MetodoDiPagamento, ImportodaPagare, StatoPrenotazione) VALUES ('PREN003', 'CLNT003', 'Via Venezia 8', 'Via Bari 9', '01-05-2023', '02-05-2023', 'Contanti', 3500.0, 'Completata');

