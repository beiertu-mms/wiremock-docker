# Wiremock in docker compose
[![license](https://img.shields.io/badge/license-MIT-blue?style=flat-square)](./LICENSE)

Start an instance of [wiremock](https://wiremock.org/) using [docker compose](https://docs.docker.com/compose/).

## Usage

Via [docker-compose](https://docs.docker.com/compose/)

```sh
docker-compose up
```

or the new [compose command](https://docs.docker.com/compose/reference/)

```sh
docker compose up
```

## Wiremock Mappings

Add your mappings json files under `wiremock/mappings` and any response payload under `wiremock/__files`.
If mappings or payload are changed, the container will need to be restarted.

```sh
docker compose restart
```

For example mappings, see [hello.json](./wiremock/mappings/hello.json) and [general.json](./wiremock/mappings/general.json).  
And their referenced response payload [hello.json response](./wiremock/__files/hello.json) and [not-found](./wiremock/__files/not-found.json).

For more information about the mappings, see the [Wiremock documentation](https://wiremock.org/docs/stubbing/).

