create index IX_2932C9B on aaa_Farmers_Districts (idDistrict);
create index IX_FF4B21F0 on aaa_Farmers_Districts (idFarmer);

create index IX_F6BD9AB on aaa_id_asdt (idDistrict);
create index IX_998BD300 on aaa_id_asdt (idFarmer);

create index IX_82BAE474 on district (isArchived);
create index IX_A9A9AC93 on district (name);

create index IX_EBEB5310 on farmer (inn);
create index IX_16F88789 on farmer (isArchived);
create index IX_99508368 on farmer (name);