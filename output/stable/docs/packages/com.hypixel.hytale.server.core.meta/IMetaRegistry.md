---
title: "IMetaRegistry"
kind: "interface"
package: "com.hypixel.hytale.server.core.meta"
fqcn: "com.hypixel.hytale.server.core.meta.IMetaRegistry"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "meta"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.meta`

```java
public interface IMetaRegistry<K>
```

Defines the contract for IMetaRegistry operations. Manages registration, creation, and enumeration of meta objects keyed by `MetaKey`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `<T> T` | `newMetaObject(MetaKey<T> var1, K var2)` |
| | `void` | `forEachMetaEntry(IMetaStore<K> var1, IMetaRegistry.MetaEntryConsumer var2)` |
| `@Nullable` | `PersistentMetaKey<?>` | `getMetaKeyForCodecKey(String var1)` |
| | `<T> MetaKey<T>` | `registerMetaObject(Function<K, T> var1, boolean var2, String var3, Codec<T> var4)` |
| `default <T>` | `MetaKey<T>` | `registerMetaObject(Function<K, T> supplier, String keyName, Codec<T> codec)` |
| `default <T>` | `MetaKey<T>` | `registerMetaObject(Function<K, T> supplier)` |
| `default <T>` | `MetaKey<T>` | `registerMetaObject()` |
