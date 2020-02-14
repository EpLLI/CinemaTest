	
	CREATE TABLE public.director
(
    id integer NOT NULL,
    first_name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    birth_date date NOT NULL,
    CONSTRAINT director_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.director
    OWNER to postgres;

CREATE TABLE public.film
(
    id integer NOT NULL,
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    release_date date NOT NULL,
    genre character varying(50) COLLATE pg_catalog."default" NOT NULL,
    director_id integer NOT NULL DEFAULT 0,
    CONSTRAINT film_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;


ALTER TABLE public.film
    OWNER to postgres;

INSERT INTO public.director(
	id, first_name, last_name, birth_date)
	VALUES (1, 'Quentin', 'Tarantino', '1963-03-27');

INSERT INTO public.director(
	id, first_name, last_name, birth_date)
	VALUES (2, 'James', 'Cameron', '1954-08-16');
	
INSERT INTO public.director(
	id, first_name, last_name, birth_date)
	VALUES (3, 'Vasya', 'Pupkin', '1996-07-24');

INSERT INTO public.film(
	id, name, release_date, genre, director_id)
	VALUES (1, 'Once Upon a Time in Hollywood', '2019-05-21', 'Drama', 1);
	
INSERT INTO public.film(
	id, name, release_date, genre, director_id)
	VALUES (2, 'Pulp Fiction', '1994-05-21', 'Thriller', 1);
	
INSERT INTO public.film(
	id, name, release_date, genre, director_id)
	VALUES (3, 'Django Unchained', '2009-05-20', 'Action movie', 1);	
	
INSERT INTO public.film(
	id, name, release_date, genre, director_id)
	VALUES (4, 'Inglourious Basterds', '2009-05-20', 'Action movie', 1);	
	
INSERT INTO public.film(
	id, name, release_date, genre, director_id)
	VALUES (5, 'Reservoir Dogs', '1992-01-21', 'Thriller', 1);	
	
INSERT INTO public.film(
	id, name, release_date, genre, director_id)
	VALUES (6, 'Titanic', '1997-11-01', 'Drama', 2);	
	
