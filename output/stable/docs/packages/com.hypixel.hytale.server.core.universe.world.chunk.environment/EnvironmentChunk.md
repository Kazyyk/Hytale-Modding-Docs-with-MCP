---
title: "EnvironmentChunk"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.environment"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.environment.EnvironmentChunk"
api_surface: true
extends: null
implements:
  - "Component"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "environment"
---
**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.environment`

```java
public class EnvironmentChunk implements Component<ChunkStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `EnvironmentColumn[]` | `columns` |
| `private final` | `EnvironmentChunk.BulkWriter.ColumnWriter[]` | `columnWriters` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore, EnvironmentChunk>` | `getComponentType()` |
| `public` | `` | `EnvironmentChunk()` |
| `public` | `` | `EnvironmentChunk(int defaultId)` |
| `public` | `Component<ChunkStore>` | `clone()` |
| `public` | `int` | `get(int x, int y, int z)` |
| `public` | `EnvironmentColumn` | `get(int x, int z)` |
| `public` | `void` | `setColumn(int x, int z, int environmentId)` |
| `public` | `boolean` | `set(int x, int y, int z, int environmentId)` |
| `public` | `boolean` | `contains(int environmentId)` |
| `private` | `void` | `createIfNotExist(int environmentId)` |
| `private` | `void` | `incrementBlockCount(int internalId)` |
| `private` | `void` | `incrementBlockCount(int internalId, int count)` |
| `private` | `boolean` | `decrementBlockCount(int environmentId, long count)` |
| `private` | `byte[]` | `serialize()` |
| `private` | `void` | `deserialize(@Nonnull byte[] bytes)` |
| `public` | `byte[]` | `serializeProtocol()` |
| `public` | `void` | `trim()` |
| `private static` | `int` | `idx(int x, int z)` |
| `public` | `EnvironmentChunk.BulkWriter.ColumnWriter` | `getColumnWriter(int x, int z)` |
| `public` | `void` | `write(@Nonnull EnvironmentChunk environmentChunk)` |
| `private static` | `void` | `transferCounts(@Nonnull Int2LongMap from, @Nonnull Int2LongMap into)` |
| `public` | `void` | `write(@Nonnull EnvironmentColumn environmentColumn)` |
| `public` | `void` | `count(int environmentId, int count)` |
| `public` | `void` | `intake(@Nonnull Int2IntFunction dataSource)` |
