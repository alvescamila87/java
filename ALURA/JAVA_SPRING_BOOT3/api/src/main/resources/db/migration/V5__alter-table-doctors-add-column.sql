alter table doctors add column active tinyint;
update doctors set active = 1;