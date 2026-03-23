---
title: "DataStore"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.datastore"
fqcn: "com.hypixel.hytale.server.core.universe.datastore.DataStore"
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
public interface DataStore<T>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `BuilderCodec<T>` | `getCodec()` |
| `@Nullable` | `T` | `load(String var1) throws IOException` |
| `` | `void` | `save(String var1, T var2)` |
| `` | `void` | `remove(String var1) throws IOException` |
| `` | `List<String>` | `list() throws IOException` |
| `@Nonnull default` | `Map<String,T>` | `loadAll() throws IOException` |
| `default` | `void` | `saveAll(Map<String,T> objectsToSave)` |
| `default` | `void` | `removeAll() throws IOException` |
