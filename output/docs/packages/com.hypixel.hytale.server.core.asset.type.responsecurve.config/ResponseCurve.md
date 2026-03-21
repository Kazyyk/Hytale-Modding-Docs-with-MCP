---
title: "ResponseCurve"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.responsecurve.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.responsecurve.config.ResponseCurve"
api_surface: false
extends: ~
implements: ["JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ResponseCurve>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "responsecurve"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.responsecurve.config`

```java
public abstract class ResponseCurve implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ResponseCurve>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetCodecMapCodec<String, ResponseCurve>` | `CODEC` |
| `public static final` | `BuilderCodec<ResponseCurve>` | `BASE_CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String, ResponseCurve, IndexedLookupTableAssetMap<String, ResponseCurve>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `extraData` |
| `protected` | `String` | `id` |
| `protected` | `WeakReference<ResponseCurve>` | `reference` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ResponseCurve(String id)` |
| `protected` | `ResponseCurve()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String, ResponseCurve, IndexedLookupTableAssetMap<String, ResponseCurve>>` | `getAssetStore()` |
| `public static` | `IndexedLookupTableAssetMap<String, ResponseCurve>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `WeakReference<ResponseCurve>` | `getReference()` |
| `public abstract` | `double` | `computeY(double var1)` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `ResponseCurve.Reference`
