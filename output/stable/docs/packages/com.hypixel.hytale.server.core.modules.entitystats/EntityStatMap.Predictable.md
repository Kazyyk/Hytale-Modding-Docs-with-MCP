---
title: "EntityStatMap.Predictable"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.EntityStatMap.Predictable"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "networking"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats`

```java
public static enum EntityStatMap.Predictable
```

Controls client-side prediction for stat updates. When a stat change is predictable, the client can apply it immediately without waiting for server confirmation.

## Enum Constants

| Constant | Description |
|---|---|
| `NONE` | Not predictable by any viewer. |
| `SELF` | Predictable by the entity's own client only. |
| `ALL` | Predictable by all viewers (self and others). |
