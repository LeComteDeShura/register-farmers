#!/usr/bin/env bash
mvn clean package
cd register_farmers
mvn liferay:deploy
