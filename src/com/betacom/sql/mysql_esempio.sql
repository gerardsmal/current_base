-- int -> integer
-- decimal -> decimal
-- char -> string di lunghezza fissa con max. 255
-- varchar -> string di lunghezza variabile con max. 65535
-- text -> string di lunghezza fissa con max. 65535
-- Date -> Data yyyy-mm-dd
-- DateTime -> Date yyyy-mm-dd hh:mm:ss
-- timestamp -> numero di secondo da l'inizio unix : 1970-01-'1 UTC

-- costraint
-- not null  -> no puo essere null
-- primary key -> valore univoca che identifica una riga
-- default  -> valore per default del campo
-- check   -> elenco valore possibile per il campo
-- foreign key -> chiave esterna verso un altra tabella
-- unique  -> questa valore deve essere unique nella tabella

drop table dipendenti;
create table dipendenti (
	id_dipendenti int auto_increment,
	nome varchar (100) not null,
	cognome varchar (100) not null,
	data_assunzione date not null,
	telefono varchar(10) not null unique,
	manzione varchar(50) default 'impiegato',
	stipendio decimal not null check (stipendio >= 1100 and stipendio <= 8000),
	primary key(id_dipendenti)
)

insert into dipendenti (nome, cognome, data_assunzione, telefono, stipendio)
	VALUES 
	("Paolo", "Berde", "2025-01-01","3481111113", 1500),
	("Augusto", "Bianco", "2025-02-01","3481111114", 2100),
	("Anna", "Azuro", "2025-03-01","3481111115", 1800),
	("Beatice", "Green", "2025-04-01","3481111116", 2020),
	("Luigi", "Yellow", "2025-05-01","3481111117", 1600);

select * FROM dipendenti order by stipendio

insert into dipendenti (nome, cognome, data_assunzione, telefono, stipendio, manzione)
	value
	("Bruna", "Tibo", "2024-04-01","3481111120", 1900, "Sviluppatore"),
	("Filippo", "Krano", "2024-10-01","3481111121", 2100, "Sviluppatore");

select count(*) FROM dipendenti where cognome like '%o%' 

/*
 * condizione 
 * 		=,  !=
			>
			<
			<=
			>
			IN. where county in (‘USA’, ‘FR’)
			BETWEEN.  Where rating between 3 and 5
			LIKE.  Where name LIKE ‘SM%”
            AND
			OR 
			NOT

 */

select * from dipendenti  where manzione = 'impiegato' and stipendio > 1900 order by stipendio limit 1

select *  from dipendenti where nome in ('Paolo', 'Bruna') and stipendio between 1500 and 1800


CREATE table clienti (
	id_cliente int not null auto_increment,
	denominazione varchar(255) not null,
	p_iva varchar(16) not null unique,
	inidirizzo varchar(255) not null,
	telefono varchar(10) not null unique,
	primary key(id_cliente)

)

insert into clienti(denominazione, p_iva, inidirizzo, telefono)
		values ("cie SrL", "0123456789","via suza 123 Torino", "346098345");
insert into clienti(denominazione, p_iva, inidirizzo, telefono)
		values ("abc SrL", "0123456780","via Roma 5 Torino", "346098346");	
insert into clienti(denominazione, p_iva, inidirizzo, telefono)
		values 
		("sei SrL", "1123456791","Corso Agnelli 12 Torino", "346098448"),	
		("sette SrL", "1123456792","via Lagrange 25 Torino", "346098449"),	
		("otto SrL", "1123456793","via Gorizia 32 Torino", "346098440");
		
/*
 * creazione tabella rapporto_clienti
 * id_rapporto primary key auto incremento
 * descrizione 255 non null
 */
		
drop table rapporto_clienti;		
create table rapporto_clienti(
	id_rapporto int auto_increment,
	descrizione varchar(255) not null,
	id_cliente int not null,
	id_dipendenti int not null,
	primary key(id_rapporto),
	foreign key (id_cliente) references clienti(id_cliente),
	foreign key (id_dipendenti) references dipendenti(id_dipendenti)
	)
	
insert into rapporto_clienti (descrizione, id_cliente, id_dipendenti)
	VALUES ("Rapporto numero 1", 4, 6),
			("Rapporto numero 2", 5, 3),
			("Rapporto numero 3", 1, 1);


select * from rapporto_clienti r 

delete from rapporto_clienti;

select * from dipendenti d 

select *  from clienti where denominazione in ("due SrL", "sette SrL" , "abc SrL")

select * from clienti c where c.id_cliente =2

update clienti set denominazione = "Pippo Srl", inidirizzo = "Corso Agnelli, 26 Torino"

-- delete from clienti

create table uffici (
 id_ufficio int not null auto_increment,
 nome_ufficio varchar(255) not null,
 primary key(id_ufficio) 
);

insert into uffici (nome_ufficio) values
   ("Amministrazione"),
   ("Vendite"),
   ("Human risorce"),
   ("Tecnico")
   
 select * FROM  uffici  
 
 
 create table test (
 	id int auto_increment,
 	nome varchar(100),
 	eta int,
 	primary key(id)
 	)
 
 -- alter table esempio	
 	
 alter table test
 	add salary decimal;
 
 alter table test 
     modify column eta int not null default 20;
 
 alter table test 
 	add commenti varchar (200) not null; 
 
 alter table test
 	drop column salary;
 
 alter table test 
 	modify column nome varchar(255) not null;
 
 alter table test 
 	rename column nome to nome_cliente;
 
 alter table test 
 	add sesso boolean
 	
alter table test
	modify column sesso int;

alter table academy_t 
	rename academy_test;

alter table dipendenti 
	add id_ufficio int;

select * from dipendenti d 

insert into dipendenti (nome, cognome, data_assunzione, telefono, stipendio, manzione)
	value
	("James", "Dean", "2025-01-01","3481111140", 2500, "Sviluppatore"),
	("Tim", "Basinger", "2024-10-01","3481111141", 2450, "Sviluppatore");

-- inner join
-- fa vedere solo le righe che corrispondono alle condizione del joi

select d.id_dipendenti, d.nome, d.cognome, u.nome_ufficio from dipendenti d
	inner join uffici as u on d.id_ufficio = u.id_ufficio

-- left join
-- fa vedere tutta la tabella di sinitra. Sulla tabella di destra  fa vedere solo quelli con 
-- corrispondenza alle condizione di join 

select d.id_dipendenti, d.nome, d.cognome, u.nome_ufficio from dipendenti d
	left join uffici u on d.id_ufficio  = u.id_ufficio
	
	
-- right join
-- fa vedere tutta la tabella di destra. Sulla tabella di sinostra fa vedere solo quelli con
-- corrispondenza alle condizione di join

select d.id_dipendenti, d.nome, d.cognome, u.nome_ufficio from dipendenti d 	
	right join uffici u on d.id_ufficio = u.id_ufficio
	
-- full join
-- left join + right join
	
select d.id_dipendenti, d.nome, d.cognome, u.nome_ufficio from dipendenti d
	left join uffici u on d.id_ufficio = u.id_ufficio
union 
select d.id_dipendenti, d.nome, d.cognome,u.nome_ufficio from dipendenti d
	right join uffici u on d.id_ufficio = u.id_ufficio
	
select * from rapporto_clienti r 

/*
 * rapporto_cliente
 * id_rapporto, descrizione, denominazione (nome_cliente), telefono (telefono_cliente), 
 * nome (nome_dipendente), cognome (cognome_dipendente), telefono (telefono_dipendente)
 */

select r.id_rapporto, r.descrizione, c.denominazione nome_cliente, c.telefono telefono_cliente,
	   d.nome nome_dipendente, d.cognome cognome_dipendente, d.telefono telefono_dipendente 
		from rapporto_clienti r
	left join clienti c  on c.id_cliente = r.id_cliente
	left join dipendenti d  on d.id_dipendenti  = r.id_dipendenti

-- Group by aggregare righe che hanno la stessa valore di campo
-- having permette di fare una selzione sul risultato del Group by	

select u.nome_ufficio, count(d.id_dipendenti) as totale_dipendenti
	from uffici u
	left join dipendenti d 
		 on d.id_ufficio = u.id_ufficio 
	group by u.nome_ufficio
	having totale_dipendenti = 0
	
/*
 * view
 */	
CREATE or Replace view ufficio_dipendenti as	
select u.id_ufficio, d.id_dipendenti , d.telefono, d.nome, d.cognome,  u.nome_ufficio , d.comune_nascita, c.code
from uffici u 
	left join dipendenti d 
		on d.id_ufficio = u.id_ufficio
	left join comune c
		on c.nome = d.comune_nascita
		
		
select * from ufficio_dipendenti u 	

/*
 * utilizzo d'una view per un join
 */
select r.id_rapporto, r.descrizione, c.denominazione nome_cliente, c.telefono telefono_cliente,
	   d.nome nome_dipendente, d.cognome cognome_dipendente, d.telefono telefono_dipendente ,
	   d.nome_ufficio, d.comune_nascita, d.code as codice_comune
		from rapporto_clienti r
	left join clienti c  on c.id_cliente = r.id_cliente
	left join ufficio_dipendenti d  on d.id_dipendenti  = r.id_dipendenti

-- Date yyyy-mm-dd
-- Time hh:mm:ss
-- DateTime yyyy-mm-dd hh:mm:ss
-- Timestamp yyy-mm-dd hh.mm:ss
-- year yyyy

drop table prova_date;
create table prova_date(
	id int primary key auto_increment,
	nome varchar(50),
	data_nascita Date not null,
	data_inserimento DateTime default current_timestamp,
	data_modifica Timestamp default current_timestamp on Update current_timestamp
)	

insert into prova_date (nome, data_nascita)
	values ("Luca", "1995-05-01");


update prova_date set nome='Alice' where id=1;

select * from prova_date;


/*
 * Format	Description
 * %a	Abbreviated weekday name (Sun to Sat)
 * %b	Abbreviated month name (Jan to Dec)
	%c	Numeric month name (0 to 12)
	%D	Day of the month as a numeric value, followed by suffix (1st, 2nd, 3rd, ...)
	%d	Day of the month as a numeric value (01 to 31)
	%e	Day of the month as a numeric value (0 to 31)
	%f	Microseconds (000000 to 999999)
	%H	Hour (00 to 23)
	%h	Hour (00 to 12)
	%I	Hour (00 to 12)
	%i	Minutes (00 to 59)
	%j	Day of the year (001 to 366)
	%k	Hour (0 to 23)
	%l	Hour (1 to 12)
	%M	Month name in full (January to December)
	%m	Month name as a numeric value (00 to 12)
	%p	AM or PM
	%r	Time in 12 hour AM or PM format (hh:mm:ss AM/PM)
	%S	Seconds (00 to 59)
	%s	Seconds (00 to 59)
	%T	Time in 24 hour format (hh:mm:ss)
	%U	Week where Sunday is the first day of the week (00 to 53)
	%u	Week where Monday is the first day of the week (00 to 53)
	%V	Week where Sunday is the first day of the week (01 to 53). Used with %X
	%v	Week where Monday is the first day of the week (01 to 53). Used with %x
	%W	Weekday name in full (Sunday to Saturday)
	%w	Day of the week where Sunday=0 and Saturday=6
	%X	Year for the week where Sunday is the first day of the week. Used with %V
	%x	Year for the week where Monday is the first day of the week. Used with %v
	%Y	Year as a numeric, 4-digit value
	%y	Year as a numeric, 2-digit value
*/

select pd.nome, DATE_FORMAT(pd.data_nascita,'%d/%m/%Y') from prova_date pd;
select pd.nome, DATE_FORMAT(pd.data_nascita,'%d %M %Y') from prova_date pd;
select pd.nome, YEAR(pd.data_nascita) from prova_date pd;


-- clone tabella

drop table dipendenti_bis;
create table dipendenti_bis (
	id_dipendenti int auto_increment,
	nome varchar (100) not null,
	cognome varchar (100) not null,
	telefono varchar(10) not null unique,
	manzione varchar(50) default 'impiegato',
	stipendio decimal not null check (stipendio >= 1100 and stipendio <= 8000),
	primary key(id_dipendenti)
)

insert into dipendenti_bis (nome, cognome,telefono, manzione, stipendio)
	(select nome, cognome, telefono, manzione, stipendio from dipendenti where stipendio > 1800)

select * from dipendenti_bis d 

-- clone tabella da un altra database
select count(*) from comune c 

drop table comune;
CREATE TABLE comune (
  id int NOT NULL AUTO_INCREMENT,
  nome varchar(250) DEFAULT NULL,
  province varchar(3) DEFAULT NULL,
  code varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

insert into comune (nome, province, code)
	(select nome, province, code from centrosportivo.commune)
	
select * from comune c where c.nome = "Genova";	

alter table dipendenti 
	add comune_nascita varchar(250) not null;


-- creazione index su campo d'una query
create Index comune_idx on comune (nome);

select distinct nome from dipendenti d 


-- tabella temporary
-- e' una tabella che si droppa alla fine sessione


CREATE temporary table clienti_temp (
	id_cliente int not null auto_increment,
	denominazione varchar(255) not null,
	p_iva varchar(16) not null unique,
	inidirizzo varchar(255) not null,
	telefono varchar(10) not null unique,
	primary key(id_cliente)

)

select * from clienti_temp;

insert into clienti_temp(denominazione, p_iva, inidirizzo, telefono)
		values 
		("sei SrL", "1123456791","Corso Agnelli 12 Torino", "346098448"),	
		("sette SrL", "1123456792","via Lagrange 25 Torino", "346098449"),	
		("otto SrL", "1123456793","via Gorizia 32 Torino", "346098440");
		