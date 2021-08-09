create table m_animation
(
    id serial not null,
    title text not null,
    broadcast_start timestamp with time zone not null,
    broadcast_end timestamp with time zone not null,
    created_at timestamp with time zone,
    updated_at timestamp with time zone,
    primary key (id)
);
