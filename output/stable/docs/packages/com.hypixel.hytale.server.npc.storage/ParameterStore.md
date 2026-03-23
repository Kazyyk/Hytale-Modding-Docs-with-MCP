---
title: "ParameterStore"
kind: "abstract class"
package: "com.hypixel.hytale.server.npc.storage"
fqcn: "com.hypixel.hytale.server.npc.storage.ParameterStore"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "server"
  - "npc"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.npc.storage`

```java
public abstract class ParameterStore<Type extends PersistentParameter<?>>
```

Abstract base type in the ParameterStore hierarchy.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `get(Entity owner, String name)` | `Type` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `createParameter()` | `abstract Type` | Instance method. |
