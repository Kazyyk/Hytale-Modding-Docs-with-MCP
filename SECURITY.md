# Security Policy

## Scope

This project consists of:

- A documentation generation pipeline (offline tooling)
- A static documentation site (Cloudflare Pages)
- A remote MCP server (Cloudflare Workers)

The MCP server is the only publicly accessible attack surface.

## Reporting a Vulnerability

If you discover a security vulnerability in this project, please report it
responsibly. **Do not open a public issue.**

Email: **kaz@kobo.dev**

Please include:

- A description of the vulnerability
- Steps to reproduce
- The potential impact
- Any suggested fix (optional)

I will acknowledge receipt within 48 hours and aim to provide a fix or
mitigation plan within 7 days.

## What Qualifies

- Vulnerabilities in the MCP server that could allow unauthorized access,
  data exfiltration, or denial of service
- Injection attacks via crafted MCP queries that could affect the Worker
  or upstream Cloudflare services
- Exposure of sensitive configuration or credentials

## What Does Not Qualify

- Issues in third-party dependencies (report these upstream)
- Issues in Cloudflare's platform itself (report to Cloudflare)
- The content of the generated documentation (this is derived from
  publicly available game files)
- Rate limiting or availability concerns (the MCP server runs on
  Cloudflare's infrastructure with their built-in protections)

## Acknowledgments

I'm happy to credit security researchers who report valid vulnerabilities,
unless they prefer to remain anonymous.
