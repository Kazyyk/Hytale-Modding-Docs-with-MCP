---
title: "ValidationOption"
kind: "enum"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.ValidationOption"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "validation"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public enum ValidationOption
```

Options controlling which world subsystems participate in validation checks.

## Enum Constants

| Constant | Description |
|---|---|
| `PHYSICS` | Validate physics state. |
| `BLOCKS` | Validate block data. |
| `BLOCK_STATES` | Validate block state metadata. |
| `ENTITIES` | Validate entity data. |
| `BLOCK_FILLER` | Validate filler block state. |
