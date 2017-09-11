create table lookup (id bigint not null, description varchar(255), primary key (id))
create table parent (id bigint not null, info varchar(255), name varchar(255), lookup_id bigint, primary key (id))
alter table parent add constraint LK_FK foreign key (lookup_id) references lookup
