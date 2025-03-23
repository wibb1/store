create table tags (
    id int auto_increment primary key,
    name varchar(255) not null
);

create table user_tags (
    tag_id int not null,
    user_id bigint not null,
    primary key (tag_id, user_id),
    foreign key (tag_id) references tags(id) on delete cascade,
    foreign key (user_id) references users(id) on delete cascade
);
