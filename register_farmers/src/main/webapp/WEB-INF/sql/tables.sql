create table aaa_Farmers_Districts (
	idDistrict LONG not null,
	idFarmer LONG not null,
	primary key (idDistrict, idFarmer)
);

create table aaa_id_asdt (
	idDistrict LONG not null,
	idFarmer LONG not null,
	primary key (idDistrict, idFarmer)
);

create table district (
	idDistrict LONG not null primary key,
	name VARCHAR(75) null,
	code_ INTEGER,
	isArchived BOOLEAN
);

create table farmer (
	idFarmer LONG not null primary key,
	name VARCHAR(75) null,
	isArchived BOOLEAN,
	idDistrictReg LONG,
	inn VARCHAR(75) null,
	ogrn VARCHAR(75) null,
	kpp VARCHAR(75) null,
	opf VARCHAR(75) null,
	date_ DATE null
);