# Architecture decisions

## Scope
Executes an ordered allowlist of text transformations and reports each intermediate result.

## ADR 001 — Modular monolith
Use one Spring Boot process and a React client until workload or team boundaries justify service extraction. Keep domain logic independent from HTTP to simplify tests.

## ADR 002 — Deterministic baseline
The initial workflow requires no external model or credentials. Future AI outputs must be validated, bounded and evaluated against this baseline.

## Data and security
No persistence or authentication in v0.1. Limit input lengths and return generic validation errors. Public hosting requires rate limits, authentication and resource limits.

## Next milestones
Visual graph editor, DAG validation, persistent execution, MCP tools, LLMs and human approval.
