---
title: "SchemaGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.schema"
fqcn: "com.hypixel.hytale.server.core.schema.SchemaGenerator"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "schema"
  - "generator"
  - "json"
---

**Package:** `com.hypixel.hytale.server.core.schema`

```java
public class SchemaGenerator
```

Generates JSON schemas for asset types and plugin configurations. Collects schemas from all registered `AssetStore` instances and `ConfigRegistration` entries, writes them to a `Schema/` directory, and generates VS Code `settings.json` for schema-to-file associations.