---
title: "EntityMigration"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.migrations"
fqcn: "com.hypixel.hytale.server.core.modules.migrations.EntityMigration"
api_surface: false
extends: ~
implements: 
  - "Migration"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "migration"
---

**Package:** `com.hypixel.hytale.server.core.modules.migrations`

```java
public abstract class EntityMigration<T> implements Migration
```

Implementation of `Migration`.

## Fields

| Field | Type | Description |
|---|---|---|
| `tClass` | `Class<T>` | Class<T> field. |
| `extraInfoSupplier` | `IntFunction<ExtraInfo>` | IntFunction<ExtraInfo> field. |

## Constructors

| Constructor | Description |
|---|---|
| `EntityMigration(Class<T> tClass, IntFunction<ExtraInfo> extraInfoSupplier)` | Creates a new EntityMigration instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `run(WorldChunk chunk)` | `void` | public method. |
| `migrate(T var1)` | `boolean` | protected method. |
