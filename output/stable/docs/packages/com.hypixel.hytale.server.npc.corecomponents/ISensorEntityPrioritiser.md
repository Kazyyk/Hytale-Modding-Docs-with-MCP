---
title: "ISensorEntityPrioritiser"
kind: "interface"
package: "com.hypixel.hytale.server.npc.corecomponents"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.ISensorEntityPrioritiser"
api_surface: false
extends: "RoleStateChange"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents`

```java
public interface ISensorEntityPrioritiser extends RoleStateChange
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `IEntityByPriorityFilter` | `getNPCPrioritiser()` |
| `` | `IEntityByPriorityFilter` | `getPlayerPrioritiser()` |
| `` | `Ref<EntityStore>` | `pickTarget(Ref<EntityStore> var1, Role var2, Vector3d var3, Ref<EntityStore> var4, Ref<EntityStore> var5, boolean var6, Store<EntityStore> var7)` |
| `` | `boolean` | `providesFilters()` |
| `` | `void` | `buildProvidedFilters(List<IEntityFilter> var1)` |
