---
title: "Motion"
kind: "interface"
package: "com.hypixel.hytale.server.npc.instructions"
fqcn: "com.hypixel.hytale.server.npc.instructions.Motion"
api_surface: false
extends: "RoleStateChange, IAnnotatedComponent"
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
public interface Motion extends RoleStateChange, IAnnotatedComponent
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `preComputeSteering(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider provider, @Nonnull Store<EntityStore> store)` |
| `` | `void` | `activate(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `void` | `deactivate(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `boolean` | `computeSteering( @Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nullable InfoProvider var3, double var4, @Nonnull Steering var6, @Nonnull ComponentAccessor<EntityStore> var7 )` |
