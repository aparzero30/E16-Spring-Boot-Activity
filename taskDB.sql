PGDMP                          {            taskDB    15.1    15.1 	    ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    18829    taskDB    DATABASE     ?   CREATE DATABASE "taskDB" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE "taskDB";
                postgres    false            ?            1259    18830 
   task_table    TABLE     ?   CREATE TABLE public.task_table (
    task_id integer NOT NULL,
    title character varying(250),
    description character varying(250),
    completed character varying(250)
);
    DROP TABLE public.task_table;
       public         heap    postgres    false            ?            1259    18841    task_table_seq    SEQUENCE     x   CREATE SEQUENCE public.task_table_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.task_table_seq;
       public          postgres    false            ?          0    18830 
   task_table 
   TABLE DATA           L   COPY public.task_table (task_id, title, description, completed) FROM stdin;
    public          postgres    false    214   ?       ?           0    0    task_table_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.task_table_seq', 51, true);
          public          postgres    false    215            f           2606    18836    task_table tasktable_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.task_table
    ADD CONSTRAINT tasktable_pkey PRIMARY KEY (task_id);
 C   ALTER TABLE ONLY public.task_table DROP CONSTRAINT tasktable_pkey;
       public            postgres    false    214            ?   @   x?3?tˬPN?IM.Qp?I?M?+?TP(I?(?M??LϳRH
?Ys:??䤖?r??qqq ?     