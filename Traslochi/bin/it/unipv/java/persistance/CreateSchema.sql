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
    IDResponsabile VARCHAR(255),
    idDipendente VARCHAR(255),  
    PRIMARY KEY (OrarioInizio, IDResponsabile),
    FOREIGN KEY (idDipendente) REFERENCES Dipendente(idDipendente),
    FOREIGN KEY (IDResponsabile) REFERENCES Responsabile(IDResponsabile)
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
 
