---
title: "IEntityFilter"
kind: "interface"
package: "com.hypixel.hytale.server.npc.corecomponents"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.IEntityFilter"
api_surface: false
extends: "RoleStateChange, IAnnotatedComponent"
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
public interface IEntityFilter extends RoleStateChange, IAnnotatedComponent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `IEntityFilter[]` | `EMPTY_ARRAY` |
| `` | `int` | `MINIMAL_COST` |
| `` | `int` | `LOW_COST` |
| `` | `int` | `MID_COST` |
| `` | `int` | `HIGH_COST` |
| `` | `int` | `EXTREME_COST` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `boolean` | `matchesEntity(@Nonnull Ref<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Role var3, @Nonnull Store<EntityStore> var4)` |
| `` | `int` | `cost()` |
| `static` | `void` | `prioritiseFilters(@Nonnull IEntityFilter[] filters)` |
