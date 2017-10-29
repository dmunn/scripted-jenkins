# Scripted Jenkins

This repository aims at providing stripped down examples of Jenkins scenarios for projects that I've worked on previously.

Currently this repository will provide examples for;

* [Parameterized downstream builds on other projects](downstreamParameterized/)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Currently my development environment consists of running a Jenkins docker image using Docker Compose. I'm not sure if Docker CE provides compose as part of the installation, if it doesn't then please follow the instructions provided in the link below.

* [Docker Community Edition](https://www.docker.com/community-edition#/download)
* [Docker Compose](https://docs.docker.com/compose/install/)

### Installing

Below you will find the steps required in starting and running the local development environment to utilise these example scripts.

Step 1

```
cd scripted-jenkins/
docker-compose up
```

Step 2
Begin the one time configuration procedure by following the link below;
* http://localhost:8090

*Note:*
* You will need to capture the password provided in the `stdout` when Jenkins has finished loading within the terminal where you ran `docker-compose up`

## Solar System Exploration, 1950s – 1960s

- [ ] Add documentation to the downstreamParameterized scripts directory

## Contributing

If you would like to add anything... ANYTHING at all then please don't hesitate to create a feature branch and submit a pull request, assigning me as the reviewer and I will try my best to look into it.

## Authors

* **David Munn** - *Initial work*

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used