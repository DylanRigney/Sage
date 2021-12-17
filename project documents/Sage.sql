-----------------------------------------------
--DROPPERS--

drop table if exists users;
drop table if exists user_predictions;

-----------------------------------------------
--CREATORS--

create table if not exists users (
    user_id serial primary key,
    username varchar(50),
    email varchar(100) unique not null,
    password varchar(50) not null,
    join_date DATE default CURRENT_DATE,
    points bigint default 0
    
);

create table if not exists user_predictions (
    prediction_id serial primary key,
    prediction_name varchar(30),
    subject varchar(30),
    description text,
    user_answer text not null,
    correct_answer text default null,
    prediction_result text default null check (prediction_result in ('correct', 'partially correct', 'incorrect')),
    start_date date default CURRENT_DATE,
    end_date date default null,
    predictor int references users(user_id) on delete set null
);

-----------------------------------------------
--POPULATORS--

--users--
insert into users values (default, 'Test User', 'test@email.com', 'pass', default, default);
    
--predictions--
insert into user_predictions values (default, 'test prediction', 'test subject', 'Who will win the super bowl?', 'Greenbay Packers', default, default, default, default, 1);


    


