---
title: "EnvironmentChunk.BulkWriter"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.environment"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.environment.EnvironmentChunk.BulkWriter"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "environment"
---
**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.environment`

```java
public static class BulkWriter
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `EnvironmentChunk.BulkWriter.ColumnWriter[]` | `columnWriters` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BulkWriter()` |
| `public` | `EnvironmentChunk.BulkWriter.ColumnWriter` | `getColumnWriter(int x, int z)` |
| `public` | `void` | `write(@Nonnull EnvironmentChunk environmentChunk)` |
| `private static` | `void` | `transferCounts(@Nonnull Int2LongMap from, @Nonnull Int2LongMap into)` |
| `public` | `void` | `write(@Nonnull EnvironmentColumn environmentColumn)` |
| `public` | `void` | `count(int environmentId, int count)` |
| `public` | `void` | `intake(@Nonnull Int2IntFunction dataSource)` |
