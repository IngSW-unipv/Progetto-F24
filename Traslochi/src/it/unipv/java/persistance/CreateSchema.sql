-- Create schema if it does not exist
CREATE SCHEMA IF NOT EXISTS Traslochi;

-- Set the schema to use for subsequent operations
USE Traslochi;

-- Creating the 'Dipendente' table
CREATE TABLE IF NOT EXISTS Dipendente (
    idDipendente INT PRIMARY KEY,
    Nome VARCHAR(255),
    Cognome VARCHAR(255),
    CF VARCHAR(16) UNIQUE,
    Email VARCHAR(255) UNIQUE,
    Password VARCHAR(255)
);

-- Creating the 'Mezzo di Trasporto' table
CREATE TABLE IF NOT EXISTS MezzoDiTrasporto (
    IDMezzo INT PRIMARY KEY
    -- Include other attributes specific to the means of transport
);

-- Creating the 'Responsabile' table
CREATE TABLE IF NOT EXISTS Responsabile (
    IDResponsabile INT PRIMARY KEY,
    Nome VARCHAR(255),
    Cognome VARCHAR(255) 
);

-- Creating the 'Turno' table with corrected foreign key references
CREATE TABLE IF NOT EXISTS Turno (
    Orario TIME,
    IDResponsabile INT,
    idDipendente INT,
    IDMezzo INT,
    PRIMARY KEY (Orario, IDResponsabile),
    FOREIGN KEY (idDipendente) REFERENCES Dipendente(idDipendente),
    FOREIGN KEY (IDMezzo) REFERENCES MezzoDiTrasporto(IDMezzo),
    FOREIGN KEY (IDResponsabile) REFERENCES Responsabile(IDResponsabile)
);

-- Creating the 'Cliente' table
CREATE TABLE IF NOT EXISTS Cliente (
    IDCliente INT PRIMARY KEY,
    Nome VARCHAR(255),
    Cognome VARCHAR(255),
    CF VARCHAR(16) UNIQUE,
    Email VARCHAR(255) UNIQUE,
    Password VARCHAR(255)
    -- Include other attributes for the client
);

-- Creating the 'Prenotazioni' table
CREATE TABLE IF NOT EXISTS Prenotazioni (
    IDPrenotazione INT PRIMARY KEY,
    IDCliente INT,
    IndirizzoDiConsegna VARCHAR(255),
    DataRitiro DATE,
    DataConsegna DATE,
    MetodoDiPagamento VARCHAR(50),
    ImportoPagato INT(10, 2),
    StatoPrenotazione VARCHAR(50),
    FOREIGN KEY (IDCliente) REFERENCES Cliente(IDCliente)
);

-- Creating the 'USER' table
CREATE TABLE IF NOT EXISTS USER (
    CF VARCHAR(16),
    Nome VARCHAR(255),
    Cognome VARCHAR(255),
    Email VARCHAR(255) UNIQUE,
    Password VARCHAR(255),
    PRIMARY KEY (CF),
    FOREIGN KEY (CF) REFERENCES Dipendente(CF) 
    -- as a CF cannot be both a Dipendente and a Cliente at the same time in this structure
);