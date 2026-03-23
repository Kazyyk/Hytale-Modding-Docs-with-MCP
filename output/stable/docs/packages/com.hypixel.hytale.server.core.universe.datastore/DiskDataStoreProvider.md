---
title: "DiskDataStoreProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.datastore"
fqcn: "com.hypixel.hytale.server.core.universe.datastore.DiskDataStoreProvider"
api_surface: false
extends: null
implements: ["DataStoreProvider"]
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
public class DiskDataStoreProvider implements DataStoreProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `ID` |
| `public static final` | `BuilderCodec<DiskDataStoreProvider>` | `CODEC` |
| `private` | `String` | `path` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `DataStore<T>` | `create(BuilderCodec<T> builderCodec)` |
| `@Nonnull @Override public` | `String` | `toString()` |
