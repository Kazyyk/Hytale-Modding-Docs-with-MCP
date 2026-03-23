---
title: "MigrationModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.migrations"
fqcn: "com.hypixel.hytale.server.core.modules.migrations.MigrationModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "migration"
---

**Package:** `com.hypixel.hytale.server.core.modules.migrations`

```java
public class MigrationModule extends JavaPlugin
```

Server module providing modules functionality.

## Fields

| Field | Type | Description |
|---|---|---|
| `instance` | `MigrationModule` | Static MigrationModule field. |
| `chunkColumnMigrationSystem` | `SystemType<ChunkStore, ChunkColumnMigrationSystem>` | SystemType<ChunkStore, ChunkColumnMigrationSystem> field. |
| `chunkSectionMigrationSystem` | `SystemType<ChunkStore, ChunkSectionMigrationSystem>` | SystemType<ChunkStore, ChunkSectionMigrationSystem> field. |

## Constructors

| Constructor | Description |
|---|---|
| `MigrationModule(@Nonnull JavaPluginInit init)` | Creates a new MigrationModule instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `MigrationModule` | static public method. |
| `setup()` | `void` | protected method. |
| `getChunkColumnMigrationSystem()` | `SystemType<ChunkStore, ChunkColumnMigrationSystem>` | public method. |
| `getChunkSectionMigrationSystem()` | `SystemType<ChunkStore, ChunkSectionMigrationSystem>` | public method. |
| `register(String id, Function<Path, Migration> migration)` | `void` | public method. |
| `runMigrations()` | `void` | public method. |
