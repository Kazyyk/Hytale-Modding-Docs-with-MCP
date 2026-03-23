---
title: "TickingSystem"
kind: "class"
package: "com.hypixel.hytale.component.system.tick"
fqcn: "com.hypixel.hytale.component.system.tick.TickingSystem"
api_surface: true
extends: "System<ECS_TYPE>"
implements: ["TickableSystem<ECS_TYPE>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "tick"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system.tick`

```java
public abstract class TickingSystem<ECS_TYPE> extends System<ECS_TYPE> implements TickableSystem<ECS_TYPE>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public abstract` | `void` | `tick(float var1, int var2, @Nonnull Store<ECS_TYPE> var3)` |
