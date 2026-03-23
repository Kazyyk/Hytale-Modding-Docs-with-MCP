---
title: "Sensor"
kind: "interface"
package: "com.hypixel.hytale.server.npc.instructions"
fqcn: "com.hypixel.hytale.server.npc.instructions.Sensor"
api_surface: false
extends: "RoleStateChange, IAnnotatedComponent, IComponentExecutionControl"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "npc"
  - "instructions"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.npc.instructions`

```java
public interface Sensor extends RoleStateChange, IAnnotatedComponent, IComponentExecutionControl
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `boolean` | `matches(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, double var3, @Nonnull Store<EntityStore> var5)` |
| `` | `void` | `done()` |
| `@Nullable` | `InfoProvider` | `getSensorInfo()` |
