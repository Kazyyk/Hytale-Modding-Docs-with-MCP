---
title: "Action"
kind: "interface"
package: "com.hypixel.hytale.server.npc.instructions"
fqcn: "com.hypixel.hytale.server.npc.instructions.Action"
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
public interface Action extends RoleStateChange, IAnnotatedComponent, IComponentExecutionControl
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `boolean` | `canExecute(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nullable InfoProvider var3, double var4, @Nonnull Store<EntityStore> var6)` |
| `` | `boolean` | `execute(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nullable InfoProvider var3, double var4, @Nonnull Store<EntityStore> var6)` |
| `` | `void` | `activate(Role var1, InfoProvider var2)` |
| `` | `void` | `deactivate(Role var1, InfoProvider var2)` |
| `` | `boolean` | `isActivated()` |
