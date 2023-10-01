alter table patients add column active tinyint;
update patients set active = 1;