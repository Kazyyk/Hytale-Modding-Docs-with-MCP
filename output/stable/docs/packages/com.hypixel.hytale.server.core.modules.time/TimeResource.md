---
title: "TimeResource"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.time"
fqcn: "com.hypixel.hytale.server.core.modules.time.TimeResource"
api_surface: false
extends: "Resource<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "time"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.time`

```java
public class TimeResource implements Resource<EntityStore>
```

Resource tracking the current game time instant with support for time dilation modification.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ResourceType<EntityStore, TimeResource>` | `getResourceType()` |
| `public` | `float` | `getTimeDilationModifier()` |
| `public` | `void` | `setTimeDilationModifier(float timeDilationModifier)` |
| `public` | `Instant` | `getNow()` |
| `public` | `void` | `setNow(Instant now)` |
| `public` | `void` | `add(Duration duration)` |
| `public` | `void` | `add(long time, TemporalUnit unit)` |
