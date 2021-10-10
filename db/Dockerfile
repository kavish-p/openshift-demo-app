FROM postgres:12

# Create the needed temp file before the first postgreSQL execution
RUN mkdir temp

# Create group and user
RUN groupadd non-root-postgres-group
RUN useradd non-root-postgres-user --group non-root-postgres-group

# Copy SQL file to run on initialization
COPY words.sql /docker-entrypoint-initdb.d/

# Set user rights to allow the non-root-postgres-user to access the temp folder
RUN chown -R non-root-postgres-user:non-root-postgres-group /temp
RUN chmod 777 /temp

# Set user rights to allow the non-root-postgres-user to access the temp folder
RUN chown -R non-root-postgres-user:non-root-postgres-group /docker-entrypoint-initdb.d
RUN chmod 777 /docker-entrypoint-initdb.d

# Change to non-root privilege
USER non-root-postgres
