create table profiles (
    id BIGINT primary key,
    bio text,
    date_of_birth date,
    phone_number varchar(15),
    loyalty_points integer unsigned default 0,
    foreign key (id) references users(id)
);
