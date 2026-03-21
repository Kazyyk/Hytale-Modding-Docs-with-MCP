---
title: "DataStoreProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.datastore"
fqcn: "com.hypixel.hytale.server.core.universe.datastore.DataStoreProvider"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "datastore"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.universe.datastore`

```java
public interface DataStoreProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `BuilderCodecMapCodec<DataStoreProvider>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `DataStore<T>` | `create(BuilderCodec<T> var1)` |
