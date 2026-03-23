---
title: "ResourceCommonAsset"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.common"
fqcn: "com.hypixel.hytale.server.core.asset.common.ResourceCommonAsset"
api_surface: false
extends: "CommonAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "common"
---

**Package:** `com.hypixel.hytale.server.core.asset.common`

```java
public class ResourceCommonAsset extends CommonAsset
```

A common asset backed by a Java classpath resource. Loads binary data via `Class.getResourceAsStream`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getPath()` |
| `@Nonnull @Override protected` | `CompletableFuture<byte[]>` | `getBlob0()` |
| `@Nullable public static` | `ResourceCommonAsset` | `of(@Nonnull Class<?> clazz, @Nonnull String path, @Nonnull String name)` |
