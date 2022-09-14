# Event Contract Template

# Scope
Describe what types of data are included in this schema and how they should be interpreted. This description is valuable to get alignment between the Producers and Consumers about what we intend to message. 

# Initial Setup

## Example Directory Structure
```
<schema_repo_root>/
|- v1/
  |- <schema_name>-v1.schema.json             # The contract schema
  |- examples/
    |- <example_name>.json                    # an example payload that conforms to the schema
  |- docs/                                    # Generated documentation from the schema 
```
** This can be removed when you have actual files. This is defined here to assit the initial author.**

## Boilerplate to update
- [] Choose the name of the contract. This should be the suffix of the topic name minus the version. This is based on the naming strategy defined in the [Events Topic Standard](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1765998701/Event+Topic+Standards)
- [ ] Replace `ronin-contract-event-template` with the contract name in the following places:
  - [ ] `v1/ronin-contract-event-template.schema.json`
  - [ ] `.github/workflows/cicd.yaml`

# Usage
This contains a simple `Makefile` for automating validation and document generation.  
`make test`: Validate each versioned schema against all of its example files.
`make doc`: Compile human readable HTML documentation for each versioned schema
`make clean`: Cleans up all generated files

# Links
- [Event Contract Management Standard](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1797521454/Event+Contract+Management+Standard)
- [Ronin Event Standard](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1748041738/Ronin+Event+Standard)
- [Event Topic Standards](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1765998701/Event+Topic+Standards)
