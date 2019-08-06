# Progetto Finale Corso Adecco Formazione

# Gestionale per istituto di Fisioterapia:
### Le funzionalità da implementare sono:
- **Anagrafiche** di tutti i tipi di utenti esclusi i gestori.
- **Terapie praticate** dall'istituto.
- **Terapie che ciascun medico / terapista è abilitato praticare** nell'istituto.
- **Ambulatori** con relativa lista delle terapie praticabili in base ad i macchinari presenti.
- **Prenotazione** di una terapie con indicazione di giorno ed ora della prenotazione.
- Calendario delle terapie disponibili in un arco temporale (*default settimana corrente*).

### Tipologia di Utenti:
- **Cliente**
- **Terapisti**
- **Gestore** (*supervisiona tutte le attività e può modificare tutte le prenotazioni*)

## Architettura
### Database oracle:
-  DDL e DML script (separati)

### Java realizzare un'applicazione Spring / Maven che preveda: 
- JPA (hibernate o eclipselink)
- REST API
- Per almeno una tabella di DB devono essere presenti tutte le operazioni di CRUD da API
- Repo del progetto mave, che deve buildare con maven e lanciare da linea di comando.

### Dovranno, inoltre, essere forniti:
- Disegno su carta dell'ipotetica interfaccia grafica che effettua le chiamate (mockup del frontend).
- Commenti esplicativi sui metodi del controller meno immediati.
- Una collection di postman contenente le chiamate implementate (*con relativo json da trasmettere*).

Tutti i membri del team devono saper presentare il lavoro del gruppo (e non solo la parte che hanno svolto direttamente) 
