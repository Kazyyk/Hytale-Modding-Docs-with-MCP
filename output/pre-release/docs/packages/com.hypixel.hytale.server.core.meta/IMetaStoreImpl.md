---
title: "IMetaStoreImpl"
kind: "interface"
package: "com.hypixel.hytale.server.core.meta"
fqcn: "com.hypixel.hytale.server.core.meta.IMetaStoreImpl"
api_surface: true
extends: null
implements: ["IMetaStore<K>"]
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
public interface IMetaStoreImpl<K> extends IMetaStore<K>
```

Defines the contract for IMetaStoreImpl operations. Extends `IMetaStore` with encoding, decoding, and registry access capabilities for meta object persistence.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `IMetaRegistry<K>` | `getRegistry()` |
| | `void` | `decode(BsonDocument var1, ExtraInfo var2)` |
| | `BsonDocument` | `encode(ExtraInfo var1)` |
| | `void` | `forEachUnknownEntry(BiConsumer<String, BsonValue> var1)` |
