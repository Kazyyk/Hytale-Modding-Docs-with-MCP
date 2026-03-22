---
title: "TickableSystem"
kind: "interface"
package: "com.hypixel.hytale.component.system.tick"
fqcn: "com.hypixel.hytale.component.system.tick.TickableSystem"
api_surface: true
extends: "ISystem<ECS_TYPE>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "tick"
  - "interface"
---

**Package:** `com.hypixel.hytale.component.system.tick`

```java
public interface TickableSystem<ECS_TYPE> extends ISystem<ECS_TYPE>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `tick(float var1, int var2, @Nonnull Store<ECS_TYPE> var3)` |
