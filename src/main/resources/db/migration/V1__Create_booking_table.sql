create table add_booking_event
(
    id            serial primary key,
    name          text not null,
    destination   text not null,
    creation_date TIMESTAMP default CURRENT_TIMESTAMP
)