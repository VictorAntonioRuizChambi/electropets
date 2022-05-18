--
-- PostgreSQL database dump
--

-- Dumped from database version 12.9 (Ubuntu 12.9-0ubuntu0.20.04.1)
-- Dumped by pg_dump version 12.9 (Ubuntu 12.9-0ubuntu0.20.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: cliente; Type: TABLE; Schema: public; Owner: electropets
--

CREATE TABLE public.cliente (
    id_cliente integer NOT NULL,
    ape_materno character varying(50),
    ape_paterno character varying(50),
    correo character varying(50),
    direccion character varying(300),
    estado character varying(2) NOT NULL,
    nombre1 character varying(50),
    nombre2 character varying(50),
    nombre3 character varying(50),
    num_documento character varying(30),
    razon_social character varying(250),
    telefono character varying(30),
    tipo_documento character varying(2)
);


ALTER TABLE public.cliente OWNER TO electropets;

--
-- Name: cliente_id_cliente_seq; Type: SEQUENCE; Schema: public; Owner: electropets
--

CREATE SEQUENCE public.cliente_id_cliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cliente_id_cliente_seq OWNER TO electropets;

--
-- Name: cliente_id_cliente_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: electropets
--

ALTER SEQUENCE public.cliente_id_cliente_seq OWNED BY public.cliente.id_cliente;


--
-- Name: detalle_venta; Type: TABLE; Schema: public; Owner: electropets
--

CREATE TABLE public.detalle_venta (
    id_detalle_venta integer NOT NULL,
    cantidad numeric(10,3) NOT NULL,
    estado character varying(2) NOT NULL,
    precio_venta_total numeric(10,3) NOT NULL,
    precio_venta_unitario numeric(10,3) NOT NULL,
    utilidad numeric(10,3) NOT NULL,
    id_presentacion integer NOT NULL,
    id_venta integer NOT NULL
);


ALTER TABLE public.detalle_venta OWNER TO electropets;

--
-- Name: detalle_venta_id_detalle_venta_seq; Type: SEQUENCE; Schema: public; Owner: electropets
--

CREATE SEQUENCE public.detalle_venta_id_detalle_venta_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.detalle_venta_id_detalle_venta_seq OWNER TO electropets;

--
-- Name: detalle_venta_id_detalle_venta_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: electropets
--

ALTER SEQUENCE public.detalle_venta_id_detalle_venta_seq OWNED BY public.detalle_venta.id_detalle_venta;


--
-- Name: diario; Type: TABLE; Schema: public; Owner: electropets
--

CREATE TABLE public.diario (
    id_diario integer NOT NULL,
    estado character varying(2) NOT NULL,
    fecha timestamp without time zone NOT NULL,
    monto numeric(10,3) NOT NULL,
    utilidad numeric(10,3) NOT NULL
);


ALTER TABLE public.diario OWNER TO electropets;

--
-- Name: diario_id_diario_seq; Type: SEQUENCE; Schema: public; Owner: electropets
--

CREATE SEQUENCE public.diario_id_diario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.diario_id_diario_seq OWNER TO electropets;

--
-- Name: diario_id_diario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: electropets
--

ALTER SEQUENCE public.diario_id_diario_seq OWNED BY public.diario.id_diario;


--
-- Name: flyway_schema_history; Type: TABLE; Schema: public; Owner: electropets
--

CREATE TABLE public.flyway_schema_history (
    installed_rank integer NOT NULL,
    version character varying(50),
    description character varying(200) NOT NULL,
    type character varying(20) NOT NULL,
    script character varying(1000) NOT NULL,
    checksum integer,
    installed_by character varying(100) NOT NULL,
    installed_on timestamp without time zone DEFAULT now() NOT NULL,
    execution_time integer NOT NULL,
    success boolean NOT NULL
);


ALTER TABLE public.flyway_schema_history OWNER TO electropets;

--
-- Name: pago; Type: TABLE; Schema: public; Owner: electropets
--

CREATE TABLE public.pago (
    id_pago integer NOT NULL,
    descripcion character varying(250),
    estado character varying(3) NOT NULL,
    monto numeric(10,3) NOT NULL,
    tipo_pago character varying(3) NOT NULL,
    id_venta integer NOT NULL
);


ALTER TABLE public.pago OWNER TO electropets;

--
-- Name: pago_id_pago_seq; Type: SEQUENCE; Schema: public; Owner: electropets
--

CREATE SEQUENCE public.pago_id_pago_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pago_id_pago_seq OWNER TO electropets;

--
-- Name: pago_id_pago_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: electropets
--

ALTER SEQUENCE public.pago_id_pago_seq OWNED BY public.pago.id_pago;


--
-- Name: parametro; Type: TABLE; Schema: public; Owner: electropets
--

CREATE TABLE public.parametro (
    id_parametro integer NOT NULL,
    cod_det_param character varying(3) NOT NULL,
    cod_param character varying(3) NOT NULL,
    desc_corta_param character varying(100) NOT NULL,
    desc_larga_param character varying(250) NOT NULL,
    estado character varying(2) NOT NULL,
    label_param character varying(50) NOT NULL,
    tip_param character varying(1) NOT NULL,
    value_param character varying(100) NOT NULL
);


ALTER TABLE public.parametro OWNER TO electropets;

--
-- Name: parametro_id_parametro_seq; Type: SEQUENCE; Schema: public; Owner: electropets
--

CREATE SEQUENCE public.parametro_id_parametro_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.parametro_id_parametro_seq OWNER TO electropets;

--
-- Name: parametro_id_parametro_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: electropets
--

ALTER SEQUENCE public.parametro_id_parametro_seq OWNED BY public.parametro.id_parametro;


--
-- Name: presentacion; Type: TABLE; Schema: public; Owner: electropets
--

CREATE TABLE public.presentacion (
    id_presentacion integer NOT NULL,
    descripcion character varying(250),
    estado character varying(2) NOT NULL,
    prec_costo numeric(10,3) NOT NULL,
    prec_venta_max numeric(10,3) NOT NULL,
    prec_venta_min numeric(10,3) NOT NULL,
    unidad_medida character varying(20),
    id_producto integer NOT NULL
);


ALTER TABLE public.presentacion OWNER TO electropets;

--
-- Name: presentacion_id_presentacion_seq; Type: SEQUENCE; Schema: public; Owner: electropets
--

CREATE SEQUENCE public.presentacion_id_presentacion_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.presentacion_id_presentacion_seq OWNER TO electropets;

--
-- Name: presentacion_id_presentacion_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: electropets
--

ALTER SEQUENCE public.presentacion_id_presentacion_seq OWNED BY public.presentacion.id_presentacion;


--
-- Name: producto; Type: TABLE; Schema: public; Owner: electropets
--

CREATE TABLE public.producto (
    id_producto integer NOT NULL,
    cod_producto character varying(20) NOT NULL,
    cod_rubro character varying(20) NOT NULL,
    cod_seccion character varying(20) NOT NULL,
    descripcion character varying(250),
    estado character varying(2) NOT NULL
);


ALTER TABLE public.producto OWNER TO electropets;

--
-- Name: producto_id_producto_seq; Type: SEQUENCE; Schema: public; Owner: electropets
--

CREATE SEQUENCE public.producto_id_producto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.producto_id_producto_seq OWNER TO electropets;

--
-- Name: producto_id_producto_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: electropets
--

ALTER SEQUENCE public.producto_id_producto_seq OWNED BY public.producto.id_producto;


--
-- Name: stock; Type: TABLE; Schema: public; Owner: electropets
--

CREATE TABLE public.stock (
    id_stock integer NOT NULL,
    cant_act numeric(10,3) NOT NULL,
    cant_min numeric(10,3) NOT NULL,
    estado character varying(2) NOT NULL,
    id_presentacion integer
);


ALTER TABLE public.stock OWNER TO electropets;

--
-- Name: stock_id_stock_seq; Type: SEQUENCE; Schema: public; Owner: electropets
--

CREATE SEQUENCE public.stock_id_stock_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.stock_id_stock_seq OWNER TO electropets;

--
-- Name: stock_id_stock_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: electropets
--

ALTER SEQUENCE public.stock_id_stock_seq OWNED BY public.stock.id_stock;


--
-- Name: venta; Type: TABLE; Schema: public; Owner: electropets
--

CREATE TABLE public.venta (
    id_venta integer NOT NULL,
    cod_comprobante character varying(20),
    descripcion character varying(250),
    estado character varying(2),
    fecha timestamp without time zone NOT NULL,
    total numeric(10,3) NOT NULL,
    utilidad numeric(10,3) NOT NULL,
    id_cliente integer NOT NULL
);


ALTER TABLE public.venta OWNER TO electropets;

--
-- Name: venta_id_venta_seq; Type: SEQUENCE; Schema: public; Owner: electropets
--

CREATE SEQUENCE public.venta_id_venta_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.venta_id_venta_seq OWNER TO electropets;

--
-- Name: venta_id_venta_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: electropets
--

ALTER SEQUENCE public.venta_id_venta_seq OWNED BY public.venta.id_venta;


--
-- Name: cliente id_cliente; Type: DEFAULT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.cliente ALTER COLUMN id_cliente SET DEFAULT nextval('public.cliente_id_cliente_seq'::regclass);


--
-- Name: detalle_venta id_detalle_venta; Type: DEFAULT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.detalle_venta ALTER COLUMN id_detalle_venta SET DEFAULT nextval('public.detalle_venta_id_detalle_venta_seq'::regclass);


--
-- Name: diario id_diario; Type: DEFAULT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.diario ALTER COLUMN id_diario SET DEFAULT nextval('public.diario_id_diario_seq'::regclass);


--
-- Name: pago id_pago; Type: DEFAULT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.pago ALTER COLUMN id_pago SET DEFAULT nextval('public.pago_id_pago_seq'::regclass);


--
-- Name: parametro id_parametro; Type: DEFAULT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.parametro ALTER COLUMN id_parametro SET DEFAULT nextval('public.parametro_id_parametro_seq'::regclass);


--
-- Name: presentacion id_presentacion; Type: DEFAULT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.presentacion ALTER COLUMN id_presentacion SET DEFAULT nextval('public.presentacion_id_presentacion_seq'::regclass);


--
-- Name: producto id_producto; Type: DEFAULT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.producto ALTER COLUMN id_producto SET DEFAULT nextval('public.producto_id_producto_seq'::regclass);


--
-- Name: stock id_stock; Type: DEFAULT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.stock ALTER COLUMN id_stock SET DEFAULT nextval('public.stock_id_stock_seq'::regclass);


--
-- Name: venta id_venta; Type: DEFAULT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.venta ALTER COLUMN id_venta SET DEFAULT nextval('public.venta_id_venta_seq'::regclass);


--
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: electropets
--

COPY public.cliente (id_cliente, ape_materno, ape_paterno, correo, direccion, estado, nombre1, nombre2, nombre3, num_documento, razon_social, telefono, tipo_documento) FROM stdin;
\.


--
-- Data for Name: detalle_venta; Type: TABLE DATA; Schema: public; Owner: electropets
--

COPY public.detalle_venta (id_detalle_venta, cantidad, estado, precio_venta_total, precio_venta_unitario, utilidad, id_presentacion, id_venta) FROM stdin;
\.


--
-- Data for Name: diario; Type: TABLE DATA; Schema: public; Owner: electropets
--

COPY public.diario (id_diario, estado, fecha, monto, utilidad) FROM stdin;
\.


--
-- Data for Name: flyway_schema_history; Type: TABLE DATA; Schema: public; Owner: electropets
--

COPY public.flyway_schema_history (installed_rank, version, description, type, script, checksum, installed_by, installed_on, execution_time, success) FROM stdin;
\.


--
-- Data for Name: pago; Type: TABLE DATA; Schema: public; Owner: electropets
--

COPY public.pago (id_pago, descripcion, estado, monto, tipo_pago, id_venta) FROM stdin;
\.


--
-- Data for Name: parametro; Type: TABLE DATA; Schema: public; Owner: electropets
--

COPY public.parametro (id_parametro, cod_det_param, cod_param, desc_corta_param, desc_larga_param, estado, label_param, tip_param, value_param) FROM stdin;
\.


--
-- Data for Name: presentacion; Type: TABLE DATA; Schema: public; Owner: electropets
--

COPY public.presentacion (id_presentacion, descripcion, estado, prec_costo, prec_venta_max, prec_venta_min, unidad_medida, id_producto) FROM stdin;
\.


--
-- Data for Name: producto; Type: TABLE DATA; Schema: public; Owner: electropets
--

COPY public.producto (id_producto, cod_producto, cod_rubro, cod_seccion, descripcion, estado) FROM stdin;
\.


--
-- Data for Name: stock; Type: TABLE DATA; Schema: public; Owner: electropets
--

COPY public.stock (id_stock, cant_act, cant_min, estado, id_presentacion) FROM stdin;
\.


--
-- Data for Name: venta; Type: TABLE DATA; Schema: public; Owner: electropets
--

COPY public.venta (id_venta, cod_comprobante, descripcion, estado, fecha, total, utilidad, id_cliente) FROM stdin;
\.


--
-- Name: cliente_id_cliente_seq; Type: SEQUENCE SET; Schema: public; Owner: electropets
--

SELECT pg_catalog.setval('public.cliente_id_cliente_seq', 1, false);


--
-- Name: detalle_venta_id_detalle_venta_seq; Type: SEQUENCE SET; Schema: public; Owner: electropets
--

SELECT pg_catalog.setval('public.detalle_venta_id_detalle_venta_seq', 1, false);


--
-- Name: diario_id_diario_seq; Type: SEQUENCE SET; Schema: public; Owner: electropets
--

SELECT pg_catalog.setval('public.diario_id_diario_seq', 1, false);


--
-- Name: pago_id_pago_seq; Type: SEQUENCE SET; Schema: public; Owner: electropets
--

SELECT pg_catalog.setval('public.pago_id_pago_seq', 1, false);


--
-- Name: parametro_id_parametro_seq; Type: SEQUENCE SET; Schema: public; Owner: electropets
--

SELECT pg_catalog.setval('public.parametro_id_parametro_seq', 1, false);


--
-- Name: presentacion_id_presentacion_seq; Type: SEQUENCE SET; Schema: public; Owner: electropets
--

SELECT pg_catalog.setval('public.presentacion_id_presentacion_seq', 1, false);


--
-- Name: producto_id_producto_seq; Type: SEQUENCE SET; Schema: public; Owner: electropets
--

SELECT pg_catalog.setval('public.producto_id_producto_seq', 1, false);


--
-- Name: stock_id_stock_seq; Type: SEQUENCE SET; Schema: public; Owner: electropets
--

SELECT pg_catalog.setval('public.stock_id_stock_seq', 1, false);


--
-- Name: venta_id_venta_seq; Type: SEQUENCE SET; Schema: public; Owner: electropets
--

SELECT pg_catalog.setval('public.venta_id_venta_seq', 1, false);


--
-- Name: cliente cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente);


--
-- Name: detalle_venta detalle_venta_pkey; Type: CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT detalle_venta_pkey PRIMARY KEY (id_detalle_venta);


--
-- Name: diario diario_pkey; Type: CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.diario
    ADD CONSTRAINT diario_pkey PRIMARY KEY (id_diario);


--
-- Name: flyway_schema_history flyway_schema_history_pk; Type: CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.flyway_schema_history
    ADD CONSTRAINT flyway_schema_history_pk PRIMARY KEY (installed_rank);


--
-- Name: pago pago_pkey; Type: CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.pago
    ADD CONSTRAINT pago_pkey PRIMARY KEY (id_pago);


--
-- Name: parametro parametro_pkey; Type: CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.parametro
    ADD CONSTRAINT parametro_pkey PRIMARY KEY (id_parametro);


--
-- Name: presentacion presentacion_pkey; Type: CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.presentacion
    ADD CONSTRAINT presentacion_pkey PRIMARY KEY (id_presentacion);


--
-- Name: producto producto_pkey; Type: CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_pkey PRIMARY KEY (id_producto);


--
-- Name: stock stock_pkey; Type: CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.stock
    ADD CONSTRAINT stock_pkey PRIMARY KEY (id_stock);


--
-- Name: venta venta_pkey; Type: CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.venta
    ADD CONSTRAINT venta_pkey PRIMARY KEY (id_venta);


--
-- Name: flyway_schema_history_s_idx; Type: INDEX; Schema: public; Owner: electropets
--

CREATE INDEX flyway_schema_history_s_idx ON public.flyway_schema_history USING btree (success);


--
-- Name: detalle_venta fk_detalleventa_presentacion; Type: FK CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT fk_detalleventa_presentacion FOREIGN KEY (id_presentacion) REFERENCES public.presentacion(id_presentacion);


--
-- Name: detalle_venta fk_detalleventa_venta; Type: FK CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT fk_detalleventa_venta FOREIGN KEY (id_venta) REFERENCES public.venta(id_venta);


--
-- Name: pago fk_pago_venta; Type: FK CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.pago
    ADD CONSTRAINT fk_pago_venta FOREIGN KEY (id_venta) REFERENCES public.venta(id_venta);


--
-- Name: presentacion fk_presentacion_producto; Type: FK CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.presentacion
    ADD CONSTRAINT fk_presentacion_producto FOREIGN KEY (id_producto) REFERENCES public.producto(id_producto);


--
-- Name: stock fk_stock_presentacion; Type: FK CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.stock
    ADD CONSTRAINT fk_stock_presentacion FOREIGN KEY (id_presentacion) REFERENCES public.presentacion(id_presentacion);


--
-- Name: venta fk_venta_cliente; Type: FK CONSTRAINT; Schema: public; Owner: electropets
--

ALTER TABLE ONLY public.venta
    ADD CONSTRAINT fk_venta_cliente FOREIGN KEY (id_cliente) REFERENCES public.cliente(id_cliente);


--
-- PostgreSQL database dump complete
--

