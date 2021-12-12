create TABLE public.user
(
    id           SERIAL PRIMARY KEY,
    login        varchar NULL,
    name         varchar NULL,
    surname      varchar NULL,
    password     varchar NULL,
    created_date timestamp        DEFAULT NULL,
    updated_date timestamp        DEFAULT NULL,
    delete       bool    NOT NULL DEFAULT false
);