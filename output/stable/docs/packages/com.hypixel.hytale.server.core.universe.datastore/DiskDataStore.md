---
title: "DiskDataStore"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.datastore"
fqcn: "com.hypixel.hytale.server.core.universe.datastore.DiskDataStore"
api_surface: false
extends: null
implements: ["DataStore"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "datastore"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.datastore`

```java
public class DiskDataStore<T> implements DataStore
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String` | `EXTENSION` |
| `private static final` | `int` | `EXTENSION_LEN` |
| `private static final` | `String` | `EXTENSION_BACKUP` |
| `private static final` | `String` | `GLOB` |
| `private static final` | `String` | `GLOB_WITH_BACKUP` |
| `private final` | `HytaleLogger` | `logger` |
| `private final` | `Path` | `path` |
| `private final` | `BuilderCodec<T>` | `codec` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Path` | `getPath()` |
| `@Override public` | `BuilderCodec<T>` | `getCodec()` |
| `@Nullable @Override public` | `T` | `load(String id) throws IOException` |
| `@Override public` | `void` | `save(String id, T value)` |
| `@Override public` | `void` | `remove(String id) throws IOException` |
| `@Nonnull @Override public` | `List<String>` | `list() throws IOException` |
| `@Nonnull @Override public` | `Map<String,T>` | `loadAll() throws IOException` |
| `@Override public` | `void` | `removeAll() throws IOException` |
| `@Nullable protected` | `T` | `load0(Path path) throws IOException` |
| `@Nonnull protected static` | `Path` | `getPathFromId(Path path, String id)` |
| `@Nonnull protected static` | `Path` | `getBackupPathFromId(Path path, String id)` |
| `@Nonnull protected static` | `String` | `getIdFromPath(Path path)` |
