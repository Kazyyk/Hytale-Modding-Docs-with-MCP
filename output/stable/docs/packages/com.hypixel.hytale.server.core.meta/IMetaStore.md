---
title: "IMetaStore"
kind: "interface"
package: "com.hypixel.hytale.server.core.meta"
fqcn: "com.hypixel.hytale.server.core.meta.IMetaStore"
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
public interface IMetaStore<K>
```

Defines the contract for IMetaStore operations.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `default <T>` | `T` | `getMetaObject(MetaKey<T> key)` |
| `@Nullable default <T>` | `T` | `getIfPresentMetaObject(MetaKey<T> key)` |
| `@Nullable default <T>` | `T` | `putMetaObject(MetaKey<T> key, T obj)` |
| `@Nullable default <T>` | `T` | `removeMetaObject(MetaKey<T> key)` |
| `@Nullable default <T>` | `T` | `removeSerializedMetaObject(MetaKey<T> key)` |
| `default` | `boolean` | `hasMetaObject(MetaKey<?> key)` |
| `default` | `void` | `forEachMetaObject(IMetaStore.MetaEntryConsumer consumer)` |
| `default` | `void` | `markMetaStoreDirty()` |
| `default` | `boolean` | `consumeMetaStoreDirty()` |
